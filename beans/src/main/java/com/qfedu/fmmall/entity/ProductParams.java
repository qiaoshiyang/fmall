package com.qfedu.fmmall.entity;

import lombok.Data;

import java.util.Date;
import javax.persistence.*;

/**
 * 商品参数
 *
 * @author qiaoshiyang
 * @version 1.0.0
 * @date 2021/12/14 22:28
 */
@Data
@Table(name = "product_params")
public class ProductParams {
    /**
     * 商品参数id
     */
    @Id
    @Column(name = "param_id")
    private String paramId;

    /**
     * 商品id
     */
    @Column(name = "product_id")
    private String productId;

    /**
     * 产地 产地，例：中国江苏
     */
    @Column(name = "product_place")
    private String productPlace;

    /**
     * 保质期 保质期，例：180天
     */
    @Column(name = "foot_period")
    private String footPeriod;

    /**
     * 品牌名 品牌名，例：三只大灰狼
     */
    private String brand;

    /**
     * 生产厂名 生产厂名，例：大灰狼工厂
     */
    @Column(name = "factory_name")
    private String factoryName;

    /**
     * 生产厂址 生产厂址，例：大灰狼生产基地
     */
    @Column(name = "factory_address")
    private String factoryAddress;

    /**
     * 包装方式 包装方式，例：袋装
     */
    @Column(name = "packaging_method")
    private String packagingMethod;

    /**
     * 规格重量 规格重量，例：35g
     */
    private String weight;

    /**
     * 存储方法 存储方法，例：常温5~25°
     */
    @Column(name = "storage_method")
    private String storageMethod;

    /**
     * 食用方式 食用方式，例：开袋即食
     */
    @Column(name = "eat_method")
    private String eatMethod;

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