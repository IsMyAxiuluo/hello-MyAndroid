package com.luozedian.or.ghoststories.been;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Administrator on 2016/6/22.
 */
public class StoriesContentBeen implements Parcelable{
    boolean b;
    String text;
    //    故事内容详情。
    String currentPage;
    //    当前页
    String allPages;
    //    总页数

    public StoriesContentBeen(String text, String allPages, String currentPage) {
        this.text = text;
        this.allPages = allPages;
        this.currentPage = currentPage;
    }

    protected StoriesContentBeen(Parcel in) {
        b = in.readByte() != 0;
        text = in.readString();
        currentPage = in.readString();
        allPages = in.readString();
    }

    public static final Creator<StoriesContentBeen> CREATOR = new Creator<StoriesContentBeen>() {
        @Override
        public StoriesContentBeen createFromParcel(Parcel in) {
            return new StoriesContentBeen(in);
        }

        @Override
        public StoriesContentBeen[] newArray(int size) {
            return new StoriesContentBeen[size];
        }
    };

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
    }

    public String getAllPages() {
        return allPages;
    }

    public void setAllPages(String allPages) {
        this.allPages = allPages;
    }


    @Override
    public String toString() {
        return "StoriesContentBeen{" +
                "text='" + text + '\'' +
                ", currentPage='" + currentPage + '\'' +
                ", allPages='" + allPages + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeByte((byte) (b ? 1 : 0));
        dest.writeString(text);
        dest.writeString(currentPage);
        dest.writeString(allPages);
    }
}
