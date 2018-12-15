package com.it.RestServer;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController //组合注解
public class PersonController {
	@GetMapping(value="/person/{name}",produces=MediaType.APPLICATION_JSON_VALUE)
	public Person demo(@PathVariable String name) {
		Person p=new Person();
		p.setName(name);
		p.setAge(18);
		return p;
	}
}