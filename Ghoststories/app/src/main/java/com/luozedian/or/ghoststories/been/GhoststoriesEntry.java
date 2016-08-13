package com.luozedian.or.ghoststories.been;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

/**
 * Created by Administrator on 2016/6/21.
 */
public class GhoststoriesEntry implements Parcelable{
    //故事各个分类对应
    /**
     * showapi_res_code : 0
     * showapi_res_error :
     * showapi_res_body : {"pagebean":{"allPages":"491","contentlist":[{"desc":"六七十年代，著名影星孙道临的夫人王文娟主演的越剧追鱼曾风靡了大半个中国。古时候就有许多关于鲤鱼精的传说，不过，那些精彩的故事，也只是在书本里读过，电影里看过，并没人亲历...","id":"/dp/18243.html","img":"http://www.guidaye.com/images/img/131.jpg","link":"http://www.guidaye.com/dp/18243.html","title":"怪谈之鲤鱼精"},{"desc":"阴间为了改变这死气沉沉的气氛，由阎王爷带头开展了一系列丰富多彩的活动。其中最引鬼注目的一项就是抽奖游戏。这个游戏的赞助商是阎王爷，游戏规则设定者是黑白无常，赞助商来头大，游戏自然档次高。但是众鬼们...","id":"/dp/18238.html","img":"http://www.guidaye.com/images/img/76.jpg","link":"http://www.guidaye.com/dp/18238.html","title":"搞笑鬼故事之抽奖"}],"currentPage":1,"maxResult":"10"},"ret_code":0}
     */
//            "id": "/dp/18243.html",
//            "img": "http://www.guidaye.com/images/img/131.jpg",
//            "link": "http://www.guidaye.com/dp/18243.html",
//            "title": "怪谈之鲤鱼精"
    String desc;
    String id;
    boolean is;
    String img;
    String link;
    String title;
    String maxResult;
    public GhoststoriesEntry(String desc, String id, String img, String link, String title,String maxResult) {
        this.desc = desc;
        this.id = id;
        this.img = img;
        this.link = link;
        this.title = title;
        this.maxResult = maxResult;
    }

    protected GhoststoriesEntry(Parcel in) {
        desc = in.readString();
        id = in.readString();
        is = in.readByte() != 0;
        img = in.readString();
        link = in.readString();
        title = in.readString();
        maxResult = in.readString();
    }

    public static final Creator<GhoststoriesEntry> CREATOR = new Creator<GhoststoriesEntry>() {
        @Override
        public GhoststoriesEntry createFromParcel(Parcel in) {
            return new GhoststoriesEntry(in);
        }

        @Override
        public GhoststoriesEntry[] newArray(int size) {
            return new GhoststoriesEntry[size];
        }
    };

    public String getMaxResult() {
        return maxResult;
    }

    public void setMaxResult(String maxResult) {
        this.maxResult = maxResult;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(desc);
        dest.writeString(id);
        dest.writeByte((byte) (is ? 1 : 0));
        dest.writeString(img);
        dest.writeString(link);
        dest.writeString(title);
        dest.writeString(maxResult);
    }
}
