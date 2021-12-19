package com.qfedu.fmmall.service;

import com.equfe.fmmall.vo.ResultVO;

/**
 * 用户相关接口
 *
 * @author qiaoshiyang
 * @version 1.0.0
 * @date 2021/12/15 20:32
 */
public interface UsersService {

    /**
     * 用户登录
     *
     * @param name 用户名
     * @param pwd 密码
     * @return com.equfe.fmmall.vo.ResultVO
     * @author ShiYang
     * @date 2021/12/15 21:26
     */
    ResultVO checkLogin(String name, String pwd);

    /**
     * 用户注册接口
     *
     * @param username 用户名
     * @param password 密码
     * @return com.equfe.fmmall.vo.ResultVO
     * @author ShiYang
     * @date 2021/12/15 21:27
     */
    ResultVO userRegister(String username, String password);
}
