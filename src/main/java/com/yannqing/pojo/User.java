package com.yannqing.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    private Integer userId;
    private String username;
    private String password;
    private String sex;
    private String address;
    private String phone;
    private String email;
    private int age;
    private String avatar;
    private String signature;
    private String nickName;
    private int enabled;
    private int accountNoExpired;
    private int credentialsNoExpired;
    private int accountNoLock;
    private Timestamp createTime;
    private String description;
}