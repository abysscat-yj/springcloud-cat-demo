package com.abysscat.scp.provider;

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
public class HelloController {

	@GetMapping("/api/hello")
	public String hello() {
		return "hello springcloud";
	}

	@GetMapping("/api/a")
	public String a(@RequestParam("name") String name) {
		return "hello a," + name;
	}

	@GetMapping("/api/b")
	public String b(@RequestParam("name") String name) {
		return "hello b," + name;
	}

}
