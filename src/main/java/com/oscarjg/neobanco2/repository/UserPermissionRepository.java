package com.oscarjg.neobanco2.repository;

import com.oscarjg.neobanco2.model.UserPermission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserPermissionRepository extends JpaRepository<UserPermission, Long> {
}