package com.qfedu.fmmall.entity;

import lombok.Data;

import java.util.Date;
import javax.persistence.*;

/**
 * 用户表
 *
 * @author qiaoshiyang
 * @version 1.0.0
 * @date 2021/12/14 22:28
 */
@Data
public class Users {
    /**
     * 主键id 用户id
     */
    @Id
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 用户名 用户名
     */
    private String username;

    /**
     * 密码 密码
     */
    private String password;

    /**
     * 昵称 昵称
     */
    private String nickname;

    /**
     * 真实姓名 真实姓名
     */
    private String realname;

    /**
     * 头像 头像
     */
    @Column(name = "user_img")
    private String userImg;

    /**
     * 手机号 手机号
     */
    @Column(name = "user_mobile")
    private String userMobile;

    /**
     * 邮箱地址 邮箱地址
     */
    @Column(name = "user_email")
    private String userEmail;

    /**
     * 性别 M(男) or F(女)
     */
    @Column(name = "user_sex")
    private String userSex;

    /**
     * 生日 生日
     */
    @Column(name = "user_birth")
    private Date userBirth;

    /**
     * 注册时间 创建时间
     */
    @Column(name = "user_regtime")
    private Date userRegtime;

    /**
     * 更新时间 更新时间
     */
    @Column(name = "user_modtime")
    private Date userModtime;
}