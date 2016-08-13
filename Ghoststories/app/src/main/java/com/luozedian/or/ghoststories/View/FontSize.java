package com.luozedian.or.ghoststories.View;

import android.content.Context;
import android.content.SharedPreferences;
import android.media.Image;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.luozedian.or.ghoststories.R;

/**
 * Created by Administrator on 2016/6/27.
 */
public class FontSize extends LinearLayout {

    private Context mcontext;
    private View mview;

    private ImageView imageadd,imageremove;
    private TextView mtext;

    public FontSize(Context context) {
        super(context);
        mcontext = context;
        into();
    }

    public FontSize(Context context, AttributeSet attrs) {
        super(context, attrs);
        mcontext = context;
        into();
    }

    public FontSize(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mcontext = context;
        into();
    }

    private void into() {
        mview = LayoutInflater.from(mcontext).inflate(R.layout.fontsize, null, false);
        imageremove = (ImageView) mview.findViewById(R.id.imageremove);
        imageadd = (ImageView) mview.findViewById(R.id.imageadd);
        mtext = (TextView) mview.findViewById(R.id.fontsize_textview);
        preferences = mcontext.getSharedPreferences("splash_sharedPre", mcontext.MODE_PRIVATE);
        imageremove.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                int get_size = getsize();
                get_size--;
                setsize(get_size);
            }
        });

        imageadd.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                int get_size = getsize();
                ++get_size;
                setsize(get_size);
            }
        });

    }
    SharedPreferences preferences;
    public int getsize() {
        String font_size = preferences.getString("font_size", "15");
        return  Integer.valueOf(font_size);
    }

    public void setsize(int size) {
        String font_size = String.valueOf(size);
        mtext.setText(font_size);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("font_size", font_size);
        editor.commit();
    }
}
