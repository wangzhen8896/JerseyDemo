package com.wzsuper.jersey.bo;

import java.util.Date;

public class Lupdpnewbulletionmanage {
    private String id;

    private Integer cloudappid;

    private String creator;

    private String createtime;

    private String updater;

    private String updatetime;

    private String newscontentid;

    private String rank;

    private String newstitle;

    private Date newscreatetime;

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

    public String getNewscontentid() {
        return newscontentid;
    }

    public void setNewscontentid(String newscontentid) {
        this.newscontentid = newscontentid == null ? null : newscontentid.trim();
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank == null ? null : rank.trim();
    }

    public String getNewstitle() {
        return newstitle;
    }

    public void setNewstitle(String newstitle) {
        this.newstitle = newstitle == null ? null : newstitle.trim();
    }

    public Date getNewscreatetime() {
        return newscreatetime;
    }

    public void setNewscreatetime(Date newscreatetime) {
        this.newscreatetime = newscreatetime;
    }
}