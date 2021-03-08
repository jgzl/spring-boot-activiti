package com.github.jgzl.mapper;

import java.util.List;

import com.github.jgzl.po.Permission;


public interface PermissionMapper {
	List<Permission> getPermissions();
	Permission getPermissionByname(String permissionname);
	void addpermission(String permissionname);
	void deletepermission(int pid);
	void deleteRole_permission(int permissionid);
}
