package com.crawlcore.thread;

import com.crawl.model.Cnblogs;
import com.crawl.util.HttpHelper;
import com.crawlcore.service.ICnblogsService;
import org.joda.time.DateTime;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * User: Zephery
 * Time: 2018/1/11 23:18
 * Description:
 */
public class CommonCrawl implements Runnable {
    //logger
    private static final Logger logger = LoggerFactory.getLogger(CommonCrawl.class);
    private String url;
    @Resource
    private ICnblogsService cnblogsService;

    public CommonCrawl(String url) {
        this.url = url;
    }

    @Override
    public void run() {
        String content = HttpHelper.getInstance().get(url);
        Elements elements = Jsoup.parse(content).getElementsByClass("post_item");
        for (Element element : elements) {
            String title = element.getElementsByClass("titlelnk").text();
            String author = element.getElementsByClass("lightblue").text();
            String article_comment = element.getElementsByClass("article_comment").text();
            Integer comment = Integer.parseInt(article_comment.replace("评论(", "").replace(")", ""));
            String article_view = element.getElementsByClass("article_view").text();
            String post_item_summary = element.getElementsByClass("post_item_summary").text();
            Cnblogs cnblogs = new Cnblogs();
            cnblogs.setTitle(title);
            cnblogs.setAuthor(author);
            cnblogs.setComments(comment);
            cnblogs.setCreateTime(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
            cnblogsService.save(cnblogs);
        }
    }
}