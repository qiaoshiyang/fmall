package com.qfedu.fmmall.entity;

import lombok.Data;

import java.math.BigDecimal;
import javax.persistence.*;

/**
 * 购物车
 *
 * @author qiaoshiyang
 * @version 1.0.0
 * @date 2021/12/14 22:28
 */
@Data
@Table(name = "shopping_cart")
public class ShoppingCart {
    /**
     * 主键
     */
    @Id
    @Column(name = "cart_id")
    private Integer cartId;

    /**
     * 商品ID
     */
    @Column(name = "product_id")
    private String productId;

    /**
     * skuID
     */
    @Column(name = "sku_id")
    private String skuId;

    /**
     * 用户ID
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 购物车商品数量
     */
    @Column(name = "cart_num")
    private String cartNum;

    /**
     * 添加购物车时间
     */
    @Column(name = "cart_time")
    private String cartTime;

    /**
     * 添加购物车时商品价格
     */
    @Column(name = "product_price")
    private BigDecimal productPrice;

    /**
     * 选择的套餐的属性
     */
    @Column(name = "sku_props")
    private String skuProps;

}