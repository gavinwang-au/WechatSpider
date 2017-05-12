package com.lim.wechat;


import java.util.List;

import com.lim.wechat.models.Topic;
import com.lim.wechat.util.WechatUtil;

public class WechatSpider extends WechatUtil {

    /**
     * <pre>
     *  new WechatSpider("123").getPageDocs(1); 获取第一页的的全部文章
     * </pre>
     * 
     * @param id
     *            微信公共号的openId
     */
    public WechatSpider(String id) {
        super.setId(id);
        //super.excute();
    }


    public static void main(String[] args) {
        WechatSpider spider = new WechatSpider("bandaobao");//
        String listUrl = spider.getListUrl();
        //System.out.println(listUrl);
        List<String> list = spider.getTopicUrls(listUrl);
        for (String url : list) {
        	//System.out.println(url);
			Topic topic = spider.getTopicByUrl(url);
			System.out.println(topic.getTitle());

            System.out.println(topic.getContent());

            System.out.print("***************");
		}

    }

}
