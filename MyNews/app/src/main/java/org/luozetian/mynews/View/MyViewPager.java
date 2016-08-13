package org.luozetian.mynews.View;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.luozetian.mynews.R;

public class MyViewPager extends RelativeLayout {

    private ViewPager pager;
    private Context context;
    private TextView tv;
    private LinearLayout layout;
    private int[] image;
    private int[] images;
    private List<View> data;
    private MyAdapter adapter;

    private String[] name = {"聆听民众的呼声,第十九届三中全会明确提出,要贯彻.......",
            "先富带后富,深圳市市民与广场之中,呼唤老板,走慢点........",
            "我国对查禁毒品一向都是以.........."};

    private int index;
    private Handler handler = new Handler() {
        public void handleMessage(android.os.Message msg) {
            switch (msg.what){
                case 1:
                    tv.setText(name[0]);
                    ++index;
                    break;
                case 2:
                    tv.setText(name[1]);
                    ++index;
                    break;
                case 3:
                    tv.setText(name[2]);
                    index = 0;
                    break;
            }
        };
    };

    public MyViewPager(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
        findView();
    }

    public MyViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        findView();
    }

    public MyViewPager(Context context) {
        super(context);
        this.context = context;
        findView();
    }

    public void setImage(int viewpager1, int viewpager2) {
        images = new int[]{viewpager2, viewpager1, viewpager2, viewpager1};
    }

    public void setImage(int viewpager1, int viewpager2, int viewpager3) {
        images = new int[]{viewpager3, viewpager1, viewpager2, viewpager3, viewpager1};
    }

    public int[] getImage() {
        image = images;
        return image;
    }

    public void setImage(int viewpager1, int viewpager2, int viewpager3, int viewpager4) {
        images = new int[]{viewpager4, viewpager1, viewpager2, viewpager3, viewpager4, viewpager1};
    }

    public void setImage(int viewpager1, int viewpager2, int viewpager3, int viewpager4, int viewpager5) {
        images = new int[]{viewpager5, viewpager1, viewpager2, viewpager3, viewpager4, viewpager5, viewpager1};
    }

    public void findView() {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.viewpager_activity, this, true);
        pager = (ViewPager) view.findViewById(R.id.viewpager);
        layout = (LinearLayout) view.findViewById(R.id.img_diandian);
        tv = (TextView) view.findViewById(R.id.mystext);
        if (getImage() == null) {
            image = new int[]{R.drawable.images3, R.drawable.images,
                    R.drawable.images2,
                    R.drawable.images3,R.drawable.images};
        }else{
            image = getImage();
        }
        ViewpagerAddImage();
        downTextandImg();
        pager.setCurrentItem(1);
        tv.setText(name[0]);
    }

    private void downTextandImg() {
        for (int i = 1; i < image.length - 1; i++) {
            ImageView img = new ImageView(context);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                    LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
            params.leftMargin = 5;
            params.rightMargin = 5;
            img.setLayoutParams(params);
            img.setScaleType(ScaleType.CENTER);
            img.setBackgroundResource(R.drawable.mydot);
            img.setEnabled(false);
            layout.addView(img);
        }
        layout.getChildAt(0).setEnabled(true);
    }

    private void ViewpagerAddImage() {
        data = new ArrayList<View>();
        for (int i = 0; i < image.length; i++) {
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ScaleType.FIT_XY);
            imageView.setImageResource(image[i]);
            data.add(imageView);
        }
        adapter = new MyAdapter();
        pager.setAdapter(adapter);

        pager.setOnPageChangeListener(new OnPageChangeListener() {

            @Override
            public void onPageSelected(int position) {
                int count = layout.getChildCount();
                for (int i = 0; i < count; i++) {
                    layout.getChildAt(i).setEnabled(false);
                    //position 0 1 2 3 4
                    //layout     0 1 2

                    if(position == 0 ){
                        pager.setCurrentItem(image.length - 2, false);
                        layout.getChildAt((count-1)).setEnabled(true);
                        handler.sendEmptyMessage(3);
                    }else if(position == (image.length-1)){
                        pager.setCurrentItem(1, false);
                        layout.getChildAt(0).setEnabled(true);
                        handler.sendEmptyMessage(1);
                    }else {
                        layout.getChildAt((position-1)).setEnabled(true);
                        pager.setCurrentItem(position, false);
                        handler.sendEmptyMessage(position);
                    }
                }
            }

            @Override
            public void onPageScrolled(int arg0, float arg1, int arg2) {

            }

            @Override
            public void onPageScrollStateChanged(int arg0) {

            }
        });
    }

    class MyAdapter extends PagerAdapter {

        @Override
        public int getCount() {
            return data.size();
        }

        @Override
        public boolean isViewFromObject(View arg0, Object arg1) {
            return arg0 == arg1;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            container.addView(data.get(position));
            return data.get(position);
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView(data.get(position));
        }

    }

}
