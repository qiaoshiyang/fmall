package com.qfedu.fmmall.general;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * 通用mapper
 *
 * @author qiaoshiyang
 * @version 1.0.0
 * @date 2021/12/14 22:28
 */
public interface GeneralMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
