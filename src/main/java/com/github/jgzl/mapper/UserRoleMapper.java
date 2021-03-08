package com.github.jgzl.mapper;

import java.util.List;

import com.github.jgzl.po.UserRole;


public interface UserRoleMapper {
    int deleteByPrimaryKey(Integer urid);

    int insert(UserRole record);

    UserRole selectByPrimaryKey(Integer urid);

    int updateByPrimaryKeySelective(UserRole record);

    List<UserRole> listUserRoleByUid(int uid);
}