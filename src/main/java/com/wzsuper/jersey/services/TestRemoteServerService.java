package com.wzsuper.jersey.services;

import java.net.URISyntaxException;

import javax.annotation.Resource;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.wzsuper.JerseyAPI.Server.annotation.Register;

import com.wzsuper.JerseyAPI.Server.RemoteServerProxy;

import net.sf.json.JSONObject;

@Path("call")
public class TestRemoteServerService {

	@Resource
	RemoteServerProxy jerseyDemo;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Register(name = "call")
	public JSONObject call(@QueryParam("name") String name,
			       @QueryParam("version") String version){
		JSONObject result = null;
		try {
			JSONObject data = new JSONObject();
			data.put("id", "d3984d1e601369aee9c19872a8ecdaa3");
			data.put("name", 1);
			data.put("bb", 1);
			result = jerseyDemo.callservice(name, version, data);
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
}
