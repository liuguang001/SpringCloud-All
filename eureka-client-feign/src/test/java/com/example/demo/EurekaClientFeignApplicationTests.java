package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.feignClients.TestFeignClient;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=EurekaClientFeignApplication.class)
public class EurekaClientFeignApplicationTests {

	@Autowired
	TestFeignClient testFeignClient;
	@Test
	public void contextLoads() {
		String hello = testFeignClient.hello();
		System.out.println("请求结果:"+hello);
	}

}
