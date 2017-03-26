package com.wzsuper.jersey;

import com.wzsuper.JerseyAPI.Server.JerseyResource;

/**
 * Jersey资源配置，需配置于web.xml</br>
 * 
 * packages:指定包名注册发布Jersey服务 </br>
 * register:注册Jersey组件，也可发布服务 </br>
 * @author wangzhen
 *
 */
public class JerseyDemoResource extends JerseyResource {

	public JerseyDemoResource() {
		packages("com.wzsuper.jersey.services");
	}

}
