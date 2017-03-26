package com.wzsuper.jersey.interfaces;

import com.wzsuper.JerseyAPI.Beans.PR;

import net.sf.json.JSONObject;

public interface INewsInfo {
	
	/**
	 * 新闻分类
	 * @return
	 */
	public PR NewsClassify();
	
	/**
	 * 新闻详情
	 * @param id
	 * @return
	 */
	public PR NewsDetails(String id);
	
	/**
	 * 新闻列表
	 * @return
	 */
	public PR NewsList(Integer pageSize, Integer pageNum, String classify);
	
	/**
	 * 滚动广告
	 * @return
	 */
	public PR rollPicture();
	
	/**
	 * 通知公告
	 * @return
	 */
	public PR noticeList();


	public PR insertNews(String id, JSONObject data);

	public PR updateNews(String id, JSONObject data);

	public PR deleteNews(String id, JSONObject data);

	public void testTx();

}
