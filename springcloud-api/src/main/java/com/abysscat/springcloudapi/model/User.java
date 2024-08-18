package com.abysscat.springcloudapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * user model.
 *
 * @Author: abysscat-yj
 * @Create: 2024/8/19 2:39
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

	private long id;

	private String name;

	private int age;

}
