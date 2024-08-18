package com.abysscat.scp.provider.mapper.impl;

import com.abysscat.scp.provider.mapper.UserMapper;
import com.abysscat.springcloudapi.model.User;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Description
 *
 * @Author: abysscat-yj
 * @Create: 2024/8/19 3:22
 */
@Component
public class UserMapperImpl implements UserMapper {

	public List<User> list(String name){
		return List.of(new User(1, name + "01", 21),
				new User(2, name + "02", 22));
	}

	public User findById(long id) {
		return new User(id, "Cat" + id, 20);
	}
}
