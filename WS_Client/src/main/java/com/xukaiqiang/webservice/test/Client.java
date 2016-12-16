package com.xukaiqiang.webservice.test;

import com.xukaiqiang.webservice.HelloWorld;
import com.xukaiqiang.webservice.HelloWorldService;

public class Client {
	public static void main(String[] args) {
		HelloWorldService  service=new HelloWorldService();
		HelloWorld helloWorld=service.getHelloWorldPort();
		System.out.println(helloWorld.say("_xukaiqiang"));
	}
}
