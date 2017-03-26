package com.wzsuper.jersey.services;

import javax.annotation.Resource;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.springframework.amqp.core.AmqpTemplate;

import com.wzsuper.JerseyAPI.Server.annotation.Register;

@Path("/MQ")
public class MQService {


	@Resource
	private AmqpTemplate amqpTemplate;

	@GET
	@Path("{message}")
	@Register(name = "sendMessage")
	public void sendMessage(@PathParam("message") String message){
		throw new RuntimeException(message);
		//amqpTemplate.convertAndSend("queueTestKey",message);
	  
	}
	
}
