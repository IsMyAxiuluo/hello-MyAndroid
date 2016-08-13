package com.luozedian.or.ghoststories;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import cn.waps.AppConnect;

/**
 * Created by Administrator on 2016/6/24.
 */
public class WebActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weblayout);
        guidePagerOper();
    }

    SharedPreferences preferences;
    boolean isFirst;
    ImageView mview;
    /**
     * 对引导页的对应操作
     */
    private void guidePagerOper() {
        preferences = getSharedPreferences("splash_sharedPre", MODE_PRIVATE);
        isFirst = preferences.getBoolean("isFirst", true);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (isFirst) {
                    SharedPreferences.Editor editor = preferences.edit();
                    editor.putBoolean("isFirst", false);
                    editor.commit();
                }
                mview = (ImageView) findViewById(R.id.mview);
                ObjectAnimator obj = ObjectAnimator.ofFloat(mview, "alpha", 1, 0);
                obj.setDuration(500);
                obj.start();
                startActivity(new Intent(WebActivity.this, MainActivity.class));
                WebActivity.this.overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
                WebActivity.this.finish();
            }
        }, 1500);
    }
}
