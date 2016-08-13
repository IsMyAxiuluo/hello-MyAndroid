package org.luozetian.mynews.Fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.luozetian.mynews.Fragment.smallFagment.Newfgone;
import org.luozetian.mynews.Fragment.smallFagment.Newfgthree;
import org.luozetian.mynews.Fragment.smallFagment.Newfgtow;
import org.luozetian.mynews.Fragment.smallFagment.NewsJunShi;
import org.luozetian.mynews.Fragment.smallFagment.NewsOne;
import org.luozetian.mynews.Fragment.smallFagment.Picture;
import org.luozetian.mynews.Fragment.smallFagment.RBone;
import org.luozetian.mynews.MyPageTransformer;
import org.luozetian.mynews.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sam on 2016/3/28.
 */
public class News_Fg extends Fragment {
    private View view;
    private LinearLayout ll;
    private ViewPager viewpager;

    private List<Fragment> mData;

    String[] text = {"新闻", "最新", "体育", "球场", "军事", "宝库", "搞笑", "看图", "吐槽"};
    private int childCount;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (view == null) {
            view = inflater.inflate(R.layout.news_fg, container, false);
        }
        FindMyView();
        intoData();
        MyLayoutSeletor();
        viewpager.setCurrentItem(0);
        return view;
    }

    private void intoData() {
        mData = new ArrayList<>();
        mData.add(new NewsOne());
        mData.add(new Newfgone());
        mData.add(new Picture());
        mData.add(new Newfgone());
        mData.add(new NewsJunShi());
        mData.add(new Newfgthree());
        mData.add(new Picture());
        mData.add(new NewsJunShi());
        mData.add(new Newfgone());
        MyViewPager();
    }

    private void MyViewPager() {
        viewpager.setAdapter(new FragmentStatePagerAdapter(getFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return mData.get(position);
            }

            @Override
            public int getCount() {
                return mData.size();
            }
        });
        viewpager.setPageTransformer(true, new MyPageTransformer());
        viewpager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageSelected(int position) {
                for (int i = 0; i < childCount; i++) {
                    final View child_view = ll.getChildAt(i);
                    child_view.setTag(i);
                    if (position == (int) (child_view.getTag())) {
                        Change(child_view);
                    }
                }
//                myView.setVisibility(View.VISIBLE);
//                TranslateAnimation ta = new TranslateAnimation(
//                        0,ll.getChildAt(0).getWidth(),
//                        0,
//                        0);
//                ta.setDuration(2000);
//                ta.setFillAfter(true);
//
//                myView.startAnimation(ta);
//                handler.post(new Runnable() {
//                    @Override
//                    public void run() {
//                        myView.setVisibility(View.GONE);
//                    }
//                });
            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });
    }

    private void MyLayoutSeletor() {
        childCount = ll.getChildCount();
        ((View) ll.getChildAt(0)).findViewById(R.id.xuanzhongkuangkuang)
                .setVisibility(View.VISIBLE);
        TextView myfirsttv = (TextView) ((View) ll.getChildAt(0))
                .findViewById(R.id.mytext);
        myfirsttv.setTextColor(Color.RED);

        for (int i = 0; i < childCount; i++) {
            final View child_view = ll.getChildAt(i);
            child_view.setTag(i);
            child_view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Change(child_view);
                    int j = (int) child_view.getTag();
                    viewpager.setCurrentItem(j);
                }
            });
        }
    }

    private void Change(View child_view) {
        for (int i = 0; i < childCount; i++) {
            ((View) ll.getChildAt(i)).findViewById(R.id.xuanzhongkuangkuang)
                    .setVisibility(View.INVISIBLE);
            TextView mytv = (TextView) ((View) ll.getChildAt(i))
                    .findViewById(R.id.mytext);
            mytv.setTextColor(Color.BLACK);
        }
        child_view.findViewById(R.id.xuanzhongkuangkuang).setVisibility(View.VISIBLE);
        TextView myfirsttv = (TextView) child_view.findViewById(R.id.mytext);
        myfirsttv.setTextColor(Color.RED);
    }

    private void FindMyView() {
        viewpager = (ViewPager) view.findViewById(R.id.newsfg_viewpager);
        ll = (LinearLayout) view.findViewById(R.id.ll);
        for (int i = 0; i < text.length; i++) {
            View text_view = LayoutInflater.from(getActivity()).inflate(R.layout.textxml, null, false);
            TextView tv = (TextView) text_view.findViewById(R.id.mytext);
            tv.setText(text[i]);
            ll.addView(text_view);
        }
    }
}
