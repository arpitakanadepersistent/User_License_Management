package com.example.UserLicense.repository;

import com.example.UserLicense.entity.UserLicense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserLicenseRepository extends JpaRepository<UserLicense, Long> {
    UserLicense findByUserId(Long userId);
}



