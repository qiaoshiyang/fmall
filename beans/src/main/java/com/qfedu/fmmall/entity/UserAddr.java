package com.qfedu.fmmall.entity;

import lombok.Data;

import java.util.Date;
import javax.persistence.*;

/**
 * 用户地址
 *
 * @author qiaoshiyang
 * @version 1.0.0
 * @date 2021/12/14 22:28
 */
@Data
@Table(name = "user_addr")
public class UserAddr {
    /**
     * 地址主键id
     */
    @Id
    @Column(name = "addr_id")
    private String addrId;

    /**
     * 用户ID
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 收件人姓名
     */
    @Column(name = "receiver_name")
    private String receiverName;

    /**
     * 收件人手机号
     */
    @Column(name = "receiver_mobile")
    private String receiverMobile;

    /**
     * 省份
     */
    private String province;

    /**
     * 城市
     */
    private String city;

    /**
     * 区县
     */
    private String area;

    /**
     * 详细地址
     */
    private String addr;

    /**
     * 邮编
     */
    @Column(name = "post_code")
    private String postCode;

    /**
     * 状态,1正常，0无效
     */
    private Integer status;

    /**
     * 是否默认地址 1是 1:是  0:否
     */
    @Column(name = "common_addr")
    private Integer commonAddr;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

}