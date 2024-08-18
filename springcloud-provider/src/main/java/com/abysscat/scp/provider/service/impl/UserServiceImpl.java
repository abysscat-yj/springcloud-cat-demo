package com.abysscat.scp.provider.service.impl;

import com.abysscat.scp.provider.mapper.UserMapper;
import com.abysscat.scp.provider.service.UserService;
import com.abysscat.springcloudapi.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Description
 *
 * @Author: abysscat-yj
 * @Create: 2024/8/19 3:23
 */
@Component
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;

	public List<User> list(String name){
		return userMapper.list(name);
	}

	public User findById(long id) {
		return userMapper.findById(id);
	}

}
