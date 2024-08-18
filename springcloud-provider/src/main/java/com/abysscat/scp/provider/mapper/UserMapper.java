package com.abysscat.scp.provider.mapper;

import com.abysscat.springcloudapi.model.User;

import java.util.List;

/**
 * Description
 *
 * @Author: abysscat-yj
 * @Create: 2024/8/19 3:17
 */
public interface UserMapper {

	List<User> list(String name);

	User findById(long id);

}
