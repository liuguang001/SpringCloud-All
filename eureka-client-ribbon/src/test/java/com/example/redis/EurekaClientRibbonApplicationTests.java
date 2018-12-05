package com.example.redis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.example.demo.EurekaClientRibbonApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=EurekaClientRibbonApplication.class)
public class EurekaClientRibbonApplicationTests {

	private String serviceId="EUREKA-CLIENT";
	@Autowired
	private RestTemplate restTemplate;
	
	@Test
	public void contextLoads() {
		ResponseEntity<String> forEntity = restTemplate.getForEntity("http://"+serviceId+"/hello",String.class);
		String body = forEntity.getBody();
		System.out.println("服务结果:"+body);
	}

}
