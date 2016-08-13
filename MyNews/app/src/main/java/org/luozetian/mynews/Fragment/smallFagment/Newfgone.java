package org.luozetian.mynews.Fragment.smallFagment;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.gson.Gson;

import org.luozetian.mynews.Adapter.NewsoneAdapter;
import org.luozetian.mynews.R;
import org.luozetian.mynews.Utils.MyThread;
import org.luozetian.mynews.Utils.OkHttpUtils;
import org.luozetian.mynews.been.NewsoneData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sam on 2016/3/29.
 */
public class Newfgone extends Fragment{
    private View view;
    private RecyclerView recyclerView;
    private NewsoneAdapter adapter;

    private String json,url;
    private Handler handler = new Handler();
    private NewsoneData newsoneData;
    private List<NewsoneData.DataBean.ListBean> mData;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if(view ==null){
            view = inflater.inflate(R.layout.newone,container,false);
        }
        recyclerView = (RecyclerView) view.findViewById(R.id.newsone_recyclerview);
        if(savedInstanceState!=null){
            NewsoneData.DataBean.ListBean[] keys = (NewsoneData.DataBean.ListBean[]) savedInstanceState.getParcelableArray("key");
            if(keys!=null&&keys.length!=0){
                mData = new ArrayList<>();
                for (int i = 0; i < keys.length; i++) {
                    mData.add(i,keys[i]);
                }
                recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
                adapter = new NewsoneAdapter(getActivity(),mData);
                recyclerView.setAdapter(adapter);
            }else{
                MyData();
            }
        }else{
            MyData();
        }
        return view;
    }

    private void MyData() {
        intoData();
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new NewsoneAdapter(getActivity(),mData);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        if(mData!=null){
            NewsoneData.DataBean.ListBean[] bytes = new NewsoneData.DataBean.ListBean[mData.size()];
            outState.putParcelableArray("key",mData.toArray(bytes));
        }
        super.onSaveInstanceState(outState);
    }

    private void intoData() {
        url = "http://api.sina.cn/sinago/list.json?uid=4080a38f666ad14b&loading_ad_timestamp=0&platfrom_version=4.4.2&wm=b207&oldchwm=12040_0003&imei=352284042662407&from=6049495012&connection_type=2&chwm=12040_0003&AndroidID=6572e89d2eadcde2d08a32277763938b&v=1&s=20&IMEI=fa8bd1d4892d37e4406b7ea4a6089c20&p=@&MAC=3c723febd7e059a8ad6ea24687124ea5&channel=news_sports";
        mData = new ArrayList<>();
        MyThread.getThread().execute(new Runnable() {
            @Override
            public void run() {
                json = OkHttpUtils.loadStringFromURL(url);
                if(json != null){
                    newsoneData = new Gson().fromJson(json,NewsoneData.class);
                    if(newsoneData.getData().getList()!=null){
                        mData.addAll(newsoneData.getData().getList());
                    }
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            adapter.notifyDataSetChanged();
                        }
                    });
                }
            }
        });
    }
}
