package com.abysscat.springcloudcommon;

/**
 * base entity.
 *
 * @Author: abysscat-yj
 * @Create: 2024/8/19 3:12
 */
public abstract class BaseEntity {

	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}