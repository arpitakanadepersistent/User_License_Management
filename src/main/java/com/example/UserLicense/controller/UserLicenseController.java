package com.example.UserLicense.controller;

import com.example.UserLicense.entity.UserLicense;
import com.example.UserLicense.service.UserLicenseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserLicenseController {

    @Autowired
    private UserLicenseService userLicenseService;



    @PostMapping("/")
    public UserLicense saveUserLicense(@RequestBody UserLicense userLicense) {
        log.info("Inside saveUser method of UserController");
        return userLicenseService.saveUserLicense(userLicense);


    }

    @GetMapping("/{id}")
    public UserLicense findUserById(@PathVariable("id") Long userId) {
        log.info("Inside findUserById method of UserController");
        return userLicenseService.findUserById(userId);
    }




    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable("id") Long userId) {
        log.info("Inside deleteUserById method of UserController");
         userLicenseService.deleteUserByIdService(userId);

    }

}