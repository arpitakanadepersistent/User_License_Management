package com.example.UserLicense.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserLicense {

    public UserLicense(Long userId,String licenseKey){
        this.userId=userId;
        this.licenseKey=licenseKey;

    }

   @Id
    //@NonNull
    private Long userId;
    void setUserId(Long userId){

        this.userId=userId;
    }
    public Long getUserId(){
        return userId;
    }

    @NonNull
    private String licenseKey;
    void setLicenseKey(String licenseKey){
//        if(licenseKey!=null && licenseKey.isEmpty()){
//            licenseKey = null;
//        }
        this.licenseKey=licenseKey;
    }
    public String getLicenseKey(){
        return licenseKey;
    }

    private String status;
    void setStatus(String status){
//        if(licenseKey!=null && licenseKey.isEmpty()){
//            licenseKey = null;
//        }
        this.status=status;
    }
    public String getStatus(){
        return status;
    }

}
