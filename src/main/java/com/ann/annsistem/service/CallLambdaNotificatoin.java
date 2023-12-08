package com.ann.annsistem.service;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ann.annsistem.model.Product;

@Service
public class CallLambdaNotificatoin {
	
	public static void sendNotification(Product product){
		String url = "https://skt4k4vnhb.execute-api.us-east-1.amazonaws.com/dev/";
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.postForEntity(url, product, null);
	}
}
