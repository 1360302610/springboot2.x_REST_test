package com.it.RestFeign;

import feign.Param;
import feign.RequestLine;

/**
 * Feign客户端接口
 */
public interface PersonClient {
	@RequestLine("GET /person/{name}")
	Person getPerson(@Param("name") String name);
}