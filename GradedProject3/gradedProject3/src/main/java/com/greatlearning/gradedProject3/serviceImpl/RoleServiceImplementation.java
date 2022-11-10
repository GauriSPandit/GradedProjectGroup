package com.greatlearning.gradedProject3.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.gradedProject3.entity.Role;
import com.greatlearning.gradedProject3.repository.RoleRepository;
import com.greatlearning.gradedProject3.service.RoleService;

@Service
public class RoleServiceImplementation implements RoleService {
	
	@Autowired
	RoleRepository rolesRepository;

	@Override
	public List<Role> findAllRoles() {
		return rolesRepository.findAll();
	}

	@Override
	public Role saveRole(Role roles) {
		return rolesRepository.saveAndFlush(roles);
	}
}
