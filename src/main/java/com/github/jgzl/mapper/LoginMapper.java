package com.github.jgzl.mapper;

import com.github.jgzl.po.User;

public interface LoginMapper {
	User getpwdbyname(String name);
}
