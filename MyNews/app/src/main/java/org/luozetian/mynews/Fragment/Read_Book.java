package org.luozetian.mynews.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.luozetian.mynews.Fragment.smallFagment.RBone;
import org.luozetian.mynews.Fragment.smallFagment.RBtwo;
import org.luozetian.mynews.MyPageTransformer;
import org.luozetian.mynews.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sam on 2016/3/28.
 */
public class Read_Book extends Fragment{
    private View view;
    private ViewPager viewPager;
    private ImageView left_bg,right_bg;
    private TextView left_tv,right_tv;

    private List<Fragment> mData;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if(view == null){
            view = inflater.inflate(R.layout.read_book_fg,container,false);
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
        mData.add(new RBone());
        mData.add(new RBtwo());
        Myviewpager();
    }

    private void Myviewpager() {
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
        viewPager.setPageTransformer(true, new MyPageTransformer());
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

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

    private void findMyView() {
        viewPager = (ViewPager) view.findViewById(R.id.readbook_viewpager);
        left_bg = (ImageView) view.findViewById(R.id.left_bg);
        right_bg = (ImageView) view.findViewById(R.id.right_bg);
        right_tv = (TextView) view.findViewById(R.id.right_tv);
        left_tv = (TextView) view.findViewById(R.id.left_tv);
    }
}
