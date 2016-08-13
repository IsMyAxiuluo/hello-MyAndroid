package com.luozedian.or.ghoststories.Fragment;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;

import com.luozedian.or.ghoststories.Adapter.MRLVAdapter;
import com.luozedian.or.ghoststories.MyInterf.OnRefreshListener;
import com.luozedian.or.ghoststories.R;
import com.luozedian.or.ghoststories.Util.AppDeut;
import com.luozedian.or.ghoststories.Util.TheadUtil;
import com.luozedian.or.ghoststories.View.RefreshListView;
import com.luozedian.or.ghoststories.been.GhoststoriesEntry;
import com.luozedian.or.ghoststories.been.MyEvent;
import com.show.api.ShowApiRequest;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;


/**
 * Created by Administrator on 2016/6/21.
 */
public class EntryFragment extends Fragment {

    View mview;
    RefreshListView mRefreshListView;
    private MRLVAdapter mAdapter;
    String tabBunler;
    Handler mHandler = new Handler();
    ArrayList<GhoststoriesEntry> newsDatas;
    String pages = "1";
    int Maxpages;
    ArrayList<GhoststoriesEntry> mdata;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tabBunler = getArguments().getString("bundle");
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        EventBus.getDefault().register(this);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void StoriesEntry(String str) {
        tabBunler = str;
        newsDatas = null;
        newsDatas = new ArrayList<GhoststoriesEntry>();
        RefreshData();
        mAdapter.notifyDataSetChanged();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (mview == null) {
            mview = inflater.inflate(R.layout.entryfg, null, false);
        }
        newsDatas = new ArrayList<GhoststoriesEntry>();
        findView();
        try {
            issave(savedInstanceState);
        } catch (Exception e) {
            e.printStackTrace();
//            RefreshData();
            Log.d("xxx","发生异常啦啦啦啦啦");
            TheadUtil.showToast(getActivity(),mHandler,"小伙伴，突然找不到数据了，快去其他栏目找找，回来应该就有了");
        }
        mRefreshListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String id1 = mdata.get(position - 1).getId();
                String title = mdata.get(position - 1).getTitle();
                MyEvent myEvent = new MyEvent(id1, title);
                EventBus.getDefault().post(myEvent);
            }
        });
        mRefreshListView.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh() {
                // 异步查询数据
                new AsyncTask<Void, Void, Void>() {

                    @Override
                    protected Void doInBackground(Void... params) {
                        SystemClock.sleep(1000);
                        int i = Integer.valueOf(pages);
                        if (i < Maxpages) {
                            i++;
                        }
                        pages = String.valueOf(i);
                        RefreshData();
                        return null;
                    }

                    protected void onPostExecute(Void result) {
                        mAdapter.notifyDataSetChanged();
                        // 隐藏头布局
                        mRefreshListView.onRefreshFinish();
                        TheadUtil.showToast(getActivity(), mHandler, "更新中...");
                    }
                }.execute(new Void[]{});
            }

            @Override
            public void onLoadMoring() {
                new AsyncTask<Void, Void, Void>() {

                    @Override
                    protected Void doInBackground(Void... params) {
                        SystemClock.sleep(1000);
                        int i = Integer.valueOf(pages);
                        if (i < Maxpages) {
                            i = ++i;
                        }
                        pages = String.valueOf(i);
                        RefreshData();
                        return null;
                    }

                    @Override
                    protected void onPostExecute(Void result) {
                        super.onPostExecute(result);
                        mAdapter.notifyDataSetChanged();
                        mRefreshListView.onRefreshFinish();
                        TheadUtil.showToast(getActivity(), mHandler, "更新中...");
                    }

                }.execute(new Void[]{});
            }
        });
        return mview;
    }

    private void findView() {
        mRefreshListView = (RefreshListView) mview.findViewById(R.id.refreshlistview);
        TextView tv = (TextView) mview.findViewById(R.id.edio);
        mRefreshListView.setEmptyView(tv);

    }

    private void issave(Bundle savedInstanceState) {
        if (savedInstanceState != null) {
            Parcelable[] keys =  savedInstanceState.getParcelableArray("key");
            if (keys != null && keys.length != 0) {
                mdata = new ArrayList<>();
                for (int i = 0; i < keys.length; i++) {
                    mdata.add(i, (GhoststoriesEntry) keys[i]);
                }
                mAdapter = new MRLVAdapter(mdata, getActivity());
                mRefreshListView.setAdapter(mAdapter);
            } else {
                RefreshData();
            }
        } else {
            RefreshData();
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        if (mdata != null) {
            GhoststoriesEntry[] bytes = new GhoststoriesEntry[mdata.size()];
            outState.putParcelableArray("key", mdata.toArray(bytes));
        }
        super.onSaveInstanceState(outState);
    }

    private void RefreshData() {
        DownloadData();
    }

    private void DownloadData() {

        TheadUtil.mExecutorService.execute(new Runnable() {
            @Override
            public void run() {
                if (tabBunler == null) {
                    tabBunler = "dp";
                    pages = "1";
                }
                mdata = new ArrayList<GhoststoriesEntry>();
                String json = intoData(tabBunler, pages);
                try {
                    mdata.addAll(parseNewsListJson(json));
                    Maxpages = Integer.valueOf(mdata.get(0).getMaxResult());
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        mAdapter = new MRLVAdapter(mdata, getActivity());
                        mRefreshListView.setAdapter(mAdapter);
                        mAdapter.notifyDataSetChanged();
                        mRefreshListView.setSelection((Integer.valueOf(pages) - 1) * 10 - 1);
                    }
                });
            }
        });
    }

    private ArrayList<GhoststoriesEntry> parseNewsListJson(String json)
            throws JSONException {
        // 把字符串转换成json对象
        JSONObject jsonObject = new JSONObject(json);
        JSONObject paramz2 = jsonObject.getJSONObject("showapi_res_body");
        JSONObject paramz = paramz2.getJSONObject("pagebean");
        JSONArray feeds = paramz.getJSONArray("contentlist");
        String maxResult = paramz.getString("maxResult");
        for (int i = 0; i < feeds.length(); i++) {
            JSONObject newsJson = feeds.getJSONObject(i);
            String desc = newsJson.getString("desc");
            String id = newsJson.getString("id");
            String img = newsJson.getString("img");
            String link = newsJson.getString("link");
            String title = newsJson.getString("title");
            GhoststoriesEntry newsData = new GhoststoriesEntry(desc, id, img, link, title, maxResult);
            newsDatas.add(newsData);
        }
        return newsDatas;
    }

    public String intoData(String type, String page) {
        String appid = "20852";
        String secret = AppDeut.YYCJpeyskey;
        final String json = new ShowApiRequest("http://route.showapi.com/955-1", appid, secret)
                .addTextPara("type", type)
                .addTextPara("page", page)
                .post();
        return json;
    }
}
