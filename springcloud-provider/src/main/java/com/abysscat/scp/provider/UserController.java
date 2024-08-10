package com.abysscat.scp.provider;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * user controller.
 *
 * @Author: abysscat-yj
 * @Create: 2024/8/11 0:00
 */
@RestController
public class UserController {

	@GetMapping("/api/user/list")
	public String list(@RequestParam("name") String name){
		return "list user: " + name;
	}

	@GetMapping("/api/user/find")
	public String find(@RequestParam("name") String name){
		return "find user: " + name;
	}

}
