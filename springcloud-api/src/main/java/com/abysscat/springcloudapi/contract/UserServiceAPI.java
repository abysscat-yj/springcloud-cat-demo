package com.abysscat.springcloudapi.contract;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * user service api.
 *
 * @Author: abysscat-yj
 * @Create: 2024/8/11 0:13
 */
public interface UserServiceAPI {

	@GetMapping("/api/user/list")
	String list(@RequestParam("name") String name);

	@GetMapping("/api/user/find")
	String find(@RequestParam("name") String name);

}
