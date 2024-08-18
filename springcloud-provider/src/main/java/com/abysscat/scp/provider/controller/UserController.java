package com.abysscat.scp.provider.controller;

import com.abysscat.scp.provider.service.UserService;
import com.abysscat.springcloudapi.model.User;
import com.abysscat.springcloudapi.service.UserApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * user controller.
 *
 * @Author: abysscat-yj
 * @Create: 2024/8/11 0:00
 */
@RestController
public class UserController implements UserApiService {

	@Value("${server.port}")
	private int port;

	@Autowired
	UserService userService;

	public List<User> list(String name){
		return userService.list(name + "-" + port);
	}

	public User findById(long id){
		User user = userService.findById(id);
		user.setName(user.getName() + "-" + port);
		return user;
	}

}
