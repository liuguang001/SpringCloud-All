package com.example.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	@Autowired
	private DiscoveryClient discoveryClient;
	
	@RequestMapping("/hello")
	@ResponseBody
	public Object hello(){
		List<String> arrayList = new ArrayList<>();
		arrayList.add("张三");
		arrayList.add("李四");
		arrayList.add("王五");
		Map<String,Object> data=new HashMap<>();
		data.put("state", 0);
		data.put("msg", "success");
		data.put("data", arrayList);
		return data;
	}
	
}
