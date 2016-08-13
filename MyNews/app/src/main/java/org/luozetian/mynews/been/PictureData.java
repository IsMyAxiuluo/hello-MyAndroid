package org.luozetian.mynews.been;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

/**
 * Created by sam on 2016/3/31.
 */
public class PictureData {

    /**
     * count : 4077
     * np : 1.459336082E9
     */

    private InfoBean info;
    /**
     * comment : 86
     * tags : [{"id":1,"name":"搞笑"},{"id":62,"name":"内涵"},{"id":7723,"name":"极品"}]
     * bookmark : 13
     * text : 昨天自己约的炮，哭着也得打完，我知道你们会安慰我的！
     * image : {"medium":["http://ww2.sinaimg.cn/bmiddle/005OPYkojw1f2cpxcv1ytj30go0tlmyk.jpg"],"big":["http://ww2.sinaimg.cn/large/005OPYkojw1f2cpxcv1ytj30go0tlmyk.jpg","http://wimg.spriteapp.cn/ugc/2016/03/28/56f897d738f8b_1.jpg"],"download_url":["http://wimg.spriteapp.cn/ugc/2016/03/28/56f897d738f8b_d.jpg","http://wimg.spriteapp.cn/ugc/2016/03/28/56f897d738f8b.jpg"],"height":1065,"width":600,"small":["http://ww2.sinaimg.cn/mw240/005OPYkojw1f2cpxcv1ytj30go0tlmyk.jpg"]}
     * up : 489
     * share_url : http://b.f.winapp111.com.cn/share/17810466.html?wx.qq.com
     * down : 56
     * forward : 33
     * u : {"header":["http://wimg.spriteapp.cn/profile/large/2015/12/08/5666f29908e55_mini.jpg"],"is_v":false,"uid":"13056613","is_vip":false,"name":"Adobe_姜宝"}
     * passtime : 2016-03-31 09:58:01
     * type : image
     * id : 17810466
     */

    private List<ListBean> list;

    public InfoBean getInfo() {
        return info;
    }

    public void setInfo(InfoBean info) {
        this.info = info;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class InfoBean {
        private int count;
        private double np;

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public double getNp() {
            return np;
        }

        public void setNp(double np) {
            this.np = np;
        }
    }

    public static class ListBean implements Parcelable{
        public boolean isSelect;
        private String comment;
        private String bookmark;
        private String text;

        public GifBean getGif() {
            return gif;
        }

        public void setGif(GifBean gif) {
            this.gif = gif;
        }

        /**
         * medium : ["http://ww2.sinaimg.cn/bmiddle/005OPYkojw1f2cpxcv1ytj30go0tlmyk.jpg"]
         * big : ["http://ww2.sinaimg.cn/large/005OPYkojw1f2cpxcv1ytj30go0tlmyk.jpg","http://wimg.spriteapp.cn/ugc/2016/03/28/56f897d738f8b_1.jpg"]
         * download_url : ["http://wimg.spriteapp.cn/ugc/2016/03/28/56f897d738f8b_d.jpg","http://wimg.spriteapp.cn/ugc/2016/03/28/56f897d738f8b.jpg"]
         * height : 1065
         * width : 600
         * small : ["http://ww2.sinaimg.cn/mw240/005OPYkojw1f2cpxcv1ytj30go0tlmyk.jpg"]
         */

        private ImageBean image;
        private GifBean gif;
        private String up;
        private String share_url;
        private int down;
        private String forward;
        /**
         * header : ["http://wimg.spriteapp.cn/profile/large/2015/12/08/5666f29908e55_mini.jpg"]
         * is_v : false
         * uid : 13056613
         * is_vip : false
         * name : Adobe_姜宝
         */

        private UBean u;
        private String passtime;
        private String type;
        private String id;
        /**
         * id : 1
         * name : 搞笑
         */

        private List<TagsBean> tags;

        protected ListBean(Parcel in) {
            isSelect = in.readByte() != 0;
            comment = in.readString();
            bookmark = in.readString();
            text = in.readString();
            up = in.readString();
            share_url = in.readString();
            down = in.readInt();
            forward = in.readString();
            passtime = in.readString();
            type = in.readString();
            id = in.readString();
        }

        public static final Creator<ListBean> CREATOR = new Creator<ListBean>() {
            @Override
            public ListBean createFromParcel(Parcel in) {
                return new ListBean(in);
            }

            @Override
            public ListBean[] newArray(int size) {
                return new ListBean[size];
            }
        };

        public String getComment() {
            return comment;
        }

        public void setComment(String comment) {
            this.comment = comment;
        }

        public String getBookmark() {
            return bookmark;
        }

        public void setBookmark(String bookmark) {
            this.bookmark = bookmark;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public ImageBean getImage() {
            return image;
        }

        public void setImage(ImageBean image) {
            this.image = image;
        }

        public String getUp() {
            return up;
        }

        public void setUp(String up) {
            this.up = up;
        }

        public String getShare_url() {
            return share_url;
        }

        public void setShare_url(String share_url) {
            this.share_url = share_url;
        }

        public int getDown() {
            return down;
        }

        public void setDown(int down) {
            this.down = down;
        }

        public String getForward() {
            return forward;
        }

        public void setForward(String forward) {
            this.forward = forward;
        }

        public UBean getU() {
            return u;
        }

        public void setU(UBean u) {
            this.u = u;
        }

        public String getPasstime() {
            return passtime;
        }

        public void setPasstime(String passtime) {
            this.passtime = passtime;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public List<TagsBean> getTags() {
            return tags;
        }

        public void setTags(List<TagsBean> tags) {
            this.tags = tags;
        }

        /**
         * Describe the kinds of special objects contained in this Parcelable's
         * marshalled representation.
         *
         * @return a bitmask indicating the set of special object types marshalled
         * by the Parcelable.
         */
        @Override
        public int describeContents() {
            return 0;
        }

        /**
         * Flatten this object in to a Parcel.
         *
         * @param dest  The Parcel in which the object should be written.
         * @param flags Additional flags about how the object should be written.
         *              May be 0 or {@link #PARCELABLE_WRITE_RETURN_VALUE}.
         */
        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeByte((byte) (isSelect ? 1 : 0));
            dest.writeString(comment);
            dest.writeString(bookmark);
            dest.writeString(text);
            dest.writeString(up);
            dest.writeString(share_url);
            dest.writeInt(down);
            dest.writeString(forward);
            dest.writeString(passtime);
            dest.writeString(type);
            dest.writeString(id);
        }
        public static class GifBean implements Parcelable{
            private boolean isgif;
            private List<String> download_url;
            private List<String> gif_thumbnail;
            private List<String> images;
            private int width;

            protected GifBean(Parcel in) {
                isgif = in.readByte() != 0;
                download_url = in.createStringArrayList();
                gif_thumbnail = in.createStringArrayList();
                images = in.createStringArrayList();
                width = in.readInt();
            }

            public static final Creator<GifBean> CREATOR = new Creator<GifBean>() {
                @Override
                public GifBean createFromParcel(Parcel in) {
                    return new GifBean(in);
                }

                @Override
                public GifBean[] newArray(int size) {
                    return new GifBean[size];
                }
            };

            public List<String> getDownload_url() {
                return download_url;
            }

            public void setDownload_url(List<String> download_url) {
                this.download_url = download_url;
            }

            public boolean isgif() {
                return isgif;
            }

            public void setIsgif(boolean isgif) {
                this.isgif = isgif;
            }

            public List<String> getGif_thumbnail() {
                return gif_thumbnail;
            }

            public void setGif_thumbnail(List<String> gif_thumbnail) {
                this.gif_thumbnail = gif_thumbnail;
            }

            public List<String> getImages() {
                return images;
            }

            public void setImages(List<String> images) {
                this.images = images;
            }

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }

            /**
             * Describe the kinds of special objects contained in this Parcelable's
             * marshalled representation.
             *
             * @return a bitmask indicating the set of special object types marshalled
             * by the Parcelable.
             */
            @Override
            public int describeContents() {
                return 0;
            }

            /**
             * Flatten this object in to a Parcel.
             *
             * @param dest  The Parcel in which the object should be written.
             * @param flags Additional flags about how the object should be written.
             *              May be 0 or {@link #PARCELABLE_WRITE_RETURN_VALUE}.
             */
            @Override
            public void writeToParcel(Parcel dest, int flags) {
                dest.writeByte((byte) (isgif ? 1 : 0));
                dest.writeStringList(download_url);
                dest.writeStringList(gif_thumbnail);
                dest.writeStringList(images);
                dest.writeInt(width);
            }
        }
        public static class ImageBean implements Parcelable{
            boolean isSer;
            private int height;
            private int width;
            private List<String> medium;
            private List<String> big;
            private List<String> download_url;
            private List<String> small;

            protected ImageBean(Parcel in) {
                isSer = in.readByte() != 0;
                height = in.readInt();
                width = in.readInt();
                medium = in.createStringArrayList();
                big = in.createStringArrayList();
                download_url = in.createStringArrayList();
                small = in.createStringArrayList();
            }

            public static final Creator<ImageBean> CREATOR = new Creator<ImageBean>() {
                @Override
                public ImageBean createFromParcel(Parcel in) {
                    return new ImageBean(in);
                }

                @Override
                public ImageBean[] newArray(int size) {
                    return new ImageBean[size];
                }
            };

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }

            public List<String> getMedium() {
                return medium;
            }

            public void setMedium(List<String> medium) {
                this.medium = medium;
            }

            public List<String> getBig() {
                return big;
            }

            public void setBig(List<String> big) {
                this.big = big;
            }

            public List<String> getDownload_url() {
                return download_url;
            }

            public void setDownload_url(List<String> download_url) {
                this.download_url = download_url;
            }

            public List<String> getSmall() {
                return small;
            }

            public void setSmall(List<String> small) {
                this.small = small;
            }

            /**
             * Describe the kinds of special objects contained in this Parcelable's
             * marshalled representation.
             *
             * @return a bitmask indicating the set of special object types marshalled
             * by the Parcelable.
             */
            @Override
            public int describeContents() {
                return 0;
            }

            /**
             * Flatten this object in to a Parcel.
             *
             * @param dest  The Parcel in which the object should be written.
             * @param flags Additional flags about how the object should be written.
             *              May be 0 or {@link #PARCELABLE_WRITE_RETURN_VALUE}.
             */
            @Override
            public void writeToParcel(Parcel dest, int flags) {
                dest.writeByte((byte) (isSer ? 1 : 0));
                dest.writeInt(height);
                dest.writeInt(width);
                dest.writeStringList(medium);
                dest.writeStringList(big);
                dest.writeStringList(download_url);
                dest.writeStringList(small);
            }
        }
        public static class UBean {
            private boolean is_v;
            private String uid;
            private boolean is_vip;
            private String name;
            private List<String> header;

            public boolean isIs_v() {
                return is_v;
            }

            public void setIs_v(boolean is_v) {
                this.is_v = is_v;
            }

            public String getUid() {
                return uid;
            }

            public void setUid(String uid) {
                this.uid = uid;
            }

            public boolean isIs_vip() {
                return is_vip;
            }

            public void setIs_vip(boolean is_vip) {
                this.is_vip = is_vip;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public List<String> getHeader() {
                return header;
            }

            public void setHeader(List<String> header) {
                this.header = header;
            }
        }

        public static class TagsBean {
            private int id;
            private String name;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
    }
}
