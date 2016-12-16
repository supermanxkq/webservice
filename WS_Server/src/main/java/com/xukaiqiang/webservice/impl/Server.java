package com.xukaiqiang.webservice.impl;

import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

import com.xukaiqiang.webservice.HelloWorld;


/**
 * @ClassName: Server
 * @Description: CXF发布webservice接口
 * @author xukaiqiang
 * @date 2016年12月16日 下午6:21:35
 * @modifier
 * @modify-date 2016年12月16日 下午6:21:35
 * @version 1.0
*/
public class Server {
	public static void main(String[] args) {
		System.out.println("web service  start.");
		HelloWorld helloWorldImpl=new HelloWorldImpl();
		String address="http://192.168.2.169/helloWorld";
		JaxWsServerFactoryBean  factoryBean =new JaxWsServerFactoryBean();
		//设置暴露地址
		factoryBean.setAddress(address);
		//接口类
		factoryBean.setServiceClass(HelloWorld.class);
		factoryBean.setServiceBean(helloWorldImpl);
		//创建webservice接口
		factoryBean.create();
		System.out.println("web service  started");
	}
}
