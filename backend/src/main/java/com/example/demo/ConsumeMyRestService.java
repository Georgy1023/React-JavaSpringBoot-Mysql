package com.example.demo;

import org.springframework.web.client.RestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConsumeMyRestService {
	private static final Logger L= LoggerFactory.getLogger(ConsumeMyRestService.class);
	
	public static void main(String args[]) {
		RestTemplate rt = new RestTemplate();
		Professor po = rt.getForObject("http://localhost:8181/getdataobjectofprofessor/1", Professor.class);
		L.info("Finally Consumed through rest service" + po.getId() + " " + po.getName());
	}
}
