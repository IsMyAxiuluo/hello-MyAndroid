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

import org.luozetian.mynews.Adapter.PictureAdapter;
import org.luozetian.mynews.R;
import org.luozetian.mynews.Utils.MyThread;
import org.luozetian.mynews.Utils.OkHttpUtils;
import org.luozetian.mynews.been.PictureData;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by sam on 2016/3/22.
 */
public class Picture extends Fragment {

    View view;
    @Bind(R.id.picture_recyclerview)
    RecyclerView mrecyclerView;
    private PictureAdapter madapter;
    private List<PictureData.ListBean> mlists;

    private Handler handler = new Handler();
    private String json, url;
    private PictureData pictureData;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (view == null) {
            view = inflater.inflate(R.layout.picture, container, false);
            ButterKnife.bind(this, view);
        }
        if (savedInstanceState != null) {
            PictureData.ListBean[] keys = (PictureData.ListBean[]) savedInstanceState.getParcelableArray("key");
            if (keys !=null&&keys.length!=0) {
                mlists = new ArrayList<>();
                for (int i = 0; i <keys.length ; i++) {
                    mlists.add(i, keys[i]);
                }
                madapter = new PictureAdapter(getActivity(), mlists);
                mrecyclerView.setAdapter(madapter);
            }else{
                regitMyData();
            }
        } else {
            regitMyData();
        }
        return view;
    }

    private void regitMyData() {
        mrecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        url = "http://s.budejie.com/topic/list/jingxuan/10/budejie-android-6.3.3/" +
                "0-20.json?market=anzhi&udid=864394101867176&appname=baisibudejie&" +
                "os=4.4.2&client=android&visiting=&mac=18%3A67%3AB" +
                "0%3A20%3A71%3AF8&ver=6.3.3";
        intoData();
        madapter = new PictureAdapter(getActivity(), mlists);
        mrecyclerView.setAdapter(madapter);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        if (mlists != null) {
            PictureData.ListBean[] li = new PictureData.ListBean[mlists.size()];
            outState.putParcelableArray("key", mlists.toArray(li));
        }
        super.onSaveInstanceState(outState);
    }

    private void intoData() {
        mlists = new ArrayList<>();
        MyThread.getThread().execute(new Runnable() {
            @Override
            public void run() {
                json = OkHttpUtils.loadStringFromURL(url);
                pictureData = new Gson().fromJson(json, PictureData.class);
                if (pictureData.getList() != null) {
                    mlists.addAll(pictureData.getList());
                }
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        madapter.notifyDataSetChanged();
                    }
                });
            }
        });
    }
}
