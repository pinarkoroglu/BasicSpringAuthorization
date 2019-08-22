package com.example.security.Repository;

import com.example.security.Model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("roleRepository")
public interface RoleRepository extends JpaRepository<Role,Integer> {
    Role findByRole(String roleName);
}
