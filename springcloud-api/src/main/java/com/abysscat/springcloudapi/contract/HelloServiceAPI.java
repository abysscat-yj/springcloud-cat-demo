package com.abysscat.springcloudapi.contract;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * hello service api.
 *
 * @Author: abysscat-yj
 * @Create: 2024/8/11 0:13
 */
public interface HelloServiceAPI {

	@GetMapping("/api/hello")
	String hello();

	@GetMapping("/api/a")
	String a(@RequestParam("name") String name);

	@GetMapping("/api/b")
	String b(@RequestParam("name") String name);

}
