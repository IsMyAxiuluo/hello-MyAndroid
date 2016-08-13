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
import android.widget.Toast;

import com.google.gson.Gson;

import org.luozetian.mynews.Adapter.NewstowAdapter;
import org.luozetian.mynews.R;
import org.luozetian.mynews.Utils.MyThread;
import org.luozetian.mynews.Utils.OkHttpUtils;
import org.luozetian.mynews.been.NewstowData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sam on 2016/3/29.
 */
public class RBone extends Fragment{
    private View view;
    private RecyclerView recyclerView;
    private NewstowAdapter adapter;

    private String json,url;
    private Handler handler = new Handler();
    private NewstowData newstowData;
    private List<NewstowData.StoriesBean> mData;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if(view ==null){
            view = inflater.inflate(R.layout.read_book_one,container,false);
        }
        recyclerView = (RecyclerView) view.findViewById(R.id.readbook_recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        if(savedInstanceState!=null){
            NewstowData.StoriesBean[] keys = (NewstowData.StoriesBean[]) savedInstanceState.getParcelableArray("key");
            if(keys!=null&&keys.length!=0){
                mData = new ArrayList<>();
                for (int i = 0; i < keys.length; i++) {
                    mData.add(i,keys[i]);
                }
                adapter = new NewstowAdapter(getActivity(),mData);
                recyclerView.setAdapter(adapter);
            }else{
                intoData();
            }
        }else{
            intoData();
        }
        return view;
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        if(mData==null){
            return;
        }
        NewstowData.StoriesBean[] bytes = new NewstowData.StoriesBean[mData.size()];
        outState.putParcelableArray("key",mData.toArray(bytes));
        super.onSaveInstanceState(outState);
    }

    private void intoData() {
        url = "http://news-at.zhihu.com/api/4/theme/4";
        // 下一页数据: http://news-at.zhihu.com/api/4/theme/4/before/7968334   before上一页的最后一条的数据id
        mData = new ArrayList<>();
        MyThread.getThread().execute(new Runnable() {
            @Override
            public void run() {
                json = OkHttpUtils.loadStringFromURL(url);
                if(json != null){
                    newstowData = new Gson().fromJson(json,NewstowData.class);
                    if(newstowData.getStories()!=null){
                        mData.addAll(newstowData.getStories());
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
        adapter = new NewstowAdapter(getActivity(),mData);
        recyclerView.setAdapter(adapter);
    }
}
