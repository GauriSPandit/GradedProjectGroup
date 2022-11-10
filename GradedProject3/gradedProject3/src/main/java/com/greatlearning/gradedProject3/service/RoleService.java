package com.greatlearning.gradedProject3.service;

import java.util.List;

import com.greatlearning.gradedProject3.entity.Role;

public interface RoleService {
	List<Role> findAllRoles();

	Role saveRole(Role role);
}
