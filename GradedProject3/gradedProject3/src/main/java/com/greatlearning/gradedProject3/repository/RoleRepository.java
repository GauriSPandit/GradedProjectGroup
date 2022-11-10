package com.greatlearning.gradedProject3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.gradedProject3.entity.Role;
@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

	
}
