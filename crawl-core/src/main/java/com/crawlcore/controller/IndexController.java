package com.crawlcore.controller;

import com.crawlcore.service.ICnblogsService;
import com.crawlcore.thread.CommonThread;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * User: Zephery
 * Time: 2018/1/10 23:21
 * Description:
 */
@RestController
public class IndexController {
    //logger
    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);
    @Resource
    private ICnblogsService cnblogsService;

    @RequestMapping("/hello")
    public String hello() {
        return "hello world";
    }

    @RequestMapping("/cnblogs")
    public void cnblogs() {
        CommonThread.run();
    }
}