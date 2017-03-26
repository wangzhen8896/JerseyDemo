package com.wzsuper.jersey.dao;

import com.wzsuper.jersey.bo.Lupdprollpicture;

import java.util.List;

public interface LupdprollpictureMapper {
    int deleteByPrimaryKey(String id);

    int insert(Lupdprollpicture record);

    int insertSelective(Lupdprollpicture record);

    Lupdprollpicture selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Lupdprollpicture record);

    int updateByPrimaryKey(Lupdprollpicture record);

    List<Lupdprollpicture> selectRollPictureList();
}