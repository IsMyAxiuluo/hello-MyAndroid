package org.luozetian.mynews;

import android.content.Intent;
import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.jeremyfeinstein.slidingmenu.lib.app.SlidingFragmentActivity;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.luozetian.mynews.Fragment.Concern;
import org.luozetian.mynews.Fragment.Menu.Left;
import org.luozetian.mynews.Fragment.News_Fg;
import org.luozetian.mynews.Fragment.Read_Book;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;

public class MainActivity extends SlidingFragmentActivity {

    private SlidingMenu menu;
    private RadioGroup radioGroup;
    private News_Fg news_fg;
    private Read_Book read_book_fg;
    private Concern concer_fg;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addMyFragment();
        intoSlidingMeun();
        tianchongbuju(0);
    }

    long endTime = 0;
    long timeOffset = 0 ;
    public void onBackPressed() {
        timeOffset = System.currentTimeMillis() - endTime;
        if (timeOffset > 2000){
            Toast.makeText(this, "再按一次退出程序...", Toast.LENGTH_SHORT).show();
            endTime = System.currentTimeMillis();
        }else{
            super.onBackPressed();
        }
    }

    private void addMyFragment() {
        radioGroup = (RadioGroup) findViewById(R.id.radiogroup);
        ((RadioButton) radioGroup.getChildAt(0)).setChecked(true);
        ((RadioButton) radioGroup.getChildAt(0)).setTextColor(Color.BLUE);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int childCount = radioGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    RadioButton childAt = (RadioButton) radioGroup.getChildAt(i);
                    childAt.setChecked(false);
                    childAt.setTextColor(Color.BLACK);
                    if (childAt.getId() == checkedId) {
                        childAt.setChecked(true);
                        childAt.setTextColor(Color.BLUE);
                        tianchongbuju(i);
                    }
                }
            }
        });
    }

    private void tianchongbuju(int i) {
        String name = null;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = supportFragmentManager.beginTransaction();
        switch (i) {
            case 0:
                IsHide(fragmentTransaction);
                if (news_fg != null) {
                    fragmentTransaction.show(news_fg);
                } else {
                    news_fg = new News_Fg();
                    name = "news";
                    fragmentTransaction.add(R.id.videomain_layout, news_fg, name);
                    fragmentTransaction.addToBackStack(name);
                }
                fragmentTransaction.commit();
                break;
            case 1:
                IsHide(fragmentTransaction);
                if (read_book_fg != null) {
                    fragmentTransaction.show(read_book_fg);
                } else {
                    read_book_fg = new Read_Book();
                    name = "readbook";
                    fragmentTransaction.add(R.id.videomain_layout, read_book_fg, name);
                    fragmentTransaction.addToBackStack(name);
                }
                fragmentTransaction.commit();
                break;
            case 2:
                IsHide(fragmentTransaction);
                if (concer_fg != null) {
                    fragmentTransaction.show(concer_fg);
                } else {
                    concer_fg = new Concern();
                    name = "concern";
                    fragmentTransaction.add(R.id.videomain_layout, concer_fg, name);
                    fragmentTransaction.addToBackStack(name);
                }
                fragmentTransaction.commit();
                break;
        }

    }

    private void IsHide(FragmentTransaction fragmentTransaction) {
        if (read_book_fg != null) {
            fragmentTransaction.hide(read_book_fg);
        }
        if (news_fg != null) {
            fragmentTransaction.hide(news_fg);
        }
        if (concer_fg != null) {
            fragmentTransaction.hide(concer_fg);
        }
    }

    private void intoSlidingMeun() {
        setBehindContentView(R.layout.leftmenu);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.left_fl, new Left()).commit();
        menu = getSlidingMenu();
        menu.setMode(SlidingMenu.LEFT);
        menu.setTouchModeAbove(SlidingMenu.TOUCHMODE_MARGIN);
        menu.setBehindOffset(40);
        menu.setShadowDrawable(R.drawable.share_kuang);
        menu.setFadeDegree(0.4f);
    }

    public void ShowMenu(View view) {
        getSlidingMenu().showMenu();
    }

    public void Addtitle(View view) {
        Toast.makeText(this, "......", Toast.LENGTH_SHORT).show();
    }

    public void Search(View view) {
        Toast.makeText(this, "暂时无功能....", Toast.LENGTH_SHORT).show();
    }

}
