package com.xukaiqiang.webservice.impl;

import javax.jws.WebService;

import com.xukaiqiang.webservice.HelloWorld;
@WebService
public class HelloWorldImpl implements HelloWorld {
	public String say(String words) {
		return "Hello"+words;
	}

}
