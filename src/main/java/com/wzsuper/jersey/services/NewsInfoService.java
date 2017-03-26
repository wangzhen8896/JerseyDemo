package com.wzsuper.jersey.services;

import javax.annotation.Resource;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.HEAD;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;


import javax.ws.rs.core.MediaType;

import com.wzsuper.jersey.interfaces.INewsInfo;
import org.springframework.stereotype.Service;

import com.wzsuper.JerseyAPI.Beans.PR;
import com.wzsuper.JerseyAPI.Server.annotation.Register;

import net.sf.json.JSONObject;

@Service
@Path("/news")
public class NewsInfoService{
	
	@Resource
	private INewsInfo newsInfo;
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Register(name = "newsDetails", version = "1.0.0")
	public PR NewsDetails(@PathParam("id") String id) {
		 return newsInfo.NewsDetails(id);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Register(name = "newsList", version = "1.0.0")
	public PR NewsList(@QueryParam("pageSize") Integer pageSize, 
					   @QueryParam("pageNum") Integer pageNum,
					   @QueryParam("classifyid") String classify) {
		return newsInfo.NewsList(pageSize, pageNum , classify);
	}
	
	@GET
	@Path("classify")
	@Produces(MediaType.APPLICATION_JSON)
	public PR NewsClassify() {
		return newsInfo.NewsClassify();
	}
	
	@GET
	@Path("rollPicture")
	@Register(name = "rollPicture")
	@Produces(MediaType.APPLICATION_JSON)
	public PR rollPicture(){
		return newsInfo.rollPicture();
	}
	
	@GET
	@Path("notice")
	@Register(name = "noticeList")
	@Produces(MediaType.APPLICATION_JSON)
	public PR noticeList(){
		return newsInfo.noticeList();
	}
	
	@POST
	@Path("{id}")
	@Register(name = "insertNews")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public PR insertNews(@PathParam("id") String id, JSONObject data){
		//To Do List
		return new PR(0, "新增成功", data.toString());
	}


	@PUT
	@Path("{id}")
	@Register(name = "updateNews")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public PR updateNews(@PathParam("id") String id,@QueryParam("name") String a, JSONObject data){
		//To Do List
		return new PR(0, "修改成功"+a, data.toString());
	}
	
	
	@DELETE
	@Path("{id}")
	@Register(name = "deleteNews")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public PR deleteNews(@PathParam("id") String id){
		//To Do List
		return new PR(1, "删除成功", id);
	}
	
	
	@HEAD
	@Path("{id}")
	@Register(name = "test")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.TEXT_HTML)
	public PR test(@PathParam("id") String id){
		//To Do List
		return new PR(1, "删除成功", id);
	}

	@GET
	@Path("/testTx")
	@Register(name = "testTx")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public PR testTx(){
		newsInfo.testTx();
		return new PR(0,"",null);
	}

	

}
