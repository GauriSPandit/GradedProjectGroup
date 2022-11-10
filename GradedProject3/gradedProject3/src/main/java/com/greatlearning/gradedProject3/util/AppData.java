package com.greatlearning.gradedProject3.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;

import com.greatlearning.gradedProject3.entity.Role;
import com.greatlearning.gradedProject3.entity.User;
import com.greatlearning.gradedProject3.repository.UserRepository;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor
public class AppData {

//	@Autowired UserRepository userRepo;
//	
//	@EventListener(ApplicationReadyEvent.class)
//	public void insertUsers(ApplicationReadyEvent event) {
//		User admin = new User();
//		List<Role> role = new ArrayList();
//		Role adminRole= new Role();
//		adminRole.setRoleId(2);
//		adminRole.setRoleName("Admin");
//		role.add(adminRole);
//		admin.setUsername("abc");
//		admin.setPassword("abc");
//		admin.setRoles(role);
//		userRepo.save(admin);
//	}
	
}
