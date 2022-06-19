package com.wei.community.entity;

import java.util.Date;

import lombok.Data;

/**
 * @author wei
 */

@Data
public class User {
    private Integer id;

    private String username;

    private String password;

    private String salt;

    private String email;

    private Integer type;

    private Integer status;

    private String activationCode;

    private String headerUrl;

    private Date createTime;
}