package org.luozetian.mynews.Fragment;

import android.graphics.Matrix;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;

import org.luozetian.mynews.Fragment.smallFagment.DingY;
import org.luozetian.mynews.Fragment.smallFagment.Picture;
import org.luozetian.mynews.Fragment.smallFagment.RBone;
import org.luozetian.mynews.MyPageTransformer;
import org.luozetian.mynews.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sam on 2016/3/28.
 */
public class Concern extends Fragment {
    private View view;
    private ViewPager viewPager;
    private ImageView left_bg, right_bg;
    private TextView left_tv, right_tv;


    private Handler handler = new Handler();
    private List<Fragment> mData;

    private int ilk;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (view == null) {
            view = inflater.inflate(R.layout.concern_fg, container, false);
        }
        findMyView();
        intoData();
        left_bg.setVisibility(View.VISIBLE);
        right_bg.setVisibility(View.INVISIBLE);
        viewPager.setCurrentItem(0);
        return view;
    }

    private void intoData() {
        mData = new ArrayList<>();
        mData.add(new Picture());
        mData.add(new DingY());
        viewPager.setPageTransformer(true, new MyPageTransformer());
        viewPager.setAdapter(new FragmentPagerAdapter(getFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return mData.get(position);
            }

            @Override
            public int getCount() {
                return mData.size();
            }
        });
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
//                yidong(position, positionOffset);
            }

            @Override
            public void onPageSelected(int position) {
                if (position == 0) {
                    left_bg.setVisibility(View.VISIBLE);
                    right_bg.setVisibility(View.INVISIBLE);
                } else {
                    right_bg.setVisibility(View.VISIBLE);
                    left_bg.setVisibility(View.INVISIBLE);
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });
        left_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                left_bg.setVisibility(View.VISIBLE);
                right_bg.setVisibility(View.INVISIBLE);
                viewPager.setCurrentItem(0);
            }
        });
        right_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                right_bg.setVisibility(View.VISIBLE);
                left_bg.setVisibility(View.INVISIBLE);
                viewPager.setCurrentItem(1);
            }
        });
    }

    private void yidong(int position, final float positionOffset) {
        int width = left_bg.getWidth();
        final TranslateAnimation ta = new TranslateAnimation(
                0, width * positionOffset,
                0,
                0);
        final TranslateAnimation ta2 = new TranslateAnimation(
                0, -width * positionOffset,
                0,
                0);
        ta.setDuration(100);
        ta2.setDuration(100);
        ta.setFillAfter(true);
        ta2.setFillAfter(true);
        handler.post(new Runnable() {
            @Override
            public void run() {
                if (ilk == 0) {
                    left_bg.startAnimation(ta);
                    left_bg.setVisibility(View.INVISIBLE);
                    Matrix m = new Matrix();
                    m.postTranslate(positionOffset,0);
                    right_bg.setImageMatrix(m);
                    left_bg.setVisibility(View.INVISIBLE);
                }
            }
        });
    }

    private void findMyView() {
        viewPager = (ViewPager) view.findViewById(R.id.concern_viewpager);
        left_tv = (TextView) view.findViewById(R.id.left_c_tv);
        left_bg = (ImageView) view.findViewById(R.id.left_c_bg);
        right_tv = (TextView) view.findViewById(R.id.right_c_tv);
        right_bg = (ImageView) view.findViewById(R.id.right_c_bg);

    }
}
