package com.luozedian.or.ghoststories.Util;

import android.util.Log;

import com.google.gson.Gson;

/**
 * Created by Administrator on 2016-03-12.
 */
public class ParseJsonUtils {

    public static Object parseFromJson(String json, Class<?> target) {
        Gson gson = new Gson();
        try {
            return gson.fromJson(json, target);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
