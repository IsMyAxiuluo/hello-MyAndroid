package org.luozetian.mynews.Fragment.smallFagment;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.squareup.picasso.Picasso;

import org.luozetian.mynews.R;
import org.luozetian.mynews.Utils.MyThread;
import org.luozetian.mynews.Utils.OkHttpUtils;
import org.luozetian.mynews.View.RefreshListView;
import org.luozetian.mynews.been.NewsData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sam on 2016/3/31.
 */
public class NewsJunShi extends Fragment {

    private View mview;
    private RefreshListView mrefreshListView;

    private NewsData newsData;
    private List<NewsData.DataBean.NewsListBean> mData;
    private MyAdapter adapter;
    private Handler handler = new Handler();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (mview == null) {
            mview = inflater.inflate(R.layout.newsone, null, false);
        }
        mrefreshListView = (RefreshListView) mview.findViewById(R.id.refreshlistview);
        if (savedInstanceState != null) {
            NewsData.DataBean.NewsListBean[] keys = (NewsData.DataBean.NewsListBean[]) savedInstanceState.getParcelableArray("key");
            if(keys!=null&&keys.length!=0){
                mData = new ArrayList<>();
                for (int i = 0; i < keys.length; i++) {
                    mData.add(i,keys[i]);
                }
                adapter = new MyAdapter();
                mrefreshListView.setAdapter(adapter);
                mrefreshListView.setOnRefreshListener(new RefreshListView.OnRefreshListener() {
                    @Override
                    public void onPullRefresh() {
                        mrefreshListView.completeRefresh();
                    }

                    @Override
                    public void onLoadingMore() {
                        mrefreshListView.completeRefresh();
                    }
                });
            }else{
                regimydata();
            }
        } else {
            regimydata();
        }
        return mview;
    }

    private void regimydata() {
        intoData();
        adapter = new MyAdapter();
        mrefreshListView.setAdapter(adapter);
        mrefreshListView.setOnRefreshListener(new RefreshListView.OnRefreshListener() {
            @Override
            public void onPullRefresh() {
                mrefreshListView.completeRefresh();
            }

            @Override
            public void onLoadingMore() {
                mrefreshListView.completeRefresh();
            }
        });
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        if(mData!=null) {
            NewsData.DataBean.NewsListBean[] bytes = new NewsData.DataBean.NewsListBean[mData.size()];
            outState.putParcelableArray("key", mData.toArray(bytes));
        }
    }

    private void intoData() {
        mData = new ArrayList<>();
        final String url = "http://api.wap.miercn.com/api/apps/index.php?controller=newslist&action=cms_news_list&page=@&list=3&plat=android&proct=mierapp&versioncode=6&user_id=0&device_uuid=fa8bd1d4892d37e4406b7ea4a6089c20&os_version=SM-N9008,4.4.2&app_version=2.3.2.5";
        MyThread.getThread().execute(new Runnable() {
            @Override
            public void run() {
                String json = OkHttpUtils.loadStringFromURL(url);
                if (json != null) {
                    newsData = new Gson().fromJson(json, NewsData.class);
                    if (newsData.getData() != null) {
                        mData.addAll(newsData.getData().getNewsList());
                        handler.post(new Runnable() {
                            @Override
                            public void run() {
                                adapter.notifyDataSetChanged();
                            }
                        });
                    }
                }
            }
        });
    }

    class MyAdapter extends BaseAdapter {

        /**
         * How many items are in the data set represented by this Adapter.
         *
         * @return Count of items.
         */
        @Override
        public int getCount() {
            return mData.size();
        }

        /**
         * Get the data item associated with the specified position in the data set.
         *
         * @param position Position of the item whose data we want within the adapter's
         *                 data set.
         * @return The data at the specified position.
         */
        @Override
        public Object getItem(int position) {
            return mData.get(position);
        }

        /**
         * Get the row id associated with the specified position in the list.
         *
         * @param position The position of the item within the adapter's data set whose row id we want.
         * @return The id of the item at the specified position.
         */
        @Override
        public long getItemId(int position) {
            return position;
        }


        /**
         * Get a View that displays the data at the specified position in the data set. You can either
         * create a View manually or inflate it from an XML layout file. When the View is inflated, the
         * parent View (GridView, ListView...) will apply default layout parameters unless you use
         * {@link LayoutInflater#inflate(int, ViewGroup, boolean)}
         * to specify a root view and to prevent attachment to the root.
         *
         * @param position    The position of the item within the adapter's data set of the item whose view
         *                    we want.
         * @param convertView The old view to reuse, if possible. Note: You should check that this view
         *                    is non-null and of an appropriate type before using. If it is not possible to convert
         *                    this view to display the correct data, this method can create a new view.
         *                    Heterogeneous lists can specify their number of view types, so that this View is
         *                    always of the right type (see {@link #getViewTypeCount()} and
         *                    {@link #getItemViewType(int)}).
         * @param parent      The parent that this view will eventually be attached to
         * @return A View corresponding to the data at the specified position.
         */
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ViewHoder mviewHoder;
            if (convertView == null) {
                convertView = LayoutInflater.from(getActivity()).inflate(R.layout.junshiitem, null, false);
                mviewHoder = new ViewHoder();
                mviewHoder.image = (ImageView) convertView.findViewById(R.id.news_imgId);
                mviewHoder.tv1 = (TextView) convertView.findViewById(R.id.news_titleId);
                mviewHoder.tv2 = (TextView) convertView.findViewById(R.id.news_contentid);
                convertView.setTag(mviewHoder);
            } else {
                mviewHoder = (ViewHoder) convertView.getTag();
            }
            if (!mData.get(position).getPicOne().equals("")) {
                Picasso.with(getActivity()).load(mData.get(position).getPicOne()).into(mviewHoder.image);
            }
            mviewHoder.tv1.setText(mData.get(position).getTitle());
            mviewHoder.tv2.setText(mData.get(position).getSummary());
            return convertView;
        }

        class ViewHoder {
            ImageView image;
            TextView tv1, tv2;
        }
    }

}
