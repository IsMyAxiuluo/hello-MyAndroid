package org.luozetian.mynews;

import android.support.v4.view.ViewPager;
import android.view.View;

/**
 * Created by sam on 2016/3/29.
 */
public class MyPageTransformer implements ViewPager.PageTransformer{
    @Override
    public void transformPage(View page, float position) {
        if(position < -1){
            page.setAlpha(0);
        }else if(position <= 0){
            page.setAlpha(1);
            page.setTranslationX(0);
            page.setScaleX(1);
            page.setScaleY(1);
        }else if(position <= 1){
            page.setAlpha(1 - position);
            page.setTranslationX(page.getWidth()*(-position));
            float s = 0.75f + (1 - 0.75f)*(1-Math.abs(position));
            page.setScaleX(s);
            page.setScaleY(s);
        }else{
            page.setAlpha(0);
        }
    }
}
