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
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.squareup.picasso.Picasso;

import org.luozetian.mynews.Adapter.NewsoneAdapter;
import org.luozetian.mynews.R;
import org.luozetian.mynews.Utils.MyThread;
import org.luozetian.mynews.Utils.OkHttpUtils;
import org.luozetian.mynews.been.NewsoneData;
import org.luozetian.mynews.been.NewsthreeData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sam on 2016/3/29.
 */
public class Newfgthree extends Fragment {
    private View view;
    private ListView listView;

    private String json, url;
    private Handler handler = new Handler();
    private NewsthreeData newsthreeData;
    private List<NewsthreeData.DataBean.ColumnsBean> mData;
    private BaseAdapter adapter;
    private View inflate;

    private int kk = 2;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {
        if (view == null) {
            view = inflater.inflate(R.layout.newsthree, container, false);
            inflate = LayoutInflater.from(getActivity()).inflate(R.layout.addtop, null, false);
            kk = 3;
        }
        listView = (ListView) view.findViewById(R.id.thiree_listview);
        if(savedInstanceState!=null){
            NewsthreeData.DataBean.ColumnsBean[] keys = (NewsthreeData.DataBean.ColumnsBean[]) savedInstanceState.getParcelableArray("key");
            if(keys!=null&&keys.length!=0){
                mData = new ArrayList<>();
                for (int i = 0; i < keys.length; i++) {
                    mData.add(i,keys[i]);
                }
                Myadapter();
                listView.setAdapter(adapter);
            }else{
                regitMyData();
            }
        }else{
            regitMyData();
        }
        return view;
    }

    private void regitMyData() {
        if (kk == 3 && inflate!=null) {
            listView.addHeaderView(inflate);
            kk = 2;
        }
        intoData();
        Myadapter();
        listView.setAdapter(adapter);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
       if(mData!=null){
           NewsthreeData.DataBean.ColumnsBean[] bytes = new NewsthreeData.DataBean.ColumnsBean[mData.size()];
           outState.putParcelableArray("key",mData.toArray(bytes));
       }
        super.onSaveInstanceState(outState);
    }

    private void Myadapter() {
        adapter = new BaseAdapter() {
            @Override
            public int getCount() {
                return mData.size();
            }

            @Override
            public Object getItem(int position) {
                return mData.get(position);
            }

            @Override
            public long getItemId(int position) {
                return position;
            }

            @Override
            public View getView(final int position, View convertView, ViewGroup parent) {
                ViewHolder viewHolder;
                if (convertView == null) {
                    viewHolder = new ViewHolder();
                    convertView = LayoutInflater.from(getActivity()).inflate(R.layout.newsthreeitem, null, false);
                    viewHolder.tv = (TextView) convertView.findViewById(R.id.three_tv);
                    viewHolder.gr = (GridView) convertView.findViewById(R.id.three_gridview);
                    convertView.setTag(viewHolder);
                } else {
                    viewHolder = (ViewHolder) convertView.getTag();
                }
                addData(position, viewHolder);
                return convertView;
            }

            private void addData(final int position, ViewHolder viewHolder) {
                viewHolder.tv.setText("   " + mData.get(position).getName());
                viewHolder.gr.setAdapter(new BaseAdapter() {
                    @Override
                    public int getCount() {
                        return mData.get(position).getData_list().size();
                    }

                    @Override
                    public Object getItem(int positiontow) {
                        return mData.get(position).getData_list().get(positiontow);
                    }

                    @Override
                    public long getItemId(int positiontow) {
                        return positiontow;
                    }

                    @Override
                    public View getView(int positiontow, View convertViewtow, ViewGroup parenttow) {
                        convertViewtow = LayoutInflater.from(getActivity()).inflate(R.layout.gridview_item, parenttow, false);
                        ImageView image = (ImageView) convertViewtow.findViewById(R.id.gridview_image);
                        TextView tv1 = (TextView) convertViewtow.findViewById(R.id.gridview_name);
                        TextView tv2 = (TextView) convertViewtow.findViewById(R.id.gridview_title);
                        Picasso.with(getActivity()).load(mData.get(position).getData_list().get(positiontow).getAlbum_hor_small_pic()).into(image);
                        tv1.setText(mData.get(position).getData_list().get(positiontow).getAlbum_name());
                        tv2.setText(mData.get(position).getData_list().get(positiontow).getVideo_name());
                        return convertViewtow;
                    }
                });
            }

            class ViewHolder {
                TextView tv;
                GridView gr;
            }
        };
    }

    private void intoData() {
        url = "http://api.tv.sohu.com/v6/mobile/channelPageData/list.json?channel_id=71020000&plat=43&poid=1&api_key=85acf17fcd72d6a43813f80b61b5306b&sver=1.0&page_size=20&sysver=4.2.1&partner=1&cursor=0";
        mData = new ArrayList<>();
        MyThread.getThread().execute(new Runnable() {
            @Override
            public void run() {
                json = OkHttpUtils.loadStringFromURL(url);
                if (json != null) {
                    newsthreeData = new Gson().fromJson(json, NewsthreeData.class);
                    if (newsthreeData.getData().getColumns() != null) {
                        mData.addAll(newsthreeData.getData().getColumns());
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
