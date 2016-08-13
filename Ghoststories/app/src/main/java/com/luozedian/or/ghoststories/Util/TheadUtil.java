package com.luozedian.or.ghoststories.Util;

import android.content.Context;
import android.os.Handler;
import android.widget.BaseAdapter;
import android.widget.Toast;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by idea on 2016/3/11.
 */
public class TheadUtil {

    public static ExecutorService mExecutorService = Executors.newFixedThreadPool(5);

    public static void showToast(final Context context, Handler handler, final String msg) {
        handler.post(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
            }
        });
    }
    public static void adapterNotifyDataSetChanged(Handler handler, final BaseAdapter adapter) {
        handler.post(new Runnable() {
            @Override
            public void run() {
                adapter.notifyDataSetChanged();
            }
        });
    }

}
