package com.projectfinal.finalproject.repositories;

import com.projectfinal.finalproject.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Role findByRole(String role);
}
