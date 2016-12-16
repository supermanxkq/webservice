package com.java1234.webservice.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jws.WebService;

import org.springframework.stereotype.Component;

import com.java1234.entity.Role;
import com.java1234.entity.User;
import com.java1234.webservice.HelloWorld;

@Component("helloWorld")
@WebService
public class HelloWorldImpl implements HelloWorld{

	public String say(String str) {
		return "Hello:"+str;
	}

	public List<Role> getRoleByUser(User user) {
		List<Role> roleList=new ArrayList<Role>();
		// ģ��  ֱ��д��
		if(user!=null){
			if(user.getUserName().equals("java1234") && user.getPassword().equals("123456")){
				roleList.add(new Role(1,"�����ܼ�"));
				roleList.add(new Role(2,"�ܹ�ʦ"));
			}else if(user.getUserName().equals("jack") && user.getPassword().equals("123456")){
				roleList.add(new Role(3,"����Ա"));
			}
			return roleList;
		}else{
			return null;
		}
	}

	public Map<String, List<Role>> getRoles() {
		Map<String,List<Role>> map=new HashMap<String,List<Role>>();
		List<Role> roleList1=new ArrayList<Role>();
		roleList1.add(new Role(1,"�����ܼ�"));
		roleList1.add(new Role(2,"�ܹ�ʦ"));
		map.put("java1234", roleList1);
		
		List<Role> roleList2=new ArrayList<Role>();
		roleList2.add(new Role(3,"����Ա"));
		map.put("jack", roleList2);
		
		return map;
	}

}
