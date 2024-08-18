package com.abysscat.scp.provider.controller;

import com.abysscat.springcloudapi.service.HelloApiService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * hello controller.
 *
 * @Author: abysscat-yj
 * @Create: 2024/8/10 23:59
 */
@RestController
public class HelloController implements HelloApiService {

	@Value("${server.port}")
	private int port;

	public String hi() {
		return "hello springcloud from " + port;
	}

	public String a(String name) {
		return "hello a," + name + " from " + port;
	}

	public String b(String name) {
		return "hello b," + name + " from " + port;
	}

	public String c(String name) {
		return "hello c," + name + " from " + port;
	}

}
