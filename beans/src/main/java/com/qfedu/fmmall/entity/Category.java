package com.qfedu.fmmall.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * 商品分类
 *
 * @author qiaoshiyang
 * @version 1.0.0
 * @date 2021/12/14 22:28
 */
@Data
@Table(name = "category")
public class Category {
    /**
     * 主键 分类id主键
     */
    @Id
    @Column(name = "category_id")
    private Integer categoryId;

    /**
     * 分类名称 分类名称
     */
    @Column(name = "category_name")
    private String categoryName;

    /**
     * 分类层级 分类得类型，
     *  1:一级大分类
     *  2:二级分类
     *  3:三级小分类
     */
    @Column(name = "category_level")
    private Integer categoryLevel;

    /**
     * 父层级id 父id 上一级依赖的id，1级分类则为0，二级三级分别依赖上一级
     */
    @Column(name = "parent_id")
    private Integer parentId;

    /**
     * 图标 logo
     */
    @Column(name = "category_icon")
    private String categoryIcon;

    /**
     * 口号
     */
    @Column(name = "category_slogan")
    private String categorySlogan;

    /**
     * 分类图
     */
    @Column(name = "category_pic")
    private String categoryPic;

    /**
     * 背景颜色
     */
    @Column(name = "category_bg_color")
    private String categoryBgColor;

}