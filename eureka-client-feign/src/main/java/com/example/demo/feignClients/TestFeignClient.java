package com.example.demo.feignClients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value="EUREKA-CLIENT")
public interface TestFeignClient {
	
	@RequestMapping(value="/hello")
	public String hello();
}
