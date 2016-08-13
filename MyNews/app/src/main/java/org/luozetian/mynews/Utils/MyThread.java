package org.luozetian.mynews.Utils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by sam on 2016/3/29.
 */
public class MyThread {

    public static ExecutorService getThread(){
       return Executors.newFixedThreadPool(5);
    }

}
