package com.greatlearning.gradedProject3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.gradedProject3.entity.Role;
import com.greatlearning.gradedProject3.service.RoleService;

@RestController
@RequestMapping("/roleManagement")
public class RoleController {
	@Autowired
	RoleService rolesService;
	
	@GetMapping("/allRoles")
	public List<Role> getAllRoles() {
		return rolesService.findAllRoles();
	}
	
	@PostMapping("/addRole")
	public Role saveRole(@RequestBody Role role) {
		return rolesService.saveRole(role);
	}
}
