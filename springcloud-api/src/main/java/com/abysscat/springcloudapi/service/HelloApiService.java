package com.abysscat.springcloudapi.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * hello service api.
 *
 * @Author: abysscat-yj
 * @Create: 2024/8/11 0:13
 */
public interface HelloApiService {

	@GetMapping("/api/hello/hi")
	String hi();

	@GetMapping("/api/hello/a")
	String a(@RequestParam("name") String name);

	@GetMapping("/api/hello/b")
	String b(@RequestParam("name") String name);

	@RequestMapping("/api/hello/c")
	String c(@RequestParam("name") String name);

}
