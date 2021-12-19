package com.qfedu.fmmall.entity;

import lombok.Data;

import java.util.Date;
import javax.persistence.*;

/**
 * 轮播图
 *
 * @author qiaoshiyang
 * @version 1.0.0
 * @date 2021/12/14 22:28
 */
@Data
@Table(name = "index_img")
public class IndexImg {
    /**
     * 主键
     */
    @Id
    @Column(name = "img_id")
    private String imgId;

    /**
     * 图片 图片地址
     */
    @Column(name = "img_url")
    private String imgUrl;

    /**
     * 背景色 背景颜色
     */
    @Column(name = "img_bg_color")
    private String imgBgColor;

    /**
     * 商品id 商品id
     */
    @Column(name = "prod_id")
    private String prodId;

    /**
     * 商品分类id 商品分类id
     */
    @Column(name = "category_id")
    private String categoryId;

    /**
     * 轮播图类型 轮播图类型，用于判断，可以根据商品id或者分类进行页面跳转，1：商品 2：分类
     */
    @Column(name = "index_type")
    private Integer indexType;

    /**
     * 轮播图展示顺序 轮播图展示顺序，从小到大
     */
    @Column(name = "seq")
    private Integer seq;

    /**
     * 是否展示:1表示正常显示，0表示下线 是否展示，1：展示    0：不展示
     */
    @Column(name = "status")
    private Integer status;

    /**
     * 创建时间 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间 更新
     */
    @Column(name = "update_time")
    private Date updateTime;
}