package com.luozedian.or.ghoststories;

import android.animation.ObjectAnimator;
import android.content.Intent;

import android.graphics.Color;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.luozedian.or.ghoststories.Fragment.EntryFragment;
import com.luozedian.or.ghoststories.Util.AppDeut;
import com.luozedian.or.ghoststories.been.MyEvent;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.ArrayList;
import java.util.List;

import cn.bmob.v3.Bmob;
import cn.bmob.v3.update.BmobUpdateAgent;
import cn.waps.AdInfo;
import cn.waps.AppConnect;

public class MainActivity extends AppCompatActivity {

    ViewPager mviewPager;
    String[] tabarray;
    List<Fragment> mFragments;
    TextView dp, cp, xy, yy, jl, mj, ly, yc, nh;
    String[] tabBundle = {"dp", "cp", "xy", "yy", "jl", "mj", "ly", "yc", "neihanguigushi"};
    private List<TextView> tvs;
    private static int currentItem;
    ImageView mview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EventBus.getDefault().register(this);
        AppConnect.getInstance(this);
        tvs = new ArrayList<TextView>();
        FindView();
        Bmob.initialize(this, AppDeut.YYCJpeybkey);
        BmobUpdateAgent.update(this);
        BmobUpdateAgent.setUpdateOnlyWifi(false);
        tabarray = getResources().getStringArray(R.array.tab_array);
//        addGG();
        guidePagerOper();
        mFragments = new ArrayList<>();
        for (int i = 0; i < tabarray.length; i++) {
            EntryFragment fg = new EntryFragment();
            Bundle bundle = new Bundle();
            bundle.putString("bundle", tabBundle[i]);
            fg.setArguments(bundle);
            mFragments.add(fg);
        }
        mviewPager.setAdapter(new FragmentStatePagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return mFragments.get(position);
            }

            @Override
            public int getCount() {
                return mFragments.size();
            }
        });
        mviewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageSelected(int position) {
                setTextcolor();
                switch (position) {
                    case 0:
                        dp.setTextColor(Color.WHITE);
                        break;
                    case 1:
                        cp.setTextColor(Color.WHITE);
                        break;
                    case 2:
                        xy.setTextColor(Color.WHITE);
                        break;
                    case 3:
                        yy.setTextColor(Color.WHITE);
                        break;
                    case 4:
                        jl.setTextColor(Color.WHITE);
                        break;
                    case 5:
                        mj.setTextColor(Color.WHITE);
                        break;
                    case 6:
                        ly.setTextColor(Color.WHITE);
                        break;
                    case 7:
                        yc.setTextColor(Color.WHITE);
                        break;
                    case 8:
                        nh.setTextColor(Color.WHITE);
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });
        mviewPager.setOffscreenPageLimit(5);
    }

    private void addGG() {
        LinearLayout adlayout = (LinearLayout) findViewById(R.id.AdLinearLayout);
        AppConnect.getInstance(this).showBannerAd(this, adlayout);
        //设置迷你广告背景颜色
        AppConnect.getInstance(this).setAdBackColor(Color.argb(50, 120, 240, 120));
        //设置迷你广告广告语颜色
        AppConnect.getInstance(this).setAdForeColor(Color.WHITE);
        //若未设置以上两个颜色，则默认为黑底白字
        LinearLayout miniLayout = (LinearLayout) findViewById(R.id.miniAdLinearLayout);
        AppConnect.getInstance(this).showMiniAd(this, miniLayout, 30); //默认 10 秒切换一次广告
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            if (SlideWall.getInstance().slideWallDrawer != null && SlideWall.getInstance().slideWallDrawer.isOpened()) {
                // 如果抽屉式应用墙展示中，则关闭抽屉
                SlideWall.getInstance().closeSlidingDrawer();
            } else {
                // 调用退屏广告
                QuitPopAd.getInstance().show(this);
            }
        }
        return true;
    }


    @Override
    protected void onPause() {
        super.onPause();
        currentItem = mviewPager.getCurrentItem();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mviewPager.setCurrentItem(currentItem);
//        int i = (int) (Math.random() * 50 + 1);
//        if (i > 40) {
//            AdInfo adInfo = AppConnect.getInstance(MainActivity.this).getAdInfo();
//            AppDetail.getInstanct().showAdDetail(MainActivity.this, adInfo);
//        }
    }

    private void FindView() {
        mviewPager = (ViewPager) this.findViewById(R.id.mviewpager);
        cp = (TextView) findViewById(R.id.cp);
        xy = (TextView) findViewById(R.id.xy);
        yy = (TextView) findViewById(R.id.yy);
        jl = (TextView) findViewById(R.id.jl);
        mj = (TextView) findViewById(R.id.mj);
        ly = (TextView) findViewById(R.id.ly);
        yc = (TextView) findViewById(R.id.yc);
        nh = (TextView) findViewById(R.id.nh);
        dp = (TextView) findViewById(R.id.dp);
        tvs.add(cp);
        tvs.add(xy);
        tvs.add(yy);
        tvs.add(jl);
        tvs.add(mj);
        tvs.add(ly);
        tvs.add(yc);
        tvs.add(nh);
        tvs.add(dp);
        setTextcolor();
        dp.setTextColor(Color.WHITE);
    }

    public void setTextcolor() {
        for (int i1 = 0; i1 < tvs.size(); i1++) {
            tvs.get(i1).setTextColor(Color.parseColor("#e92fe9"));
        }
    }

    /**
     * 对引导页的对应操作
     */

    private void guidePagerOper() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                mview = (ImageView) findViewById(R.id.webcome);
                ObjectAnimator obj = ObjectAnimator.ofFloat(mview, "alpha", 1, 0);
                obj.setDuration(1500);
                obj.start();
            }
        }, 500);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.dp:
                setTextcolor();
                dp.setTextColor(Color.parseColor("#ffffff"));
                mviewPager.setCurrentItem(0);
                break;
            case R.id.cp:
                setTextcolor();
                cp.setTextColor(Color.parseColor("#ffffff"));
                mviewPager.setCurrentItem(1);
                break;
            case R.id.xy:
                setTextcolor();
                xy.setTextColor(Color.parseColor("#ffffff"));
                mviewPager.setCurrentItem(2);
                break;
            case R.id.yy:
                setTextcolor();
                yy.setTextColor(Color.parseColor("#ffffff"));
                mviewPager.setCurrentItem(3);
                break;
            case R.id.jl:
                setTextcolor();
                jl.setTextColor(Color.parseColor("#ffffff"));
                mviewPager.setCurrentItem(4);
                break;
            case R.id.mj:
                setTextcolor();
                mj.setTextColor(Color.parseColor("#ffffff"));
                mviewPager.setCurrentItem(5);
                break;
            case R.id.ly:
                setTextcolor();
                ly.setTextColor(Color.parseColor("#ffffff"));
                mviewPager.setCurrentItem(6);
                break;
            case R.id.yc:
                setTextcolor();
                yc.setTextColor(Color.parseColor("#ffffff"));
                mviewPager.setCurrentItem(7);
                break;
            case R.id.nh:
                setTextcolor();
                nh.setTextColor(Color.parseColor("#ffffff"));
                mviewPager.setCurrentItem(8);
                break;
        }
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
        AppConnect.getInstance(this).close();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void event(MyEvent ev) {
        Intent intent = new Intent(this, StoriesContent.class);
        intent.putExtra("id", ev.getId());
        intent.putExtra("title", ev.getTitle());
        startActivity(intent);
        overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_in_left);
    }

}
