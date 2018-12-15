package com.it.RestFeign;

import feign.Feign;
import feign.gson.GsonDecoder;

public class FeignMain {
	public static void main(String[] args) {
		PersonClient target = Feign.builder().decoder(new GsonDecoder()).target(PersonClient.class,"http://localhost:8080/");
		System.out.println(target.getPerson("小小"));
	}
}