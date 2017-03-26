package com.wzsuper.jersey.dao;

import com.wzsuper.jersey.bo.Lupdpinfoclassifymanage;

import java.util.List;

public interface LupdpinfoclassifymanageMapper {
    int deleteByPrimaryKey(String id);

    int insert(Lupdpinfoclassifymanage record);

    int insertSelective(Lupdpinfoclassifymanage record);

    Lupdpinfoclassifymanage selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Lupdpinfoclassifymanage record);

    int updateByPrimaryKey(Lupdpinfoclassifymanage record);

    List<Lupdpinfoclassifymanage> selectNewsClassifyList();
}