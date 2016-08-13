package org.luozetian.mynews.been;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

/**
 * Created by sam on 2016/3/29.
 */
public class NewsthreeData {

    /**
     * status : 200
     * data : {"count":5,"has_next":0,"cursor":20,"columns":[{"column_id":615,"content_size":6,"load_more":1,"column_type":18,"name":"恶搞吐槽","action_list":[],"template":{"main_title":"video_name","sub_title":"nickname","bottom_title":"play_count","template_id":14},"data_list":[{"vid":83324669,"aid":1000000200660,"site":2,"video_name":"辣评女子被指强暴男同事","data_type":34,"hor_w6_pic":"http://001.img.pu.sohu.com.cn/group2/M11/91/E8/MTAuMTAuODguODE=/dXBsb2FkRmlsZV8zXzE0NTkwOTM1MDI4MzI=/cut@m=force,w=240,h=135.jpg","hor_w8_pic":"http://001.img.pu.sohu.com.cn/group2/M11/91/E8/MTAuMTAuODguODE=/dXBsb2FkRmlsZV8zXzE0NTkwOTM1MDI4MzI=/cut@m=force,w=320,h=180.jpg","play_count":354948,"user_id":98272669,"nickname":"文小略","priority":0,"album_name":"小略周一贱（每周一更新）","album_hor_small_pic":"http://photocdn.sohu.com/tvpgc/20151119/u3439447_14931b2077eg201b_43_3.jpg"},{"vid":83311317,"aid":1000000200578,"site":2,"video_name":"带别人老婆吃饭能打折","data_type":34,"hor_w6_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_240,h_135/p222/2016/3/26/10/1/6_1548e8272afg104SysCutcloud_83311317_7_0b.jpg","hor_w8_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_320,h_180/p222/2016/3/26/10/1/6_1548e8272afg104SysCutcloud_83311317_7_0b.jpg","play_count":146714,"user_id":39027205,"nickname":"开心一笑","priority":1,"album_name":"开心一笑（每周二、周六定期与您相约）","album_hor_small_pic":"http://photocdn.sohu.com/tvpgc/20140924/u3439447_14979633d42g201b_43_3.jpg"},{"vid":83320521,"aid":1000000375371,"site":2,"video_name":"最奇葩的复古武侠片","data_type":34,"hor_w6_pic":"http://001.img.pu.sohu.com.cn/group3/M12/9B/F5/MTAuMTAuODguODQ=/dXBsb2FkRmlsZV8zXzE0NTkwNTQyNDY4MzU=/cut@m=force,w=240,h=135.jpg","hor_w8_pic":"http://001.img.pu.sohu.com.cn/group3/M12/9B/F5/MTAuMTAuODguODQ=/dXBsb2FkRmlsZV8zXzE0NTkwNTQyNDY4MzU=/cut@m=force,w=320,h=180.jpg","play_count":66051,"user_id":210752066,"nickname":"笑点研究所","priority":2,"album_name":"小黄人吐槽","album_hor_small_pic":"http://photocdn.sohu.com/tvpgc/20150225/216251639_14c94517a5dg201b_43_3.jpg"},{"vid":83316540,"aid":1000000362766,"site":2,"video_name":"不老女神如何泡到小鲜肉","data_type":34,"hor_w6_pic":"http://001.img.pu.sohu.com.cn/group1/M09/99/F9/MTAuMTAuODguNzk=/dXBsb2FkRmlsZV8zXzE0NTg5OTY4MzU4OTg=/cut@m=force,w=240,h=135.jpg","hor_w8_pic":"http://001.img.pu.sohu.com.cn/group1/M09/99/F9/MTAuMTAuODguNzk=/dXBsb2FkRmlsZV8zXzE0NTg5OTY4MzU4OTg=/cut@m=force,w=320,h=180.jpg","play_count":40707,"user_id":202939688,"nickname":"DS女老诗","priority":3,"album_name":"萝莉说趣事","album_hor_small_pic":"http://photocdn.sohu.com/tvpgc/20150216/53468100_14b995f82ecg201b_43_3.jpg"},{"vid":82711585,"aid":1000000375596,"site":2,"video_name":"为什么剩女都是爱无能","data_type":34,"hor_w6_pic":"http://001.img.pu.sohu.com.cn/group2/M12/40/6C/MTAuMTAuODguODE=/dXBsb2FkRmlsZV8zXzE0NTI0ODQwMjMzMDU=/cut@m=force,w=240,h=135.jpg","hor_w8_pic":"http://photocdn.sohu.com/tvmobilemvms/20160323/145869977369319328.jpg","play_count":445266,"user_id":247245585,"nickname":"小题影视","priority":4,"album_name":"郑在秀","album_hor_small_pic":"http://photocdn.sohu.com/tvpgc/20150921/13436476_14cb86ad7d8g201b_43_3.jpg"},{"vid":83324222,"aid":1000000201090,"site":2,"video_name":"美女睡觉遭剃头恶作剧","data_type":34,"hor_w6_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_240,h_135/p225/2016/3/27/22/4/6_154963f793ag102SysCutcloud_83324222_7_6b.jpg","hor_w8_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_320,h_180/p225/2016/3/27/22/4/6_154963f793ag102SysCutcloud_83324222_7_6b.jpg","play_count":53288,"user_id":205090153,"nickname":"春se无边1983","priority":5,"album_name":"春色无边恶搞","album_hor_small_pic":"http://photocdn.sohu.com/tvpgc/20150201/u3439447_1494ade73b9g201b_43_3.jpg"}]},{"column_id":616,"content_size":6,"load_more":1,"column_type":18,"name":"混剪配音/穿帮","action_list":[],"template":{"main_title":"video_name","sub_title":"nickname","bottom_title":"play_count","template_id":14},"data_list":[{"vid":83286381,"aid":1000000200847,"site":2,"video_name":"那些穿帮成瘾的剧组人员","data_type":34,"hor_w6_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_240,h_135/p225/2016/3/24/8/26/55220112_15483e99561g201cloud_1b.jpg","hor_w8_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_320,h_180/p225/2016/3/24/8/26/55220112_15483e99561g201cloud_1b.jpg","play_count":137284,"user_id":55220112,"nickname":"何仙姑夫","priority":0,"album_name":"麦兜找穿帮（每周二、周五更新）","album_hor_small_pic":"http://photocdn.sohu.com/tvpgc/20141021/u3439447_14936677d71g201b_43_3.jpg"},{"vid":82346296,"aid":1000000402849,"site":2,"video_name":"剑少兮：女神交租风云","data_type":34,"hor_w6_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_240,h_135/p223/2015/12/4/1/24/0_1524404c1d7g201b.jpg","hor_w8_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_320,h_180/p223/2015/12/4/1/24/0_1524404c1d7g201b.jpg","play_count":844625,"user_id":190595180,"nickname":"剑少兮","priority":1,"album_name":"剑少兮风云系列作品","album_hor_small_pic":"http://photocdn.sohu.com/tvpgc/20150717/0_14f720d7c21g201b_43_3.jpg"},{"vid":83323107,"aid":1000000364582,"site":2,"video_name":"《我爱男保姆》五大穿帮镜头","data_type":34,"hor_w6_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_240,h_135/p222/2016/3/27/18/20/6_154958dc03eg102SysCutcloud_83323107_7_0b.jpg","hor_w8_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_320,h_180/p222/2016/3/27/18/20/6_154958dc03eg102SysCutcloud_83323107_7_0b.jpg","play_count":60083,"user_id":198160200,"nickname":"袁超工作室","priority":2,"album_name":"袁超工作室","album_hor_small_pic":"http://photocdn.sohu.com/tvpgc/20150419/216251639_14bbcd21b7cg201b_43_3.jpg"},{"vid":83275081,"aid":1000000390527,"site":2,"video_name":"节操找茬之远得要命的爱情","data_type":34,"hor_w6_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_240,h_135/p225/2016/3/23/2/27/6_1547d6f7c71g104SysCutcloud_83275081_7_4b.jpg","hor_w8_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_320,h_180/p225/2016/3/23/2/27/6_1547d6f7c71g104SysCutcloud_83275081_7_4b.jpg","play_count":15143,"user_id":223465805,"nickname":"节操协会","priority":3,"album_name":"穿帮找茬","album_hor_small_pic":"http://photocdn.sohu.com/tvpgc/20150521/0_14e4dc4455dg201b_43_3.jpg"},{"vid":83204050,"aid":1000000201195,"site":2,"video_name":"《疯狂动物城》各地方言版","data_type":34,"hor_w6_pic":"http://001.img.pu.sohu.com.cn/group1/M05/8F/33/MTAuMTAuODguNzk=/dXBsb2FkRmlsZV8zXzE0NTgwNTMwODIwNjE=/cut@m=force,w=240,h=135.jpg","hor_w8_pic":"http://001.img.pu.sohu.com.cn/group1/M05/8F/33/MTAuMTAuODguNzk=/dXBsb2FkRmlsZV8zXzE0NTgwNTMwODIwNjE=/cut@m=force,w=320,h=180.jpg","play_count":61550,"user_id":216312142,"nickname":"单丝映画","priority":4,"album_name":"【经典剪辑】 ","album_hor_small_pic":"http://photocdn.sohu.com/tvpgc/20140917/u3439447_14955282d87g201b_43_3.jpg"},{"vid":82880017,"aid":1000000390785,"site":2,"video_name":"笑喷了！唐僧蹭饭记","data_type":34,"hor_w6_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_240,h_135/p222/2016/1/30/15/25/6_1536e54f6d3g104SysCutcloud_82880017_7_1b.jpg","hor_w8_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_320,h_180/p222/2016/1/30/15/25/6_1536e54f6d3g104SysCutcloud_82880017_7_1b.jpg","play_count":222025,"user_id":226139820,"nickname":"倔强的大坑","priority":5,"album_name":"坑你一笑","album_hor_small_pic":"http://photocdn.sohu.com/tvpgc/20151119/216251639_14e61ece0c0g201b_43_3.jpg"}]},{"column_id":617,"content_size":6,"load_more":1,"column_type":18,"name":"奇闻趣事","action_list":[],"template":{"main_title":"video_name","sub_title":"nickname","bottom_title":"play_count","template_id":14},"data_list":[{"vid":83319989,"aid":1000000367628,"site":2,"video_name":"播种醉酒哥们 收获基情之果","data_type":34,"hor_w6_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_240,h_135/p223/2016/3/27/13/9/6_1549454ec4ag102SysCutcloud_83319989_8_4b.jpg","hor_w8_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_320,h_180/p223/2016/3/27/13/9/6_1549454ec4ag102SysCutcloud_83319989_8_4b.jpg","play_count":183759,"user_id":244419240,"nickname":"56原创乐分享","priority":0,"album_name":"原创乐分享 (每周一更新）","album_hor_small_pic":"http://photocdn.sohu.com/tvpgc/20150717/13436476_14c002eb4a5g201b_43_3.jpg"},{"vid":83310677,"aid":1000000389470,"site":2,"video_name":"男按摩师为半裸美女推油","data_type":34,"hor_w6_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_240,h_135/p222/2016/3/26/8/9/6_1548e377e3cg102SysCutcloud_83310677_7_0b.jpg","hor_w8_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_320,h_180/p222/2016/3/26/8/9/6_1548e377e3cg102SysCutcloud_83310677_7_0b.jpg","play_count":487310,"user_id":254538925,"nickname":"阿Q先生SOHU","priority":1,"album_name":"内涵视频","album_hor_small_pic":"http://photocdn.sohu.com/tvpgc/20151219/13436476_14dfb50a727g201b_43_3.jpg"},{"vid":83286065,"aid":1000000367625,"site":2,"video_name":"屌丝如何正确调戏siri","data_type":34,"hor_w6_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_240,h_135/p225/2016/3/24/19/17/6_1548632e0a6g104SysCutcloud_83294768_7_6b.jpg","hor_w8_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_320,h_180/p225/2016/3/24/19/17/6_1548632e0a6g104SysCutcloud_83294768_7_6b.jpg","play_count":989838,"user_id":244419527,"nickname":"兄弟帮帮忙","priority":2,"album_name":"兄弟帮帮忙","album_hor_small_pic":"http://photocdn.sohu.com/tvpgc/20150127/13436476_14c0032c264g201b_43_3.jpg"},{"vid":81490510,"aid":1000000201087,"site":2,"video_name":"娇小妹子教你月入百万","data_type":34,"hor_w6_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_240,h_135/p225/2015/9/17/9/1/213135597_150b323de87g201cloud_1b.jpg","hor_w8_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_320,h_180/p225/2015/9/17/9/1/213135597_150b323de87g201cloud_1b.jpg","play_count":1854060,"user_id":213135597,"nickname":"爱达V视","priority":3,"album_name":"每日一瞎2015","album_hor_small_pic":"http://photocdn.sohu.com/tvpgc/20140924/u3439447_149799fee52g201b_43_3.jpg"},{"vid":83236865,"aid":1000000402855,"site":2,"video_name":"公公胜！父子同抢一个女人","data_type":34,"hor_w6_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_240,h_135/p223/2016/3/18/23/9/6_15468211ed5g102SysCutcloud_83236865_7_0b.jpg","hor_w8_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_320,h_180/p223/2016/3/18/23/9/6_15468211ed5g102SysCutcloud_83236865_7_0b.jpg","play_count":348523,"user_id":92382754,"nickname":"QM工作室","priority":4,"album_name":"奇闻周刊(每周六更新）","album_hor_small_pic":"http://photocdn.sohu.com/tvpgc/20150717/0_14f720e15f3g201b_43_3.jpg"},{"vid":83267442,"aid":1000000200578,"site":2,"video_name":"诱惑到舔屏  浑身都是戏","data_type":34,"hor_w6_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_240,h_135/p223/2016/3/22/11/18/6_1547a4b4834g102SysCutcloud_83267442_7_4b.jpg","hor_w8_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_320,h_180/p223/2016/3/22/11/18/6_1547a4b4834g102SysCutcloud_83267442_7_4b.jpg","play_count":468942,"user_id":39027205,"nickname":"开心一笑","priority":5,"album_name":"开心一笑（每周二、周六定期与您相约）","album_hor_small_pic":"http://photocdn.sohu.com/tvpgc/20140924/u3439447_14979633d42g201b_43_3.jpg"}]},{"column_id":618,"content_size":6,"load_more":1,"column_type":18,"name":"音乐歪唱","action_list":[],"template":{"main_title":"video_name","sub_title":"nickname","bottom_title":"play_count","template_id":14},"data_list":[{"vid":82886795,"aid":1000000364652,"site":2,"video_name":"一男拖八女这才叫开挂","data_type":34,"hor_w6_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_240,h_135/p222/2016/2/1/0/27/6_153756c03d9g102SysCutcloud_82886795_7_3b.jpg","hor_w8_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_320,h_180/p222/2016/2/1/0/27/6_153756c03d9g102SysCutcloud_82886795_7_3b.jpg","play_count":188187,"user_id":216312142,"nickname":"单丝映画","priority":0,"album_name":"【奇葩谈唱】 ","album_hor_small_pic":"http://photocdn.sohu.com/tvpgc/20150805/216251639_14bc0dc1657g201b_43_3.jpg"},{"vid":83164383,"aid":1000000564015,"site":2,"video_name":"我就是炮哥","data_type":34,"hor_w6_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_240,h_135/p222/2016/3/11/13/5/6_1544207203ag104SysCutcloud_83164383_7_3b.jpg","hor_w8_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_320,h_180/p222/2016/3/11/13/5/6_1544207203ag104SysCutcloud_83164383_7_3b.jpg","play_count":141259,"user_id":289911453,"nickname":"网剧小青年","priority":1,"album_name":"我就是炮哥剧情版","album_hor_small_pic":"http://photocdn.sohu.com/tvpgc/20160323/dXBsb2FkRmlsZV80XzE0NTg3MjYwOTA1NTU=_43_3.jpg"},{"vid":75965399,"aid":1000000200543,"site":2,"video_name":"妹纸南京话歪搞我的滑板鞋","data_type":34,"hor_w6_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_240,h_135/p223/2014/11/6/22/8/6_14a591368a3g102SysCutcloud_75965399_7_3b.jpg","hor_w8_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_320,h_180/p223/2014/11/6/22/8/6_14a591368a3g102SysCutcloud_75965399_7_3b.jpg","play_count":2334240,"user_id":5087881,"nickname":"声琴相拥","priority":2,"album_name":"声琴相拥歪歌作品","album_hor_small_pic":"http://photocdn.sohu.com/tvpgc/20140923/u3439447_1493ae0c0d9g201b_43_3.jpg"},{"vid":81699403,"aid":1000000550277,"site":2,"video_name":"刘德华<咱们屯里人>粤语版","data_type":34,"hor_w6_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_240,h_135/p222/2015/10/8/12/16/6_1511ffbba18g104SysCutcloud_81699403_7_1b.jpg","hor_w8_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_320,h_180/p222/2015/10/8/12/16/6_1511ffbba18g104SysCutcloud_81699403_7_1b.jpg","play_count":504049,"user_id":254538925,"nickname":"阿Q先生SOHU","priority":3,"album_name":"歪歌联盟","album_hor_small_pic":"http://photocdn.sohu.com/tvpgc/20151219/dXBsb2FkRmlsZV80XzE0NDYxMDUxOTA2ODk=_43_3.jpg"},{"vid":83128960,"aid":1000000201197,"site":2,"video_name":"三八节神曲<妻管严>","data_type":34,"hor_w6_pic":"http://001.img.pu.sohu.com.cn/group1/M12/86/3E/MTAuMTAuODguODA=/dXBsb2FkRmlsZV8zXzE0NTczNjI3Nzc5OTI=/cut@m=force,w=240,h=135.jpg","hor_w8_pic":"http://001.img.pu.sohu.com.cn/group1/M12/86/3E/MTAuMTAuODguODA=/dXBsb2FkRmlsZV8zXzE0NTczNjI3Nzc5OTI=/cut@m=force,w=320,h=180.jpg","play_count":375412,"user_id":4416350,"nickname":"咚哥唱谈","priority":4,"album_name":"咚哥唱谈","album_hor_small_pic":"http://photocdn.sohu.com/tvpgc/20150527/u3439447_149369fb4a4g201b_43_3.jpg"},{"vid":81181533,"aid":1000000402848,"site":2,"video_name":"歪唱少林CEO<佛在何方>","data_type":34,"hor_w6_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_240,h_135/p225/2015/8/19/20/20/190595180_1501f79e121g201cloud_1b.jpg","hor_w8_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_320,h_180/p225/2015/8/19/20/20/190595180_1501f79e121g201cloud_1b.jpg","play_count":28381,"user_id":190595180,"nickname":"剑少兮","priority":5,"album_name":"剑少兮爆笑歪唱作品","album_hor_small_pic":"http://photocdn.sohu.com/tvpgc/20150717/0_14f72127005g201b_43_3.jpg"}]},{"column_id":619,"content_size":6,"load_more":1,"column_type":18,"name":"搞笑动画","action_list":[],"template":{"main_title":"video_name","sub_title":"nickname","bottom_title":"play_count","template_id":14},"data_list":[{"vid":83332270,"aid":1000000561342,"site":2,"video_name":"男子半夜劫色被美女秒杀","data_type":34,"hor_w8_pic":"http://photocdn.sohu.com/tvpgc/20160328/6_1549a6c6147g102SysCutcloud_83332270_7_0b_169_2.jpg","play_count":128,"user_id":283849056,"nickname":"暴走官方","priority":0,"album_name":"暴走每日一暴","album_hor_small_pic":"http://photocdn.sohu.com/tvpgc/20160311/dXBsb2FkRmlsZV80XzE0NTc2NzYzOTcxODE=_43_2.jpg"},{"vid":83328569,"aid":1000000558663,"site":2,"video_name":"女生独自在家都在干什么","data_type":34,"hor_w8_pic":"http://photocdn.sohu.com/tvpgc/20160328/dXBsb2FkRmlsZV8zXzE0NTkxMzY4NjAzOTY=_169_2.jpg","play_count":2234,"user_id":277836221,"nickname":"爆漫画工作室","priority":1,"album_name":"涨姿势","album_hor_small_pic":"http://photocdn.sohu.com/tvpgc/20160118/dXBsb2FkRmlsZV80XzE0NTI3NTE0NTAxMzU=_43_2.jpg"},{"vid":83338271,"aid":1000000551769,"site":2,"video_name":"学渣如何快速成为高级白领","data_type":34,"hor_w8_pic":"http://photocdn.sohu.com/tvmobile/20160329/14592185549381243.jpg","play_count":5374,"user_id":219361108,"nickname":"沃森映画","priority":2,"album_name":"冷三笑第二季","album_hor_small_pic":"http://photocdn.sohu.com/tvpgc/20151208/dXBsb2FkRmlsZV80XzE0NDk1Mzg3MDA1NjM=_43_2.jpg"},{"vid":83332827,"aid":1000000201157,"site":2,"video_name":"谁是宋仲基老公背后的女人","data_type":34,"hor_w8_pic":"http://photocdn.sohu.com/tvmobile/20160328/14591597963261339.jpg","play_count":15809,"user_id":196915464,"nickname":"飞碟说","priority":3,"album_name":"飞碟说","album_hor_small_pic":"http://photocdn.sohu.com/tvpgc/20141011/u3439447_149d1c51473g201b_43_2.jpg"},{"vid":83335509,"aid":1000000200916,"site":2,"video_name":"啪啪啪的时候什么最重要","data_type":34,"hor_w8_pic":"http://photocdn.sohu.com/tvpgc/20160328/6_1549b717172g102SysCutcloud_83335171_7_0b_169_2.jpg","play_count":3842,"user_id":209339243,"nickname":"嗨小冷官方频道","priority":4,"album_name":"疏格文化","album_hor_small_pic":"http://photocdn.sohu.com/tvpgc/20141024/u3439447_14a1569f71ag201b_43_2.jpg"},{"vid":83333495,"aid":1000000389241,"site":2,"video_name":"十二星座见到男神时的反应","data_type":34,"hor_w6_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_240,h_135/p224/2016/3/28/19/21/6_1549ad01573g102SysCutcloud_83333495_7_2b.jpg","hor_w8_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_320,h_180/p224/2016/3/28/19/21/6_1549ad01573g102SysCutcloud_83333495_7_2b.jpg","play_count":15988,"user_id":205055095,"nickname":"秀策坊画动画","priority":5,"album_name":"星座奇葩事","album_hor_small_pic":"http://photocdn.sohu.com/tvpgc/20160328/216251588_14de075125eg201b_43_3.jpg"}]}]}
     * statusText : OK
     */

    private int status;
    /**
     * count : 5
     * has_next : 0
     * cursor : 20
     * columns : [{"column_id":615,"content_size":6,"load_more":1,"column_type":18,"name":"恶搞吐槽","action_list":[],"template":{"main_title":"video_name","sub_title":"nickname","bottom_title":"play_count","template_id":14},"data_list":[{"vid":83324669,"aid":1000000200660,"site":2,"video_name":"辣评女子被指强暴男同事","data_type":34,"hor_w6_pic":"http://001.img.pu.sohu.com.cn/group2/M11/91/E8/MTAuMTAuODguODE=/dXBsb2FkRmlsZV8zXzE0NTkwOTM1MDI4MzI=/cut@m=force,w=240,h=135.jpg","hor_w8_pic":"http://001.img.pu.sohu.com.cn/group2/M11/91/E8/MTAuMTAuODguODE=/dXBsb2FkRmlsZV8zXzE0NTkwOTM1MDI4MzI=/cut@m=force,w=320,h=180.jpg","play_count":354948,"user_id":98272669,"nickname":"文小略","priority":0,"album_name":"小略周一贱（每周一更新）","album_hor_small_pic":"http://photocdn.sohu.com/tvpgc/20151119/u3439447_14931b2077eg201b_43_3.jpg"},{"vid":83311317,"aid":1000000200578,"site":2,"video_name":"带别人老婆吃饭能打折","data_type":34,"hor_w6_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_240,h_135/p222/2016/3/26/10/1/6_1548e8272afg104SysCutcloud_83311317_7_0b.jpg","hor_w8_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_320,h_180/p222/2016/3/26/10/1/6_1548e8272afg104SysCutcloud_83311317_7_0b.jpg","play_count":146714,"user_id":39027205,"nickname":"开心一笑","priority":1,"album_name":"开心一笑（每周二、周六定期与您相约）","album_hor_small_pic":"http://photocdn.sohu.com/tvpgc/20140924/u3439447_14979633d42g201b_43_3.jpg"},{"vid":83320521,"aid":1000000375371,"site":2,"video_name":"最奇葩的复古武侠片","data_type":34,"hor_w6_pic":"http://001.img.pu.sohu.com.cn/group3/M12/9B/F5/MTAuMTAuODguODQ=/dXBsb2FkRmlsZV8zXzE0NTkwNTQyNDY4MzU=/cut@m=force,w=240,h=135.jpg","hor_w8_pic":"http://001.img.pu.sohu.com.cn/group3/M12/9B/F5/MTAuMTAuODguODQ=/dXBsb2FkRmlsZV8zXzE0NTkwNTQyNDY4MzU=/cut@m=force,w=320,h=180.jpg","play_count":66051,"user_id":210752066,"nickname":"笑点研究所","priority":2,"album_name":"小黄人吐槽","album_hor_small_pic":"http://photocdn.sohu.com/tvpgc/20150225/216251639_14c94517a5dg201b_43_3.jpg"},{"vid":83316540,"aid":1000000362766,"site":2,"video_name":"不老女神如何泡到小鲜肉","data_type":34,"hor_w6_pic":"http://001.img.pu.sohu.com.cn/group1/M09/99/F9/MTAuMTAuODguNzk=/dXBsb2FkRmlsZV8zXzE0NTg5OTY4MzU4OTg=/cut@m=force,w=240,h=135.jpg","hor_w8_pic":"http://001.img.pu.sohu.com.cn/group1/M09/99/F9/MTAuMTAuODguNzk=/dXBsb2FkRmlsZV8zXzE0NTg5OTY4MzU4OTg=/cut@m=force,w=320,h=180.jpg","play_count":40707,"user_id":202939688,"nickname":"DS女老诗","priority":3,"album_name":"萝莉说趣事","album_hor_small_pic":"http://photocdn.sohu.com/tvpgc/20150216/53468100_14b995f82ecg201b_43_3.jpg"},{"vid":82711585,"aid":1000000375596,"site":2,"video_name":"为什么剩女都是爱无能","data_type":34,"hor_w6_pic":"http://001.img.pu.sohu.com.cn/group2/M12/40/6C/MTAuMTAuODguODE=/dXBsb2FkRmlsZV8zXzE0NTI0ODQwMjMzMDU=/cut@m=force,w=240,h=135.jpg","hor_w8_pic":"http://photocdn.sohu.com/tvmobilemvms/20160323/145869977369319328.jpg","play_count":445266,"user_id":247245585,"nickname":"小题影视","priority":4,"album_name":"郑在秀","album_hor_small_pic":"http://photocdn.sohu.com/tvpgc/20150921/13436476_14cb86ad7d8g201b_43_3.jpg"},{"vid":83324222,"aid":1000000201090,"site":2,"video_name":"美女睡觉遭剃头恶作剧","data_type":34,"hor_w6_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_240,h_135/p225/2016/3/27/22/4/6_154963f793ag102SysCutcloud_83324222_7_6b.jpg","hor_w8_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_320,h_180/p225/2016/3/27/22/4/6_154963f793ag102SysCutcloud_83324222_7_6b.jpg","play_count":53288,"user_id":205090153,"nickname":"春se无边1983","priority":5,"album_name":"春色无边恶搞","album_hor_small_pic":"http://photocdn.sohu.com/tvpgc/20150201/u3439447_1494ade73b9g201b_43_3.jpg"}]},{"column_id":616,"content_size":6,"load_more":1,"column_type":18,"name":"混剪配音/穿帮","action_list":[],"template":{"main_title":"video_name","sub_title":"nickname","bottom_title":"play_count","template_id":14},"data_list":[{"vid":83286381,"aid":1000000200847,"site":2,"video_name":"那些穿帮成瘾的剧组人员","data_type":34,"hor_w6_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_240,h_135/p225/2016/3/24/8/26/55220112_15483e99561g201cloud_1b.jpg","hor_w8_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_320,h_180/p225/2016/3/24/8/26/55220112_15483e99561g201cloud_1b.jpg","play_count":137284,"user_id":55220112,"nickname":"何仙姑夫","priority":0,"album_name":"麦兜找穿帮（每周二、周五更新）","album_hor_small_pic":"http://photocdn.sohu.com/tvpgc/20141021/u3439447_14936677d71g201b_43_3.jpg"},{"vid":82346296,"aid":1000000402849,"site":2,"video_name":"剑少兮：女神交租风云","data_type":34,"hor_w6_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_240,h_135/p223/2015/12/4/1/24/0_1524404c1d7g201b.jpg","hor_w8_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_320,h_180/p223/2015/12/4/1/24/0_1524404c1d7g201b.jpg","play_count":844625,"user_id":190595180,"nickname":"剑少兮","priority":1,"album_name":"剑少兮风云系列作品","album_hor_small_pic":"http://photocdn.sohu.com/tvpgc/20150717/0_14f720d7c21g201b_43_3.jpg"},{"vid":83323107,"aid":1000000364582,"site":2,"video_name":"《我爱男保姆》五大穿帮镜头","data_type":34,"hor_w6_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_240,h_135/p222/2016/3/27/18/20/6_154958dc03eg102SysCutcloud_83323107_7_0b.jpg","hor_w8_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_320,h_180/p222/2016/3/27/18/20/6_154958dc03eg102SysCutcloud_83323107_7_0b.jpg","play_count":60083,"user_id":198160200,"nickname":"袁超工作室","priority":2,"album_name":"袁超工作室","album_hor_small_pic":"http://photocdn.sohu.com/tvpgc/20150419/216251639_14bbcd21b7cg201b_43_3.jpg"},{"vid":83275081,"aid":1000000390527,"site":2,"video_name":"节操找茬之远得要命的爱情","data_type":34,"hor_w6_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_240,h_135/p225/2016/3/23/2/27/6_1547d6f7c71g104SysCutcloud_83275081_7_4b.jpg","hor_w8_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_320,h_180/p225/2016/3/23/2/27/6_1547d6f7c71g104SysCutcloud_83275081_7_4b.jpg","play_count":15143,"user_id":223465805,"nickname":"节操协会","priority":3,"album_name":"穿帮找茬","album_hor_small_pic":"http://photocdn.sohu.com/tvpgc/20150521/0_14e4dc4455dg201b_43_3.jpg"},{"vid":83204050,"aid":1000000201195,"site":2,"video_name":"《疯狂动物城》各地方言版","data_type":34,"hor_w6_pic":"http://001.img.pu.sohu.com.cn/group1/M05/8F/33/MTAuMTAuODguNzk=/dXBsb2FkRmlsZV8zXzE0NTgwNTMwODIwNjE=/cut@m=force,w=240,h=135.jpg","hor_w8_pic":"http://001.img.pu.sohu.com.cn/group1/M05/8F/33/MTAuMTAuODguNzk=/dXBsb2FkRmlsZV8zXzE0NTgwNTMwODIwNjE=/cut@m=force,w=320,h=180.jpg","play_count":61550,"user_id":216312142,"nickname":"单丝映画","priority":4,"album_name":"【经典剪辑】 ","album_hor_small_pic":"http://photocdn.sohu.com/tvpgc/20140917/u3439447_14955282d87g201b_43_3.jpg"},{"vid":82880017,"aid":1000000390785,"site":2,"video_name":"笑喷了！唐僧蹭饭记","data_type":34,"hor_w6_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_240,h_135/p222/2016/1/30/15/25/6_1536e54f6d3g104SysCutcloud_82880017_7_1b.jpg","hor_w8_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_320,h_180/p222/2016/1/30/15/25/6_1536e54f6d3g104SysCutcloud_82880017_7_1b.jpg","play_count":222025,"user_id":226139820,"nickname":"倔强的大坑","priority":5,"album_name":"坑你一笑","album_hor_small_pic":"http://photocdn.sohu.com/tvpgc/20151119/216251639_14e61ece0c0g201b_43_3.jpg"}]},{"column_id":617,"content_size":6,"load_more":1,"column_type":18,"name":"奇闻趣事","action_list":[],"template":{"main_title":"video_name","sub_title":"nickname","bottom_title":"play_count","template_id":14},"data_list":[{"vid":83319989,"aid":1000000367628,"site":2,"video_name":"播种醉酒哥们 收获基情之果","data_type":34,"hor_w6_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_240,h_135/p223/2016/3/27/13/9/6_1549454ec4ag102SysCutcloud_83319989_8_4b.jpg","hor_w8_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_320,h_180/p223/2016/3/27/13/9/6_1549454ec4ag102SysCutcloud_83319989_8_4b.jpg","play_count":183759,"user_id":244419240,"nickname":"56原创乐分享","priority":0,"album_name":"原创乐分享 (每周一更新）","album_hor_small_pic":"http://photocdn.sohu.com/tvpgc/20150717/13436476_14c002eb4a5g201b_43_3.jpg"},{"vid":83310677,"aid":1000000389470,"site":2,"video_name":"男按摩师为半裸美女推油","data_type":34,"hor_w6_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_240,h_135/p222/2016/3/26/8/9/6_1548e377e3cg102SysCutcloud_83310677_7_0b.jpg","hor_w8_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_320,h_180/p222/2016/3/26/8/9/6_1548e377e3cg102SysCutcloud_83310677_7_0b.jpg","play_count":487310,"user_id":254538925,"nickname":"阿Q先生SOHU","priority":1,"album_name":"内涵视频","album_hor_small_pic":"http://photocdn.sohu.com/tvpgc/20151219/13436476_14dfb50a727g201b_43_3.jpg"},{"vid":83286065,"aid":1000000367625,"site":2,"video_name":"屌丝如何正确调戏siri","data_type":34,"hor_w6_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_240,h_135/p225/2016/3/24/19/17/6_1548632e0a6g104SysCutcloud_83294768_7_6b.jpg","hor_w8_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_320,h_180/p225/2016/3/24/19/17/6_1548632e0a6g104SysCutcloud_83294768_7_6b.jpg","play_count":989838,"user_id":244419527,"nickname":"兄弟帮帮忙","priority":2,"album_name":"兄弟帮帮忙","album_hor_small_pic":"http://photocdn.sohu.com/tvpgc/20150127/13436476_14c0032c264g201b_43_3.jpg"},{"vid":81490510,"aid":1000000201087,"site":2,"video_name":"娇小妹子教你月入百万","data_type":34,"hor_w6_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_240,h_135/p225/2015/9/17/9/1/213135597_150b323de87g201cloud_1b.jpg","hor_w8_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_320,h_180/p225/2015/9/17/9/1/213135597_150b323de87g201cloud_1b.jpg","play_count":1854060,"user_id":213135597,"nickname":"爱达V视","priority":3,"album_name":"每日一瞎2015","album_hor_small_pic":"http://photocdn.sohu.com/tvpgc/20140924/u3439447_149799fee52g201b_43_3.jpg"},{"vid":83236865,"aid":1000000402855,"site":2,"video_name":"公公胜！父子同抢一个女人","data_type":34,"hor_w6_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_240,h_135/p223/2016/3/18/23/9/6_15468211ed5g102SysCutcloud_83236865_7_0b.jpg","hor_w8_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_320,h_180/p223/2016/3/18/23/9/6_15468211ed5g102SysCutcloud_83236865_7_0b.jpg","play_count":348523,"user_id":92382754,"nickname":"QM工作室","priority":4,"album_name":"奇闻周刊(每周六更新）","album_hor_small_pic":"http://photocdn.sohu.com/tvpgc/20150717/0_14f720e15f3g201b_43_3.jpg"},{"vid":83267442,"aid":1000000200578,"site":2,"video_name":"诱惑到舔屏  浑身都是戏","data_type":34,"hor_w6_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_240,h_135/p223/2016/3/22/11/18/6_1547a4b4834g102SysCutcloud_83267442_7_4b.jpg","hor_w8_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_320,h_180/p223/2016/3/22/11/18/6_1547a4b4834g102SysCutcloud_83267442_7_4b.jpg","play_count":468942,"user_id":39027205,"nickname":"开心一笑","priority":5,"album_name":"开心一笑（每周二、周六定期与您相约）","album_hor_small_pic":"http://photocdn.sohu.com/tvpgc/20140924/u3439447_14979633d42g201b_43_3.jpg"}]},{"column_id":618,"content_size":6,"load_more":1,"column_type":18,"name":"音乐歪唱","action_list":[],"template":{"main_title":"video_name","sub_title":"nickname","bottom_title":"play_count","template_id":14},"data_list":[{"vid":82886795,"aid":1000000364652,"site":2,"video_name":"一男拖八女这才叫开挂","data_type":34,"hor_w6_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_240,h_135/p222/2016/2/1/0/27/6_153756c03d9g102SysCutcloud_82886795_7_3b.jpg","hor_w8_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_320,h_180/p222/2016/2/1/0/27/6_153756c03d9g102SysCutcloud_82886795_7_3b.jpg","play_count":188187,"user_id":216312142,"nickname":"单丝映画","priority":0,"album_name":"【奇葩谈唱】 ","album_hor_small_pic":"http://photocdn.sohu.com/tvpgc/20150805/216251639_14bc0dc1657g201b_43_3.jpg"},{"vid":83164383,"aid":1000000564015,"site":2,"video_name":"我就是炮哥","data_type":34,"hor_w6_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_240,h_135/p222/2016/3/11/13/5/6_1544207203ag104SysCutcloud_83164383_7_3b.jpg","hor_w8_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_320,h_180/p222/2016/3/11/13/5/6_1544207203ag104SysCutcloud_83164383_7_3b.jpg","play_count":141259,"user_id":289911453,"nickname":"网剧小青年","priority":1,"album_name":"我就是炮哥剧情版","album_hor_small_pic":"http://photocdn.sohu.com/tvpgc/20160323/dXBsb2FkRmlsZV80XzE0NTg3MjYwOTA1NTU=_43_3.jpg"},{"vid":75965399,"aid":1000000200543,"site":2,"video_name":"妹纸南京话歪搞我的滑板鞋","data_type":34,"hor_w6_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_240,h_135/p223/2014/11/6/22/8/6_14a591368a3g102SysCutcloud_75965399_7_3b.jpg","hor_w8_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_320,h_180/p223/2014/11/6/22/8/6_14a591368a3g102SysCutcloud_75965399_7_3b.jpg","play_count":2334240,"user_id":5087881,"nickname":"声琴相拥","priority":2,"album_name":"声琴相拥歪歌作品","album_hor_small_pic":"http://photocdn.sohu.com/tvpgc/20140923/u3439447_1493ae0c0d9g201b_43_3.jpg"},{"vid":81699403,"aid":1000000550277,"site":2,"video_name":"刘德华<咱们屯里人>粤语版","data_type":34,"hor_w6_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_240,h_135/p222/2015/10/8/12/16/6_1511ffbba18g104SysCutcloud_81699403_7_1b.jpg","hor_w8_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_320,h_180/p222/2015/10/8/12/16/6_1511ffbba18g104SysCutcloud_81699403_7_1b.jpg","play_count":504049,"user_id":254538925,"nickname":"阿Q先生SOHU","priority":3,"album_name":"歪歌联盟","album_hor_small_pic":"http://photocdn.sohu.com/tvpgc/20151219/dXBsb2FkRmlsZV80XzE0NDYxMDUxOTA2ODk=_43_3.jpg"},{"vid":83128960,"aid":1000000201197,"site":2,"video_name":"三八节神曲<妻管严>","data_type":34,"hor_w6_pic":"http://001.img.pu.sohu.com.cn/group1/M12/86/3E/MTAuMTAuODguODA=/dXBsb2FkRmlsZV8zXzE0NTczNjI3Nzc5OTI=/cut@m=force,w=240,h=135.jpg","hor_w8_pic":"http://001.img.pu.sohu.com.cn/group1/M12/86/3E/MTAuMTAuODguODA=/dXBsb2FkRmlsZV8zXzE0NTczNjI3Nzc5OTI=/cut@m=force,w=320,h=180.jpg","play_count":375412,"user_id":4416350,"nickname":"咚哥唱谈","priority":4,"album_name":"咚哥唱谈","album_hor_small_pic":"http://photocdn.sohu.com/tvpgc/20150527/u3439447_149369fb4a4g201b_43_3.jpg"},{"vid":81181533,"aid":1000000402848,"site":2,"video_name":"歪唱少林CEO<佛在何方>","data_type":34,"hor_w6_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_240,h_135/p225/2015/8/19/20/20/190595180_1501f79e121g201cloud_1b.jpg","hor_w8_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_320,h_180/p225/2015/8/19/20/20/190595180_1501f79e121g201cloud_1b.jpg","play_count":28381,"user_id":190595180,"nickname":"剑少兮","priority":5,"album_name":"剑少兮爆笑歪唱作品","album_hor_small_pic":"http://photocdn.sohu.com/tvpgc/20150717/0_14f72127005g201b_43_3.jpg"}]},{"column_id":619,"content_size":6,"load_more":1,"column_type":18,"name":"搞笑动画","action_list":[],"template":{"main_title":"video_name","sub_title":"nickname","bottom_title":"play_count","template_id":14},"data_list":[{"vid":83332270,"aid":1000000561342,"site":2,"video_name":"男子半夜劫色被美女秒杀","data_type":34,"hor_w8_pic":"http://photocdn.sohu.com/tvpgc/20160328/6_1549a6c6147g102SysCutcloud_83332270_7_0b_169_2.jpg","play_count":128,"user_id":283849056,"nickname":"暴走官方","priority":0,"album_name":"暴走每日一暴","album_hor_small_pic":"http://photocdn.sohu.com/tvpgc/20160311/dXBsb2FkRmlsZV80XzE0NTc2NzYzOTcxODE=_43_2.jpg"},{"vid":83328569,"aid":1000000558663,"site":2,"video_name":"女生独自在家都在干什么","data_type":34,"hor_w8_pic":"http://photocdn.sohu.com/tvpgc/20160328/dXBsb2FkRmlsZV8zXzE0NTkxMzY4NjAzOTY=_169_2.jpg","play_count":2234,"user_id":277836221,"nickname":"爆漫画工作室","priority":1,"album_name":"涨姿势","album_hor_small_pic":"http://photocdn.sohu.com/tvpgc/20160118/dXBsb2FkRmlsZV80XzE0NTI3NTE0NTAxMzU=_43_2.jpg"},{"vid":83338271,"aid":1000000551769,"site":2,"video_name":"学渣如何快速成为高级白领","data_type":34,"hor_w8_pic":"http://photocdn.sohu.com/tvmobile/20160329/14592185549381243.jpg","play_count":5374,"user_id":219361108,"nickname":"沃森映画","priority":2,"album_name":"冷三笑第二季","album_hor_small_pic":"http://photocdn.sohu.com/tvpgc/20151208/dXBsb2FkRmlsZV80XzE0NDk1Mzg3MDA1NjM=_43_2.jpg"},{"vid":83332827,"aid":1000000201157,"site":2,"video_name":"谁是宋仲基老公背后的女人","data_type":34,"hor_w8_pic":"http://photocdn.sohu.com/tvmobile/20160328/14591597963261339.jpg","play_count":15809,"user_id":196915464,"nickname":"飞碟说","priority":3,"album_name":"飞碟说","album_hor_small_pic":"http://photocdn.sohu.com/tvpgc/20141011/u3439447_149d1c51473g201b_43_2.jpg"},{"vid":83335509,"aid":1000000200916,"site":2,"video_name":"啪啪啪的时候什么最重要","data_type":34,"hor_w8_pic":"http://photocdn.sohu.com/tvpgc/20160328/6_1549b717172g102SysCutcloud_83335171_7_0b_169_2.jpg","play_count":3842,"user_id":209339243,"nickname":"嗨小冷官方频道","priority":4,"album_name":"疏格文化","album_hor_small_pic":"http://photocdn.sohu.com/tvpgc/20141024/u3439447_14a1569f71ag201b_43_2.jpg"},{"vid":83333495,"aid":1000000389241,"site":2,"video_name":"十二星座见到男神时的反应","data_type":34,"hor_w6_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_240,h_135/p224/2016/3/28/19/21/6_1549ad01573g102SysCutcloud_83333495_7_2b.jpg","hor_w8_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_320,h_180/p224/2016/3/28/19/21/6_1549ad01573g102SysCutcloud_83333495_7_2b.jpg","play_count":15988,"user_id":205055095,"nickname":"秀策坊画动画","priority":5,"album_name":"星座奇葩事","album_hor_small_pic":"http://photocdn.sohu.com/tvpgc/20160328/216251588_14de075125eg201b_43_3.jpg"}]}]
     */

    private DataBean data;
    private String statusText;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getStatusText() {
        return statusText;
    }

    public void setStatusText(String statusText) {
        this.statusText = statusText;
    }

    public static class DataBean implements Parcelable{
        public boolean isDatabeen;
        private int count;
        private int has_next;
        private int cursor;
        /**
         * column_id : 615
         * content_size : 6
         * load_more : 1
         * column_type : 18
         * name : 恶搞吐槽
         * action_list : []
         * template : {"main_title":"video_name","sub_title":"nickname","bottom_title":"play_count","template_id":14}
         * data_list : [{"vid":83324669,"aid":1000000200660,"site":2,"video_name":"辣评女子被指强暴男同事","data_type":34,"hor_w6_pic":"http://001.img.pu.sohu.com.cn/group2/M11/91/E8/MTAuMTAuODguODE=/dXBsb2FkRmlsZV8zXzE0NTkwOTM1MDI4MzI=/cut@m=force,w=240,h=135.jpg","hor_w8_pic":"http://001.img.pu.sohu.com.cn/group2/M11/91/E8/MTAuMTAuODguODE=/dXBsb2FkRmlsZV8zXzE0NTkwOTM1MDI4MzI=/cut@m=force,w=320,h=180.jpg","play_count":354948,"user_id":98272669,"nickname":"文小略","priority":0,"album_name":"小略周一贱（每周一更新）","album_hor_small_pic":"http://photocdn.sohu.com/tvpgc/20151119/u3439447_14931b2077eg201b_43_3.jpg"},{"vid":83311317,"aid":1000000200578,"site":2,"video_name":"带别人老婆吃饭能打折","data_type":34,"hor_w6_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_240,h_135/p222/2016/3/26/10/1/6_1548e8272afg104SysCutcloud_83311317_7_0b.jpg","hor_w8_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_320,h_180/p222/2016/3/26/10/1/6_1548e8272afg104SysCutcloud_83311317_7_0b.jpg","play_count":146714,"user_id":39027205,"nickname":"开心一笑","priority":1,"album_name":"开心一笑（每周二、周六定期与您相约）","album_hor_small_pic":"http://photocdn.sohu.com/tvpgc/20140924/u3439447_14979633d42g201b_43_3.jpg"},{"vid":83320521,"aid":1000000375371,"site":2,"video_name":"最奇葩的复古武侠片","data_type":34,"hor_w6_pic":"http://001.img.pu.sohu.com.cn/group3/M12/9B/F5/MTAuMTAuODguODQ=/dXBsb2FkRmlsZV8zXzE0NTkwNTQyNDY4MzU=/cut@m=force,w=240,h=135.jpg","hor_w8_pic":"http://001.img.pu.sohu.com.cn/group3/M12/9B/F5/MTAuMTAuODguODQ=/dXBsb2FkRmlsZV8zXzE0NTkwNTQyNDY4MzU=/cut@m=force,w=320,h=180.jpg","play_count":66051,"user_id":210752066,"nickname":"笑点研究所","priority":2,"album_name":"小黄人吐槽","album_hor_small_pic":"http://photocdn.sohu.com/tvpgc/20150225/216251639_14c94517a5dg201b_43_3.jpg"},{"vid":83316540,"aid":1000000362766,"site":2,"video_name":"不老女神如何泡到小鲜肉","data_type":34,"hor_w6_pic":"http://001.img.pu.sohu.com.cn/group1/M09/99/F9/MTAuMTAuODguNzk=/dXBsb2FkRmlsZV8zXzE0NTg5OTY4MzU4OTg=/cut@m=force,w=240,h=135.jpg","hor_w8_pic":"http://001.img.pu.sohu.com.cn/group1/M09/99/F9/MTAuMTAuODguNzk=/dXBsb2FkRmlsZV8zXzE0NTg5OTY4MzU4OTg=/cut@m=force,w=320,h=180.jpg","play_count":40707,"user_id":202939688,"nickname":"DS女老诗","priority":3,"album_name":"萝莉说趣事","album_hor_small_pic":"http://photocdn.sohu.com/tvpgc/20150216/53468100_14b995f82ecg201b_43_3.jpg"},{"vid":82711585,"aid":1000000375596,"site":2,"video_name":"为什么剩女都是爱无能","data_type":34,"hor_w6_pic":"http://001.img.pu.sohu.com.cn/group2/M12/40/6C/MTAuMTAuODguODE=/dXBsb2FkRmlsZV8zXzE0NTI0ODQwMjMzMDU=/cut@m=force,w=240,h=135.jpg","hor_w8_pic":"http://photocdn.sohu.com/tvmobilemvms/20160323/145869977369319328.jpg","play_count":445266,"user_id":247245585,"nickname":"小题影视","priority":4,"album_name":"郑在秀","album_hor_small_pic":"http://photocdn.sohu.com/tvpgc/20150921/13436476_14cb86ad7d8g201b_43_3.jpg"},{"vid":83324222,"aid":1000000201090,"site":2,"video_name":"美女睡觉遭剃头恶作剧","data_type":34,"hor_w6_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_240,h_135/p225/2016/3/27/22/4/6_154963f793ag102SysCutcloud_83324222_7_6b.jpg","hor_w8_pic":"http://img.my.tv.sohu.com.cn/o_zoom,w_320,h_180/p225/2016/3/27/22/4/6_154963f793ag102SysCutcloud_83324222_7_6b.jpg","play_count":53288,"user_id":205090153,"nickname":"春se无边1983","priority":5,"album_name":"春色无边恶搞","album_hor_small_pic":"http://photocdn.sohu.com/tvpgc/20150201/u3439447_1494ade73b9g201b_43_3.jpg"}]
         */

        private List<ColumnsBean> columns;

        protected DataBean(Parcel in) {
            isDatabeen = in.readByte() != 0;
            count = in.readInt();
            has_next = in.readInt();
            cursor = in.readInt();
            columns = in.createTypedArrayList(ColumnsBean.CREATOR);
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

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public int getHas_next() {
            return has_next;
        }

        public void setHas_next(int has_next) {
            this.has_next = has_next;
        }

        public int getCursor() {
            return cursor;
        }

        public void setCursor(int cursor) {
            this.cursor = cursor;
        }

        public List<ColumnsBean> getColumns() {
            return columns;
        }

        public void setColumns(List<ColumnsBean> columns) {
            this.columns = columns;
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
            dest.writeByte((byte) (isDatabeen ? 1 : 0));
            dest.writeInt(count);
            dest.writeInt(has_next);
            dest.writeInt(cursor);
            dest.writeTypedList(columns);
        }

        public static class ColumnsBean implements Parcelable{
            public boolean isSecle;
            private int column_id;
            private int content_size;
            private int load_more;
            private int column_type;
            private String name;
            /**
             * main_title : video_name
             * sub_title : nickname
             * bottom_title : play_count
             * template_id : 14
             */

            private TemplateBean template;
            private List<?> action_list;
            /**
             * vid : 83324669
             * aid : 1000000200660
             * site : 2
             * video_name : 辣评女子被指强暴男同事
             * data_type : 34
             * hor_w6_pic : http://001.img.pu.sohu.com.cn/group2/M11/91/E8/MTAuMTAuODguODE=/dXBsb2FkRmlsZV8zXzE0NTkwOTM1MDI4MzI=/cut@m=force,w=240,h=135.jpg
             * hor_w8_pic : http://001.img.pu.sohu.com.cn/group2/M11/91/E8/MTAuMTAuODguODE=/dXBsb2FkRmlsZV8zXzE0NTkwOTM1MDI4MzI=/cut@m=force,w=320,h=180.jpg
             * play_count : 354948
             * user_id : 98272669
             * nickname : 文小略
             * priority : 0
             * album_name : 小略周一贱（每周一更新）
             * album_hor_small_pic : http://photocdn.sohu.com/tvpgc/20151119/u3439447_14931b2077eg201b_43_3.jpg
             */

            private List<DataListBean> data_list;

            protected ColumnsBean(Parcel in) {
                isSecle = in.readByte() != 0;
                column_id = in.readInt();
                content_size = in.readInt();
                load_more = in.readInt();
                column_type = in.readInt();
                name = in.readString();
            }

            public static final Creator<ColumnsBean> CREATOR = new Creator<ColumnsBean>() {
                @Override
                public ColumnsBean createFromParcel(Parcel in) {
                    return new ColumnsBean(in);
                }

                @Override
                public ColumnsBean[] newArray(int size) {
                    return new ColumnsBean[size];
                }
            };

            public int getColumn_id() {
                return column_id;
            }

            public void setColumn_id(int column_id) {
                this.column_id = column_id;
            }

            public int getContent_size() {
                return content_size;
            }

            public void setContent_size(int content_size) {
                this.content_size = content_size;
            }

            public int getLoad_more() {
                return load_more;
            }

            public void setLoad_more(int load_more) {
                this.load_more = load_more;
            }

            public int getColumn_type() {
                return column_type;
            }

            public void setColumn_type(int column_type) {
                this.column_type = column_type;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public TemplateBean getTemplate() {
                return template;
            }

            public void setTemplate(TemplateBean template) {
                this.template = template;
            }

            public List<?> getAction_list() {
                return action_list;
            }

            public void setAction_list(List<?> action_list) {
                this.action_list = action_list;
            }

            public List<DataListBean> getData_list() {
                return data_list;
            }

            public void setData_list(List<DataListBean> data_list) {
                this.data_list = data_list;
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
                dest.writeByte((byte) (isSecle ? 1 : 0));
                dest.writeInt(column_id);
                dest.writeInt(content_size);
                dest.writeInt(load_more);
                dest.writeInt(column_type);
                dest.writeString(name);
            }

            public static class TemplateBean {
                private String main_title;
                private String sub_title;
                private String bottom_title;
                private int template_id;

                public String getMain_title() {
                    return main_title;
                }

                public void setMain_title(String main_title) {
                    this.main_title = main_title;
                }

                public String getSub_title() {
                    return sub_title;
                }

                public void setSub_title(String sub_title) {
                    this.sub_title = sub_title;
                }

                public String getBottom_title() {
                    return bottom_title;
                }

                public void setBottom_title(String bottom_title) {
                    this.bottom_title = bottom_title;
                }

                public int getTemplate_id() {
                    return template_id;
                }

                public void setTemplate_id(int template_id) {
                    this.template_id = template_id;
                }
            }

            public static class DataListBean {
                private int vid;
                private long aid;
                private int site;
                private String video_name;
                private int data_type;
                private String hor_w6_pic;
                private String hor_w8_pic;
                private int play_count;
                private int user_id;
                private String nickname;
                private int priority;
                private String album_name;
                private String album_hor_small_pic;

                public int getVid() {
                    return vid;
                }

                public void setVid(int vid) {
                    this.vid = vid;
                }

                public long getAid() {
                    return aid;
                }

                public void setAid(long aid) {
                    this.aid = aid;
                }

                public int getSite() {
                    return site;
                }

                public void setSite(int site) {
                    this.site = site;
                }

                public String getVideo_name() {
                    return video_name;
                }

                public void setVideo_name(String video_name) {
                    this.video_name = video_name;
                }

                public int getData_type() {
                    return data_type;
                }

                public void setData_type(int data_type) {
                    this.data_type = data_type;
                }

                public String getHor_w6_pic() {
                    return hor_w6_pic;
                }

                public void setHor_w6_pic(String hor_w6_pic) {
                    this.hor_w6_pic = hor_w6_pic;
                }

                public String getHor_w8_pic() {
                    return hor_w8_pic;
                }

                public void setHor_w8_pic(String hor_w8_pic) {
                    this.hor_w8_pic = hor_w8_pic;
                }

                public int getPlay_count() {
                    return play_count;
                }

                public void setPlay_count(int play_count) {
                    this.play_count = play_count;
                }

                public int getUser_id() {
                    return user_id;
                }

                public void setUser_id(int user_id) {
                    this.user_id = user_id;
                }

                public String getNickname() {
                    return nickname;
                }

                public void setNickname(String nickname) {
                    this.nickname = nickname;
                }

                public int getPriority() {
                    return priority;
                }

                public void setPriority(int priority) {
                    this.priority = priority;
                }

                public String getAlbum_name() {
                    return album_name;
                }

                public void setAlbum_name(String album_name) {
                    this.album_name = album_name;
                }

                public String getAlbum_hor_small_pic() {
                    return album_hor_small_pic;
                }

                public void setAlbum_hor_small_pic(String album_hor_small_pic) {
                    this.album_hor_small_pic = album_hor_small_pic;
                }
            }
        }
    }
}
