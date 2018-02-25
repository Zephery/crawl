package com.crawlcore.dao;

import com.crawl.model.Cnblogs;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Zephery
 * @since 2018/2/25 16:01
 */
public interface ICnblogsDao extends JpaRepository<Cnblogs, Integer> {
}