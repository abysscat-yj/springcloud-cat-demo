package com.abysscat.scp.provider.service;

import com.abysscat.springcloudapi.model.User;

import java.util.List;

/**
 * Description
 *
 * @Author: abysscat-yj
 * @Create: 2024/8/19 3:22
 */
public interface UserService {

	List<User> list(String name);

	User findById(long id);

}
