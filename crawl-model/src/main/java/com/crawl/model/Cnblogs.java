package com.crawl.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

/**
 * @author Zephery
 * @since 2018/2/25 15:10
 */
@Entity
public class Cnblogs {
    private Integer id;
    private String title;
    private String summary;
    private Integer comments;
    private Integer read;
    private String publishTime;
    private String createTime;
    private String url;
    private String author;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "title", nullable = true, length = 200)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "summary", nullable = true, length = 1000)
    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Basic
    @Column(name = "comments", nullable = true)
    public Integer getComments() {
        return comments;
    }

    public void setComments(Integer comments) {
        this.comments = comments;
    }

    @Basic
    @Column(name = "read", nullable = true)
    public Integer getRead() {
        return read;
    }

    public void setRead(Integer read) {
        this.read = read;
    }

    @Basic
    @Column(name = "publish_time", nullable = true, length = 200)
    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

    @Basic
    @Column(name = "create_time", nullable = true, length = 200)
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "url", nullable = true, length = 1000)
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Basic
    @Column(name = "author", nullable = true, length = 200)
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cnblogs cnblogs = (Cnblogs) o;
        return Objects.equals(id, cnblogs.id) &&
                Objects.equals(title, cnblogs.title) &&
                Objects.equals(summary, cnblogs.summary) &&
                Objects.equals(comments, cnblogs.comments) &&
                Objects.equals(read, cnblogs.read) &&
                Objects.equals(publishTime, cnblogs.publishTime) &&
                Objects.equals(createTime, cnblogs.createTime) &&
                Objects.equals(url, cnblogs.url) &&
                Objects.equals(author, cnblogs.author);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, title, summary, comments, read, publishTime, createTime, url, author);
    }
}