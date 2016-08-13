package org.luozetian.mynews.been;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

/**
 * Created by sam on 2016/3/29.
 */
public class NewstowData {

    /**
     * stories : [{"images":["http://pic1.zhimg.com/1174da865141721a5b5d6d1076bee68c.jpg"],"type":0,"id":8056116,"title":"蓝得像火星上的日落，或是澳大利亚的盐田"},{"images":["http://pic3.zhimg.com/d205640aeb98419005f624ebf3cab6ea.jpg"],"type":2,"id":8045969,"title":"对不起，我才刚知道 Principle 这交互原型图神器"},{"images":["http://pic4.zhimg.com/9589e01fe5bb41c92303eeb2e6edbf33.jpg"],"type":2,"id":8041737,"title":"装修剩下的水泥千万别扔，这几个逆天用途惊艳你！"},{"images":["http://pic1.zhimg.com/09c72cdc46427fe97999168241a4bbb8.jpg"],"type":2,"id":8036745,"title":"Twitter 十周年，来看蓝色小鸟的演变史"},{"images":["http://pic4.zhimg.com/c4b855e5a729be4a12870d8b5faf1387.jpg"],"type":2,"id":8035082,"title":"苹果发布会全记录：史上最便宜的新 iPhone 来了！"},{"images":["http://pic1.zhimg.com/1f17f33f9d1cbf323018fbcec047d624.jpg"],"type":2,"id":8032481,"title":"2016年\u201c世界最美的书\u201d获奖作品完整版公布"},{"images":["http://pic1.zhimg.com/a6e3436b5fe00fbfd89cba1d964cd48c.jpg"],"type":2,"id":8032449,"title":"迪特-拉姆斯（Dieter Rams）博朗之魂\u2014工业设计之父"},{"images":["http://pic4.zhimg.com/febb9fa5168f1612742e43aa95af8777.jpg"],"type":2,"id":8011190,"title":"Adobe 放大招，全面打通界面、交互、原型制作！"},{"images":["http://pic3.zhimg.com/7378d045b24f076cd75d04de4fb6274e.jpg"],"type":2,"id":8020992,"title":"在寸土寸金的北京，这所学校竟然还有农田"},{"images":["http://pic4.zhimg.com/22d03b883e1dafb0d29a78fa620c74db.jpg"],"type":0,"id":8013801,"title":"iOS 设计的这些神细节你注意到了吗？（超多图）"},{"images":["https://pic2.zhimg.com/8db3ced87ef6626bc3882ecfc85628f1_b.png"],"type":0,"id":8008481,"title":"黑的无底洞"},{"images":["http://pic1.zhimg.com/2a3ac1c6b3645e5a5ae3979e4a189100.jpg"],"type":2,"id":8005590,"title":"谈到乔布斯的设计嗅觉，苹果首席设计师讲了一个故事"},{"images":["http://pic4.zhimg.com/34957a0a2d0be3530b39afd1222fa1af.jpg"],"type":2,"id":8005027,"title":"虽然预算有限，我还是想要一个私人订制版的家"},{"images":["http://pic1.zhimg.com/e26d43e23921b3cce7a587c320d18c50.jpg"],"type":2,"id":8000217,"title":"UX行业国际调研报告"},{"images":["http://pic1.zhimg.com/58b012111f9b8e6e37451bb1c2a5a260.jpg"],"type":2,"id":7986790,"title":"苹果 \u201c新 iPhone\u201d 发布会时间确认！这里有份最全的预测分析"},{"images":["http://pic4.zhimg.com/ab136b56d9965c0499e7c4536b8f5b47.jpg"],"type":2,"id":7984215,"title":"对话英国Horse设计工作室：农夫山泉玻璃瓶中的万物自然"},{"images":["http://pic1.zhimg.com/7f0d8ceabc660b81f37affd4159c5c6c.jpg"],"type":2,"id":7984210,"title":"产品测试：只找五位用户就够了？为什么？"},{"images":["http://pic2.zhimg.com/b1f63e1b05e83473d9af75483533ad6d.jpg"],"type":0,"id":7982790,"title":"VR 来了，5 年后你可能在虚拟世界里做设计"},{"images":["http://pic4.zhimg.com/164ab948a0abdb79e010676e626f984f.jpg"],"type":2,"id":7977523,"title":"俄罗斯的著名建筑下藏着什么？"}]
     * description : 好设计需要打磨和研习，我们分享灵感和路径
     * background : http://p3.zhimg.com/ff/15/ff150eef63a48f0d1dafb77e62610a9f.jpg
     * color : 62140
     * name : 设计日报
     * image : http://p2.zhimg.com/98/dd/98dd8dcec0186ffba8d8e298255765e7.jpg
     * editors : [{"url":"http://www.zhihu.com/people/fanxtastic","bio":"PhD Researcher in Design","id":22,"avatar":"http://pic2.zhimg.com/e19f362d5_m.jpg","name":"Fanxtastic"},{"url":"http://www.zhihu.com/people/starose","bio":"产品设计师 @华兴资本","id":56,"avatar":"http://pic4.zhimg.com/de2ab67cf_m.jpg","name":"星玫"}]
     * image_source :
     */

    private String description;
    private String background;
    private int color;
    private String name;
    private String image;
    private String image_source;
    /**
     * images : ["http://pic1.zhimg.com/1174da865141721a5b5d6d1076bee68c.jpg"]
     * type : 0
     * id : 8056116
     * title : 蓝得像火星上的日落，或是澳大利亚的盐田
     */

    private List<StoriesBean> stories;
    /**
     * url : http://www.zhihu.com/people/fanxtastic
     * bio : PhD Researcher in Design
     * id : 22
     * avatar : http://pic2.zhimg.com/e19f362d5_m.jpg
     * name : Fanxtastic
     */

    private List<EditorsBean> editors;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImage_source() {
        return image_source;
    }

    public void setImage_source(String image_source) {
        this.image_source = image_source;
    }

    public List<StoriesBean> getStories() {
        return stories;
    }

    public void setStories(List<StoriesBean> stories) {
        this.stories = stories;
    }

    public List<EditorsBean> getEditors() {
        return editors;
    }

    public void setEditors(List<EditorsBean> editors) {
        this.editors = editors;
    }

    public static class StoriesBean implements Parcelable{
        public boolean isStoriesBean;
        private int type;
        private int id;
        private String title;
        private List<String> images;

        protected StoriesBean(Parcel in) {
            isStoriesBean = in.readByte() != 0;
            type = in.readInt();
            id = in.readInt();
            title = in.readString();
            images = in.createStringArrayList();
        }

        public static final Creator<StoriesBean> CREATOR = new Creator<StoriesBean>() {
            @Override
            public StoriesBean createFromParcel(Parcel in) {
                return new StoriesBean(in);
            }

            @Override
            public StoriesBean[] newArray(int size) {
                return new StoriesBean[size];
            }
        };

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public List<String> getImages() {
            return images;
        }

        public void setImages(List<String> images) {
            this.images = images;
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
            dest.writeByte((byte) (isStoriesBean ? 1 : 0));
            dest.writeInt(type);
            dest.writeInt(id);
            dest.writeString(title);
            dest.writeStringList(images);
        }
    }

    public static class EditorsBean {
        private String url;
        private String bio;
        private int id;
        private String avatar;
        private String name;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getBio() {
            return bio;
        }

        public void setBio(String bio) {
            this.bio = bio;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
