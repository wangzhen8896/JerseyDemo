package com.wzsuper.jersey.dao;

import com.wzsuper.jersey.bo.Lupdpnewbulletionmanage;

import java.util.List;

public interface LupdpnewbulletionmanageMapper {
    int deleteByPrimaryKey(String id);

    int insert(Lupdpnewbulletionmanage record);

    int insertSelective(Lupdpnewbulletionmanage record);

    Lupdpnewbulletionmanage selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Lupdpnewbulletionmanage record);

    int updateByPrimaryKey(Lupdpnewbulletionmanage record);


    List<Lupdpnewbulletionmanage> selectNoticeList();
}