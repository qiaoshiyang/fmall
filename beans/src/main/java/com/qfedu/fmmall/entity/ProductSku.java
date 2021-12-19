package com.qfedu.fmmall.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

/**
 * 商品规格 每一件商品都有不同的规格，不同的规格又有不同的价格和优惠力度，规格表为此设计
 *
 * @author qiaoshiyang
 * @version 1.0.0
 * @date 2021/12/14 22:28
 */
@Data
@Table(name = "product_sku")
public class ProductSku {
    /**
     * sku编号
     */
    @Id
    @Column(name = "sku_id")
    private String skuId;

    /**
     * 商品id
     */
    @Column(name = "product_id")
    private String productId;

    /**
     * sku名称
     */
    @Column(name = "sku_name")
    private String skuName;

    /**
     * sku图片
     */
    @Column(name = "sku_img")
    private String skuImg;

    /**
     * 属性组合（格式是p1:v1;p2:v2）
     */
    private String untitled;

    /**
     * 原价
     */
    @Column(name = "original_price")
    private Integer originalPrice;

    /**
     * 销售价格
     */
    @Column(name = "sell_price")
    private Integer sellPrice;

    /**
     * 折扣力度
     */
    private BigDecimal discounts;

    /**
     * 库存
     */
    private Integer stock;

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

    /**
     * sku状态(1启用，0禁用，-1删除)
     */
    private Integer status;

}