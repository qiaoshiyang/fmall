package com.qfedu.fmmall.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

/**
 * 订单项/快照
 *
 * @author qiaoshiyang
 * @version 1.0.0
 * @date 2021/12/14 22:28
 */
@Data
@Table(name = "order_item")
public class OrderItem {
    /**
     * 订单项ID
     */
    @Id
    @Column(name = "item_id")
    private String itemId;

    /**
     * 订单ID
     */
    @Column(name = "order_id")
    private String orderId;

    /**
     * 商品ID
     */
    @Column(name = "product_id")
    private String productId;

    /**
     * 商品名称
     */
    @Column(name = "product_name")
    private String productName;

    /**
     * 商品图片
     */
    @Column(name = "product_img")
    private String productImg;

    /**
     * skuID
     */
    @Column(name = "sku_id")
    private String skuId;

    /**
     * sku名称
     */
    @Column(name = "sku_name")
    private String skuName;

    /**
     * 商品价格
     */
    @Column(name = "product_price")
    private BigDecimal productPrice;

    /**
     * 购买数量
     */
    @Column(name = "buy_counts")
    private Integer buyCounts;

    /**
     * 商品总金额
     */
    @Column(name = "total_amount")
    private BigDecimal totalAmount;

    /**
     * 加入购物车时间
     */
    @Column(name = "basket_date")
    private Date basketDate;

    /**
     * 购买时间
     */
    @Column(name = "buy_time")
    private Date buyTime;

    /**
     * 评论状态： 0 未评价  1 已评价
     */
    @Column(name = "is_comment")
    private Integer isComment;

}