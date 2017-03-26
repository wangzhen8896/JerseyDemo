package com.wzsuper.jersey.bo;

import java.util.Date;

public class Lupdprollpicture {
    private String id;

    private Integer cloudappid;

    private String creator;

    private String createtime;

    private String updater;

    private String updatetime;

    private String url;

    private String forwardurl;

    private String newsid;

    private String rank;

    private String forwardtype;

    private String title;

    private String newsid1;

    private String cdnurl;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getCloudappid() {
        return cloudappid;
    }

    public void setCloudappid(Integer cloudappid) {
        this.cloudappid = cloudappid;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater == null ? null : updater.trim();
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getForwardurl() {
        return forwardurl;
    }

    public void setForwardurl(String forwardurl) {
        this.forwardurl = forwardurl == null ? null : forwardurl.trim();
    }

    public String getNewsid() {
        return newsid;
    }

    public void setNewsid(String newsid) {
        this.newsid = newsid == null ? null : newsid.trim();
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank == null ? null : rank.trim();
    }

    public String getForwardtype() {
        return forwardtype;
    }

    public void setForwardtype(String forwardtype) {
        this.forwardtype = forwardtype == null ? null : forwardtype.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getNewsid1() {
        return newsid1;
    }

    public void setNewsid1(String newsid1) {
        this.newsid1 = newsid1 == null ? null : newsid1.trim();
    }

    public String getCdnurl() {
        return cdnurl;
    }

    public void setCdnurl(String cdnurl) {
        this.cdnurl = cdnurl == null ? null : cdnurl.trim();
    }
}