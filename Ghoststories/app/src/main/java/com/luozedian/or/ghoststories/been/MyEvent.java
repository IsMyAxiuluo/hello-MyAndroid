package com.luozedian.or.ghoststories.been;

/**
 * Created by Administrator on 2016/6/22.
 */
public class MyEvent {
    String id ;
    String title;

    public MyEvent(String id, String title) {
        this.id = id;
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
