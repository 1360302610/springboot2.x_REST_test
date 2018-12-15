package com.it.restemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
@Service
public class BeanService {
	@Autowired
	private RestTemplateBuilder builder;
	public Person getPerson() {
		return this.builder.rootUri("http://localhost:8080").build().getForObject("/person/小度2",Person.class);
	}
}
