package com.abysscat.springcloudapi.service;

import com.abysscat.springcloudapi.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * user service api.
 *
 * @Author: abysscat-yj
 * @Create: 2024/8/11 0:13
 */
public interface UserApiService {

	@GetMapping("/api/user/list")
	List<User> list(@RequestParam("name") String name);

	@GetMapping("/api/user/find")
	User findById(@RequestParam("id") long id);

}
