package com.example.UserLicense.service;

import com.example.UserLicense.entity.UserLicense;
import com.example.UserLicense.repository.UserLicenseRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j

public class UserLicenseService {

    @Autowired
    private UserLicenseRepository userLicenseRepository;



    public UserLicense saveUserLicense(UserLicense userLicense) {
        log.info("Inside saveUser method of UserLicenseService");
        UserLicense userLicense1= userLicenseRepository.save(userLicense);
        return userLicense1;
    }


    public UserLicense findUserById(Long userId) {
        log.info("Inside saveUser method of UserLicenseService");
        return userLicenseRepository.findByUserId(userId);

    }





    public void deleteUserByIdService(Long userId) {
        log.info("Inside deleteUserById of UserLicenseService");
        userLicenseRepository.deleteById(userId);
    }

}