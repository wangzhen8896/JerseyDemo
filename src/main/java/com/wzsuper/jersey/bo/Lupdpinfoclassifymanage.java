package com.wzsuper.jersey.bo;

import java.util.Date;

public class Lupdpinfoclassifymanage {
    private String id;

    private Integer cloudappid;

    private String creator;

    private String createtime;

    private String updater;

    private String updatetime;

    private String infoclassify;

    private String parentvalue;

    private String rank;

    private String isdelete;

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

    public String getInfoclassify() {
        return infoclassify;
    }

    public void setInfoclassify(String infoclassify) {
        this.infoclassify = infoclassify == null ? null : infoclassify.trim();
    }

    public String getParentvalue() {
        return parentvalue;
    }

    public void setParentvalue(String parentvalue) {
        this.parentvalue = parentvalue == null ? null : parentvalue.trim();
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank == null ? null : rank.trim();
    }

    public String getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(String isdelete) {
        this.isdelete = isdelete == null ? null : isdelete.trim();
    }
}