package com.crawlcore.service.impl;

import com.crawl.model.Cnblogs;
import com.crawlcore.dao.ICnblogsDao;
import com.crawlcore.service.ICnblogsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Zephery
 * @since 2018/2/25 16:01
 */
@Service
public class CnblogsServiceImpl implements ICnblogsService {
    //logger
    private static final Logger logger = LoggerFactory.getLogger(CnblogsServiceImpl.class);
    @Resource
    private ICnblogsDao cnblogsDao;

    @Override
    public void save(Cnblogs cnblogs) {
        cnblogsDao.save(cnblogs);
    }
}