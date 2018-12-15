package com.it.restemplate;
import org.springframework.web.client.RestTemplate;
public class RestTemplateMain {
	public static void main(String [] srg) {
		RestTemplate rt=new RestTemplate();
		Person p=rt.getForObject("http://localhost:8080/person/小度",Person.class);
		System.out.println(p);
	}
}
