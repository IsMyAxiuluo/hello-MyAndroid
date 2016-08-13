package com.luozedian.or.ghoststories;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.luozedian.or.ghoststories.Util.AppDeut;
import com.luozedian.or.ghoststories.Util.TheadUtil;
import com.luozedian.or.ghoststories.been.StoriesContentBeen;
import com.show.api.ShowApiRequest;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import cn.waps.AppConnect;


/**
 * Created by Administrator on 2016/6/22.
 */
public class StoriesContent extends AppCompatActivity {

    LinearLayout mRelativeLayout;
    ArrayList<StoriesContentBeen> newsDatas;
    TextView mTextViewtitle, mTextViewContent,mpages;
    String id;
    String title;
    String page = "1";
    Handler mhandler = new Handler();
    List<StoriesContentBeen> mdata;
    SharedPreferences preferences;
    private AlertDialog.Builder mbuilder;
    private ImageView mimageadd, mimageremove;
    private TextView mtext,textpmd;
    private View inflate;
    String text;
    private ScrollView mscrollView;
    private String allPages;
    private String currentPage;
    private RelativeLayout mrelativeLayout;
    private LinearLayout adlayout;
    private int i ;
    private int j  = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.storiescontent);
        mdata = new ArrayList<StoriesContentBeen>();
        newsDatas = new ArrayList<>();
        preferences = getSharedPreferences("splash_sharedPre", MODE_PRIVATE);
        findView();
        addGG();
        mTextViewContent.setTextSize((float) Integer.valueOf(preferences.getString("font_size", "15")));
        id = getIntent().getStringExtra("id");
        title = getIntent().getStringExtra("title");
        DownloadMyData(1);
        String colorC = preferences.getString("colorC","#fffefe");
        String colorL =preferences.getString("colorL","#000000");
        mrelativeLayout.setBackgroundColor(Color.parseColor(colorL));
        mTextViewContent.setTextColor(Color.parseColor(colorC));
    }

    private void addGG() {
        AppConnect.getInstance(this).showBannerAd(this, adlayout);
        //设置迷你广告背景颜色
        AppConnect.getInstance(this).setAdBackColor(Color.argb(50, 120, 240, 120));
        //设置迷你广告广告语颜色
        AppConnect.getInstance(this).setAdForeColor(Color.YELLOW);
        //若未设置以上两个颜色，则默认为黑底白字

//        LinearLayout miniLayout =(LinearLayout)findViewById(R.id.miniAdLinearLayout);
//        AppConnect.getInstance(this).showMiniAd(this, miniLayout, 30); //默认 10 秒切换一次广告

    }

    private void findView() {
        adlayout = (LinearLayout)findViewById(R.id.AdLinearLayout);
        mpages = (TextView) findViewById(R.id.pages);
        mRelativeLayout = (LinearLayout) findViewById(R.id.mRelativelayout);
        mTextViewtitle = (TextView) findViewById(R.id.storiestitle);
        textpmd = (TextView) findViewById(R.id.textpmd);
        mTextViewContent = (TextView) findViewById(R.id.storiescontent);
        mscrollView = (ScrollView) findViewById(R.id.mscrollview);
        mrelativeLayout = (RelativeLayout) findViewById(R.id.storiescontentR);

    }

    public void setsize(int size) {
        String font_size = String.valueOf(size);
        mtext.setText(font_size);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("font_size", font_size);
        editor.commit();
    }

    private void DownloadMyData(final int pager) {
        TheadUtil.mExecutorService.execute(new Runnable() {
            @Override
            public void run() {
                String json = intoData();
                json = Jsoncheak(json);
                try {
                    mdata.clear();
                    mdata.addAll(parseNewsListJson(json));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
//              Nextpage();   //下一页
                mhandler.post(new Runnable() {

                    @Override
                    public void run() {
                        mRelativeLayout.setVisibility(View.VISIBLE);
                        mTextViewtitle.setText(title);
                        text = mdata.get(0).getText();
                        mTextViewContent.setText(text);
                        if(textpmd.getText().toString().equals("")){
                            textpmd.setText(text);
                        }
                        currentPage = mdata.get(0).getCurrentPage();
                        allPages = mdata.get(0).getAllPages();
                        mpages.setText(currentPage + "/" + allPages + "页");
                    }
                });
            }
        });
    }

    private String Jsoncheak(String json) {
        json = json.replace("&nbsp;&nbsp;&nbsp;", "\n       ");
        json = json.replace("shoye_3360();", "");
        json = json.replace("shoye_336();", "");
        json = json.replace("订阅微信公众号：", "");
        json = json.replace("手机读鬼故事：", "");
        json = json.replace("m.guidaye.com", "");
        json = json.replace("guidayecom", "");
        json = json.replace("，阅读经常鬼故事！", "");
        json = json.replace("&nbsp;", "");
        return json;
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        gotoMathActivity();
        return super.onKeyDown(keyCode, event);
    }

    private void gotoMathActivity() {
        startActivity(new Intent(this, MainActivity.class));
        overridePendingTransition(android.R.anim.slide_out_right, android.R.anim.slide_out_right);
    }

    private String intoData() {
        String appid = "20852";
        String secret = AppDeut.YYCJpeyykey;
        final String res = new ShowApiRequest("http://route.showapi.com/955-2", appid, secret)
                .addTextPara("id", id)
                .addTextPara("page", page)
                .post();
        return res;
    }

    public int getsize() {
        String font_size = preferences.getString("font_size", "15");
        return  Integer.valueOf(font_size);
    }

    private ArrayList<StoriesContentBeen> parseNewsListJson(String json)
            throws JSONException {
        // 把字符串转换成json对象
        JSONObject jsonObject = new JSONObject(json);
        JSONObject paramz2 = jsonObject.getJSONObject("showapi_res_body");
        String desc = paramz2.getString("allPages");
        String id = paramz2.getString("currentPage");
        String img = paramz2.getString("text");
        StoriesContentBeen newsData = new StoriesContentBeen(img, desc, id);
        newsDatas.clear();
        newsDatas.add(newsData);
        return newsDatas;
    }

    public void onClickImageView(View view) {
        mbuilder = new AlertDialog.Builder(this);
        inflate = LayoutInflater.from(this).inflate(R.layout.stories_dialog, null);
        mtext = (TextView) inflate.findViewById(R.id.f_fontsize_textview);
        mimageadd = (ImageView) inflate.findViewById(R.id.f_imageadd);
        mimageremove = (ImageView) inflate.findViewById(R.id.f_imageremove);
        mimageadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int getsize = getsize();
                getsize++;
                setsize(getsize);
            }
        });
        mimageremove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int getsize = getsize();
                getsize--;
                setsize(getsize);
            }
        });
        mbuilder.setView(inflate);

        mbuilder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                mTextViewContent.setTextSize((float) Integer.valueOf(preferences.getString("font_size", "20")));
                mTextViewContent.setText(text);
            }
        });
        mbuilder.setNegativeButton("取消", null);
        mbuilder.create().show();
    }

    public void next(View view) {
        //下一页
        int i = Integer.valueOf(page);
        Integer integer = Integer.valueOf(allPages);
        if(i < integer){
            i++;
            TheadUtil.showToast(this,mhandler,"下一页加载中...");
            AppConnect.getInstance(this).showBannerAd(this, adlayout);
            page = String.valueOf(i);
            DownloadMyData(i);
            mhandler.post(new Runnable() {
                @Override
                public void run() {
                    mscrollView.fullScroll(ScrollView.FOCUS_UP);
                }
            });
        }else{
            TheadUtil.showToast(this,mhandler,"没有下一页...");
        }
        mpages.setText(i+"/"+allPages+"页");
    }

    public void previous(View view) {
        //上一页
        int i = Integer.valueOf(currentPage);
        i--;
        if(i>0){
            page = String.valueOf(i);
            DownloadMyData(i);
            AppConnect.getInstance(this).showBannerAd(this, adlayout);
            mhandler.post(new Runnable() {
                @Override
                public void run() {
                    mscrollView.fullScroll(ScrollView.FOCUS_UP);
                }
            });
        }else{
            TheadUtil.showToast(this,mhandler,"已经是首页");
        }
        mpages.setText(i+"/"+allPages+"页");
    }

    public void onClickbg(View view) {
        if(i==0&&j!=0){
            TheadUtil.showToast(this,mhandler,"谁呀，别摸我");
            i++;
            j--;
            mhandler.post(new Runnable() {
                @Override
                public void run() {
                    String colorC = "#000000";
                    String colorL = "#ffffff";
                    SharedPreferences.Editor editor = preferences.edit();
                    editor.putString("colorC", colorC);
                    editor.putString("colorL", colorL);
                    mrelativeLayout.setBackgroundColor(Color.parseColor(colorL));
                    mTextViewContent.setTextColor(Color.parseColor(colorC));
                }
            });
        }else if(j==0&&i!=0){
            TheadUtil.showToast(this,mhandler,"谁呀，别摸我");
            j++;
            i--;
            mhandler.post(new Runnable() {
                @Override
                public void run() {
                    String colorC = "#fffefe";
                    String colorL = "#000000";
                    SharedPreferences.Editor editor = preferences.edit();
                    editor.putString("colorC", colorC);
                    editor.putString("colorL", colorL);
                    mrelativeLayout.setBackgroundColor(Color.parseColor(colorL));
                    mTextViewContent.setTextColor(Color.parseColor(colorC));
                }
            });
        }

    }

    public void back(View view) {
        gotoMathActivity();
    }

    public void onclickYJ(View view) {
        AppConnect.getInstance(this).showFeedback(this);
    }

    public void onclickXZ(View view) {

    }
}
