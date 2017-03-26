package com.wzsuper.jersey.dao;

import com.wzsuper.jersey.bo.Newscontent;
import com.wzsuper.jersey.bo.NewscontentWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NewscontentMapper {
    int deleteByPrimaryKey(String id);

    int insert(Newscontent record);

    int insertSelective(NewscontentWithBLOBs record);

    NewscontentWithBLOBs selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(NewscontentWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(NewscontentWithBLOBs record);

    int updateByPrimaryKey(Newscontent record);

    List<Newscontent> selectNewsList(@Param("classify") String classify);

}