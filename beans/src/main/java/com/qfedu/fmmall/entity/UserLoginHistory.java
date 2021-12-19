package com.qfedu.fmmall.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * 登录历史表
 *
 * @author qiaoshiyang
 * @version 1.0.0
 * @date 2021/12/14 22:28
 */
@Data
@Table(name = "user_login_history")
public class UserLoginHistory {
    /**
     * ID
     */
    @Id
    @Column(name = "ID")
    private Integer id;

    /**
     * 地区
     */
    @Column(name = "AREA")
    private String area;

    /**
     * 国家
     */
    @Column(name = "COUNTRY")
    private String country;

    /**
     * 用户id
     */
    @Column(name = "USER_ID")
    private String userId;

    /**
     * IP
     */
    @Column(name = "IP")
    private String ip;

    /**
     * 时间
     */
    @Column(name = "LOGIN_TIME")
    private String loginTime;

}