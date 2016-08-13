package org.luozetian.mynews.been;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

/**
 * Created by sam on 2016/3/31.
 */
public class NewsData {

    /**
     * error : 0
     * code : 200100
     * code_desc : 请求成功
     * msg :
     * is_login : 0
     * app_id : 1
     * data : {"newsList":[{"id":"8459530","title":"美称可随时拉闸中国电网 北京两招轻松化解","picOne":"http://m.miercn.com/uploads/allimg/160331/2433-1603310T9590-L.jpg","picTwo":"","picThr":"","summary":"掌握着别人电网的开关，这听起来有点天方夜谭。不过确确实实在我们实际生活中，就发生了。由于电网本身属于基础设施，分布想当广泛，节点也多，一环套一环。以中","publishTime":"1459410351","local":"","mark":"0","comment":"","commentNum":"1","isLarge":"false","timeAgo":"11分钟前","pic_type":"0","praise_count":"6","tag_imgs":[],"newsCategoryId":"0"},{"id":"8460164","title":"日本最头痛的事情 中国这一招彻底封死对手","picOne":"","picTwo":"","picThr":"","summary":"水雷，也许是最简单的海战兵器，也是对技术进步反应最迟顿的装备，设计老旧与技术简单成了它的主要特点，却也因此成为非常有效率的武器：便宜、大威力、使用简便","publishTime":"1459408551","local":"","mark":"0","comment":"","commentNum":"3","isLarge":"false","timeAgo":"41分钟前","pic_type":"0","praise_count":"9","tag_imgs":[],"newsCategoryId":"0"},{"id":"8454171","title":"中东局势向何处演变 伊斯兰国命运步本拉登后尘","picOne":"","picTwo":"","picThr":"","summary":"中东地区历来是\u201c多事之地\u201d。近年来，特别是2003年美国入侵伊拉克捅了中东这个\u201c马蜂窝\u201d后，坐在火药桶上的中东地区，就从来没有安定过。201","publishTime":"1459405911","local":"","mark":"0","comment":"","commentNum":"4","isLarge":"false","timeAgo":"1小时前","pic_type":"0","praise_count":"0","tag_imgs":[],"newsCategoryId":"0"},{"id":"8455339","title":"中国再拥一尖技术从此不怕核导弹 俄都造不出","picOne":"http://m.miercn.com/uploads/allimg/160331/41M4_0331140K143V.jpg","picTwo":"","picThr":"","summary":"能够在太空中对刚刚发射的洲际导弹能够及时发现的技术究竟有多复杂？以前世界上只有美国和前苏联才拥有这项顶尖技术。自从苏联之后，俄罗斯都已经无力研发、保持","publishTime":"1459404951","local":"","mark":"0","comment":"","commentNum":"12","isLarge":"false","timeAgo":"1小时前","pic_type":"0","praise_count":"28","tag_imgs":[],"newsCategoryId":"0"},{"id":"8467382","title":"志愿军英烈，空军飞机接您回家！","picOne":"","picTwo":"","picThr":"","summary":"第三批在韩中国人民志愿军遗骸交接仪式举行","publishTime":"1459403120","local":"","mark":"0","comment":"","commentNum":"1025","isLarge":"false","timeAgo":"2小时前","pic_type":"0","praise_count":"611","tag_imgs":[],"newsCategoryId":"0"},{"id":"8460132","title":"美国P8反潜机贴近中国别有用心：中国出招巧应对","picOne":"http://m.miercn.com/uploads/allimg/160331/41774-160331113U50-L.jpg","picTwo":"","picThr":"","summary":"最近美国的P8反潜机又在晃悠，向我们示威。但一些朋友很奇怪：为什么区区一个反潜机，美国人同样可以来炫耀呢。按照正常逻辑，B-52 B-2这类","publishTime":"1459401320","local":"","mark":"0","comment":"","commentNum":"14","isLarge":"false","timeAgo":"2小时前","pic_type":"0","praise_count":"25","tag_imgs":[],"newsCategoryId":"0"},{"id":"8460600","title":"36具志愿军遗骸在韩入殓 31日将举行仪式归国","picOne":"http://m.miercn.com/uploads/allimg/160331/41774-1603311130140-L.jpg","picTwo":"","picThr":"","summary":"韩联社3月28日文章，原题：36具在韩中国志愿军遗骸入殓 31日归国 韩国国防部28日在位于京畿道坡州市中国军人遗骸临时安置所举行36具志愿","publishTime":"1459399520","local":"","mark":"2","comment":"","commentNum":"8","isLarge":"false","timeAgo":"3小时前","pic_type":"0","praise_count":"3","tag_imgs":[],"newsCategoryId":"0"},{"id":"8428110","title":"美副国务卿：中国反对也要部署萨德","picOne":"","picTwo":"","picThr":"","summary":"\u201c我很清楚中国不喜欢萨德的部署，但这是我们应该采取的措施\u201d。","publishTime":"1459397720","local":"","mark":"0","comment":"","commentNum":"1403","isLarge":"false","timeAgo":"3小时前","pic_type":"0","praise_count":"102","tag_imgs":[],"newsCategoryId":"0"},{"id":"8387689","title":"西沙琛航岛列装王牌火炮：每分钟射4000发","picOne":"http://m.miercn.com/uploads/allimg/160329/41736-160329150K30-L.jpg","picTwo":"","picThr":"","summary":"近日，央视《军事报道》节目播出了担负着西沙、南沙海域辖区防卫和维权、维稳任务的海军南海舰队某基地在面临改革强军这场大考，坚持问题导向，精准实施教育，引","publishTime":"1459395920","local":"","mark":"0","comment":"","commentNum":"108","isLarge":"false","timeAgo":"4小时前","pic_type":"0","praise_count":"230","tag_imgs":[],"newsCategoryId":"0"},{"id":"8457806","title":"水资源引发世界大战？美国：水在叙利亚就是武器","picOne":"","picTwo":"","picThr":"","summary":"美国《洛杉矶时报》网站3月22日发表题为《世界下一场大战会是争夺水资源吗？》的文章，作者为美国大西洋理事会战略远见计划资深研究员彼得·恩格尔","publishTime":"1459394120","local":"","mark":"0","comment":"","commentNum":"7","isLarge":"false","timeAgo":"4小时前","pic_type":"0","praise_count":"10","tag_imgs":[],"newsCategoryId":"0"},{"id":"8432270","title":"辽宁舰出现两条黑印 原因公开让人陷入沉思","picOne":"http://m.miercn.com/uploads/allimg/160330/2433-160330160S10-L.jpg","picTwo":"","picThr":"","summary":"辽宁舰已经进行过大量的着舰测试 解放军专家曾说，中国航母不是宅男。辽宁舰服役已数年，除了几次网上有据可查的出海以外，辽宁舰似乎在公众视野中销声匿迹了。","publishTime":"1459392320","local":"","mark":"0","comment":"","commentNum":"15","isLarge":"false","timeAgo":"5小时前","pic_type":"0","praise_count":"47","tag_imgs":[],"newsCategoryId":"0"},{"id":"8459585","title":"不可思议！美国连中普京六次欲擒故纵之计","picOne":"http://pic.jun360.com/group1/M00/68/2B/cR8Yi1b3dn2AHK6MAAAQvCtlWUs134.jpg","picTwo":"","picThr":"","summary":"读书时读《左传》第一篇\u201c郑伯克段于鄢\u201d，其母嫌弃郑伯，而操纵其弟段作乱。大臣劝郑伯先下手为强，而郑伯迸出：\u201c多行不义必自毖，子姑待之\u201d。想起","publishTime":"1459390520","local":"","mark":"1","comment":"","commentNum":"17","isLarge":"false","timeAgo":"5小时前","pic_type":"0","praise_count":"35","tag_imgs":[],"newsCategoryId":"0"},{"id":"8458977","title":"巴基斯坦准备换新式步枪 为何不用中国的95","picOne":"http://pic.jun360.com/group1/M00/6A/24/cR8Yi1b7JLCAYYUAAAAS1SQwrLQ327.jpg","picTwo":"","picThr":"","summary":"全世界都知道巴基斯坦和中国关系不一般，巴军几乎所有武器装备都恨不得用中国货，但是近日巴军为更换新款步枪而设立的选型活动公布之后，可能要让中国","publishTime":"1459388720","local":"","mark":"0","comment":"","commentNum":"22","isLarge":"false","timeAgo":"6小时前","pic_type":"0","praise_count":"7","tag_imgs":[],"newsCategoryId":"0"},{"id":"8458151","title":"法国驻华大使向中国示好：中法没那么多摩擦","picOne":"","picTwo":"","picThr":"","summary":"法国驻华大使顾山30日在大使馆接受多家中国媒体联合采访时透露，法国希望到2020年能够吸引500万中国游客，为此将进一步优化中国游客的签证手续，包括尝试给予曾","publishTime":"1459386920","local":"","mark":"0","comment":"","commentNum":"84","isLarge":"false","timeAgo":"6小时前","pic_type":"0","praise_count":"120","tag_imgs":[],"newsCategoryId":"0"},{"id":"8428669","title":"日本正式解禁集体自卫权 外交部回应","picOne":"http://m.miercn.com/uploads/allimg/160330/41736-1603301435450-L.jpg","picTwo":"","picThr":"","summary":"日本3月29日开始实施新安保法，正式解禁集体自卫权。","publishTime":"1459385140","local":"","mark":"0","comment":"","commentNum":"704","isLarge":"false","timeAgo":"7小时前","pic_type":"0","praise_count":"352","tag_imgs":[],"newsCategoryId":"0"},{"id":"8458158","title":"日本新安保法今日正式实施 将可行使集体自卫权","picOne":"http://m.miercn.com/uploads/allimg/160331/41M4_03310P135R01.jpg","picTwo":"","picThr":"","summary":"日本安保相关法于3月29日零点实施，历届政府基于《宪法》第九条不允许行使的集体自卫权得到解禁。日本自卫队可向他国军队提供后方支援等，海外活动","publishTime":"1459383335","local":"","mark":"0","comment":"","commentNum":"11","isLarge":"false","timeAgo":"7小时前","pic_type":"0","praise_count":"2","tag_imgs":[],"newsCategoryId":"0"},{"id":"8407106","title":"中国迟迟不建大型两栖攻击舰：周边国家坐不住","picOne":"http://pic.jun360.com/group1/M00/3A/35/cR8Yilb6NgSAchn_AAASUk4cZQY476.jpg","picTwo":"","picThr":"","summary":"现代登陆作战中，由海到陆的过程最为关健，也是部队最为需要支援的阶段，不仅要支援火力猛，更要精准。因为部队已开始上岸，与对方距离太远了，打偏一","publishTime":"1459381333","local":"","mark":"0","comment":"","commentNum":"19","isLarge":"false","timeAgo":"8小时前","pic_type":"0","praise_count":"52","tag_imgs":[],"newsCategoryId":"0"},{"id":"8412979","title":"中国有一武器战斗力超过核弹 而且还不会伤人","picOne":"","picTwo":"","picThr":"","summary":"在这种情况下，将可以实现不战而屈人之兵，不用进行大战役，对方就将屈服。中国现在有一种开拓者火箭，这是一种可以快速发射的火箭。其技术来源于东风","publishTime":"1459379473","local":"","mark":"2","comment":"","commentNum":"51","isLarge":"false","timeAgo":"8小时前","pic_type":"0","praise_count":"82","tag_imgs":[],"newsCategoryId":"0"},{"id":"8412874","title":"戴旭：美国没外来军事威胁 军队却天天在打仗","picOne":"http://m.miercn.com/uploads/allimg/151124/41738-151124151T80-L.jpg","picTwo":"","picThr":"","summary":"美国军队是当今世界现代战争经验最丰富的军队，冷战以前，平均每两年打一仗;冷战后天天在打。一个根本没有外来军事威胁的国家，其军队却天天在打仗，","publishTime":"1459377553","local":"","mark":"0","comment":"","commentNum":"57","isLarge":"false","timeAgo":"9小时前","pic_type":"0","praise_count":"66","tag_imgs":[],"newsCategoryId":"0"},{"id":"8438495","title":"解放军在南海的一恐怖画面吓坏了美菲越","picOne":"http://m.miercn.com/uploads/allimg/160330/1122311-1603301K6490-L.jpg","picTwo":"","picThr":"","summary":"英国媒体网站3月23日报道，最近的卫星照片显示，中国在西沙群岛永兴岛部署了鹰击-62远程反舰导弹，该刊认为这表明中国正显着增强南海防御能力。 针对外媒炒作我","publishTime":"1459375633","local":"","mark":"0","comment":"","commentNum":"47","isLarge":"false","timeAgo":"9小时前","pic_type":"0","praise_count":"71","tag_imgs":[],"newsCategoryId":"0"}]}
     */

    private int error;
    private int code;
    private String code_desc;
    private String msg;
    private int is_login;
    private int app_id;
    private DataBean data;

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getCode_desc() {
        return code_desc;
    }

    public void setCode_desc(String code_desc) {
        this.code_desc = code_desc;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getIs_login() {
        return is_login;
    }

    public void setIs_login(int is_login) {
        this.is_login = is_login;
    }

    public int getApp_id() {
        return app_id;
    }

    public void setApp_id(int app_id) {
        this.app_id = app_id;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean implements Parcelable{
        /**
         * id : 8459530
         * title : 美称可随时拉闸中国电网 北京两招轻松化解
         * picOne : http://m.miercn.com/uploads/allimg/160331/2433-1603310T9590-L.jpg
         * picTwo :
         * picThr :
         * summary : 掌握着别人电网的开关，这听起来有点天方夜谭。不过确确实实在我们实际生活中，就发生了。由于电网本身属于基础设施，分布想当广泛，节点也多，一环套一环。以中
         * publishTime : 1459410351
         * local :
         * mark : 0
         * comment :
         * commentNum : 1
         * isLarge : false
         * timeAgo : 11分钟前
         * pic_type : 0
         * praise_count : 6
         * tag_imgs : []
         * newsCategoryId : 0
         */
        private boolean isDataBean;
        private List<NewsListBean> newsList;

        protected DataBean(Parcel in) {
            isDataBean = in.readByte() != 0;
        }

        public static final Creator<DataBean> CREATOR = new Creator<DataBean>() {
            @Override
            public DataBean createFromParcel(Parcel in) {
                return new DataBean(in);
            }

            @Override
            public DataBean[] newArray(int size) {
                return new DataBean[size];
            }
        };

        public List<NewsListBean> getNewsList() {
            return newsList;
        }

        public void setNewsList(List<NewsListBean> newsList) {
            this.newsList = newsList;
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
            dest.writeByte((byte) (isDataBean ? 1 : 0));
        }

        public static class NewsListBean implements Parcelable{
            private boolean IsNews;
            private String id;
            private String title;
            private String picOne;
            private String picTwo;
            private String picThr;
            private String summary;
            private String publishTime;
            private String local;
            private String mark;
            private String comment;
            private String commentNum;
            private String isLarge;
            private String timeAgo;
            private String pic_type;
            private String praise_count;
            private String newsCategoryId;
            private List<?> tag_imgs;

            protected NewsListBean(Parcel in) {
                IsNews = in.readByte() != 0;
                id = in.readString();
                title = in.readString();
                picOne = in.readString();
                picTwo = in.readString();
                picThr = in.readString();
                summary = in.readString();
                publishTime = in.readString();
                local = in.readString();
                mark = in.readString();
                comment = in.readString();
                commentNum = in.readString();
                isLarge = in.readString();
                timeAgo = in.readString();
                pic_type = in.readString();
                praise_count = in.readString();
                newsCategoryId = in.readString();
            }

            public static final Creator<NewsListBean> CREATOR = new Creator<NewsListBean>() {
                @Override
                public NewsListBean createFromParcel(Parcel in) {
                    return new NewsListBean(in);
                }

                @Override
                public NewsListBean[] newArray(int size) {
                    return new NewsListBean[size];
                }
            };

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

            public String getPicOne() {
                return picOne;
            }

            public void setPicOne(String picOne) {
                this.picOne = picOne;
            }

            public String getPicTwo() {
                return picTwo;
            }

            public void setPicTwo(String picTwo) {
                this.picTwo = picTwo;
            }

            public String getPicThr() {
                return picThr;
            }

            public void setPicThr(String picThr) {
                this.picThr = picThr;
            }

            public String getSummary() {
                return summary;
            }

            public void setSummary(String summary) {
                this.summary = summary;
            }

            public String getPublishTime() {
                return publishTime;
            }

            public void setPublishTime(String publishTime) {
                this.publishTime = publishTime;
            }

            public String getLocal() {
                return local;
            }

            public void setLocal(String local) {
                this.local = local;
            }

            public String getMark() {
                return mark;
            }

            public void setMark(String mark) {
                this.mark = mark;
            }

            public String getComment() {
                return comment;
            }

            public void setComment(String comment) {
                this.comment = comment;
            }

            public String getCommentNum() {
                return commentNum;
            }

            public void setCommentNum(String commentNum) {
                this.commentNum = commentNum;
            }

            public String getIsLarge() {
                return isLarge;
            }

            public void setIsLarge(String isLarge) {
                this.isLarge = isLarge;
            }

            public String getTimeAgo() {
                return timeAgo;
            }

            public void setTimeAgo(String timeAgo) {
                this.timeAgo = timeAgo;
            }

            public String getPic_type() {
                return pic_type;
            }

            public void setPic_type(String pic_type) {
                this.pic_type = pic_type;
            }

            public String getPraise_count() {
                return praise_count;
            }

            public void setPraise_count(String praise_count) {
                this.praise_count = praise_count;
            }

            public String getNewsCategoryId() {
                return newsCategoryId;
            }

            public void setNewsCategoryId(String newsCategoryId) {
                this.newsCategoryId = newsCategoryId;
            }

            public List<?> getTag_imgs() {
                return tag_imgs;
            }

            public void setTag_imgs(List<?> tag_imgs) {
                this.tag_imgs = tag_imgs;
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
                dest.writeByte((byte) (IsNews ? 1 : 0));
                dest.writeString(id);
                dest.writeString(title);
                dest.writeString(picOne);
                dest.writeString(picTwo);
                dest.writeString(picThr);
                dest.writeString(summary);
                dest.writeString(publishTime);
                dest.writeString(local);
                dest.writeString(mark);
                dest.writeString(comment);
                dest.writeString(commentNum);
                dest.writeString(isLarge);
                dest.writeString(timeAgo);
                dest.writeString(pic_type);
                dest.writeString(praise_count);
                dest.writeString(newsCategoryId);
            }
        }
    }
}
