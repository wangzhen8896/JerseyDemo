package com.wzsuper.jersey.logic;


import java.util.List;

import javax.annotation.Resource;

import com.wzsuper.JerseyAPI.Utils.UUID;
import com.wzsuper.JerseyAPI.aop.PageInterceptor;
import com.wzsuper.JerseyAPI.db.Page;
import com.wzsuper.jersey.bo.*;
import com.wzsuper.jersey.dao.LupdpinfoclassifymanageMapper;
import com.wzsuper.jersey.dao.LupdpnewbulletionmanageMapper;
import com.wzsuper.jersey.dao.LupdprollpictureMapper;
import com.wzsuper.jersey.dao.NewscontentMapper;
import com.wzsuper.jersey.interfaces.INewsInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.wzsuper.JerseyAPI.Beans.PR;
import com.wzsuper.JerseyAPI.Utils.NullOrEmptyUtil;

import net.sf.json.JSONObject;
import org.springframework.transaction.annotation.Transactional;

@Component("newsInfo")
public class NewsInfoLogic implements INewsInfo {
	final Logger logger = LoggerFactory.getLogger(NewsInfoLogic.class);
	
	@Resource
    NewscontentMapper newscontentMapper;

	@Resource
	LupdpinfoclassifymanageMapper lupdpinfoclassifymanageMapper;

	@Resource
	LupdprollpictureMapper lupdprollpictureMapper;

	@Resource
	LupdpnewbulletionmanageMapper lupdpnewbulletionmanageMapper;


	public PR NewsDetails(String id) {
        if ( NullOrEmptyUtil.isNullOrEmpty(id))
        {
            return new PR(0, "参数为空", null);
        }
        try
        {

			NewscontentWithBLOBs news = newscontentMapper.selectByPrimaryKey(id);

            if ( news != null)
            {
                return new PR(1, "查询成功", news);
            }
            else
            {
                return new PR(1, "查询成功，没有查询到数据", null);
            }
        }
        catch (Exception e)
        {
        	logger.error("查询异常", e);
        }
        return new PR(0, "查询失败", null);
	}

	public PR NewsList(Integer pageSize, Integer pageNum, String classify) {

        if ( NullOrEmptyUtil.isNullOrEmpty_all(pageSize, pageNum))
        {
            return new PR(0, "请输入查询参数", null);
        }
        try
        {
            PageInterceptor.startPage(pageNum, pageSize);
            List<Newscontent> result = newscontentMapper.selectNewsList(classify);
            Page page = PageInterceptor.endPage();
            if ( result != null )
            {
                return new PR(1, "查询成功", page);
            }
            else
            {
                return new PR(1, "查询成功，没有查询到数据", null);
            }
        }
        catch (Exception e)
        {
        	logger.error("查询异常", e);
        }
        return new PR(0, "查询失败", null);
	}

	@Override
	public PR NewsClassify() {
        try
        {
        	List<Lupdpinfoclassifymanage> result = lupdpinfoclassifymanageMapper.selectNewsClassifyList();
            if ( result != null )
            {
                return new PR(1, "查询成功", result);
            }
            else
            {
                return new PR(1, "查询成功，没有查询到数据", null);
            }
        }
        catch (Exception e)
        {
        	logger.error("查询异常：", e);
        }
        return new PR(0, "查询失败", null);
	}

	@Override
	public PR rollPicture() {
		try
		{


			List<Lupdprollpicture> result = lupdprollpictureMapper.selectRollPictureList();
			if ( result != null )
			{
				return new PR(1, "查询成功", result);
			}
			else
			{
				return new PR(1, "查询成功，没有查询到数据", null);
			}
		}
		catch (Exception e)
		{
			logger.error("查询异常：", e);
		}
		return new PR(0, "查询失败", null);
	}
	
	@Override
	public PR noticeList() {
        try
        {
        	List<Lupdpnewbulletionmanage> result = lupdpnewbulletionmanageMapper.selectNoticeList();

            if ( result != null )
            {

                return new PR(1, "查询成功", result);
            }
            else
            {
                return new PR(1, "查询成功，没有查询到数据", null);
            }
        }
        catch (Exception e)
        {
        	logger.error("查询异常：", e);
        }
        return new PR(0, "查询失败", null);
	}

	@Override
	public PR insertNews(String id, JSONObject data) {
		return null;
	}

	@Override
	public PR updateNews(String id, JSONObject data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PR deleteNews(String id, JSONObject data) {
		// TODO Auto-generated method stub
		return null;
	}


	@Transactional
	public void testTx(){
        String id = UUID.UUID_32();
        Newscontent news = new Newscontent();
        news.setId(id);
        news.setMarkdown("123123123123");
        newscontentMapper.insert(news);
        news = new Newscontent();
        news.setId(id);
        news.setCdnurl("http://123123123/aa");
        newscontentMapper.updateByPrimaryKey(news);
        throw new RuntimeException("1231232");
    }
}
