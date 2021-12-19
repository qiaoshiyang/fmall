package com.qfedu.fmmall.controller;

import com.equfe.fmmall.vo.ResultVO;
import com.qfedu.fmmall.entity.Users;
import com.qfedu.fmmall.service.UsersService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 用户controller
 *
 * @author qiaoshiyang
 * @version 1.0.0
 * @date 2021/12/12 21:49
 */
@RestController
@RequestMapping("/user")
@Api(value = "用户相关接口", tags = "用户操作接口")
public class UserController {

    @Autowired
    private UsersService usersService;

    @ApiOperation("用户登录接口")
    @GetMapping("/login")
    public ResultVO login(@RequestParam("username") String name,
                          @RequestParam(value = "password") String pwd){
        return usersService.checkLogin(name, pwd);
    }

    @ApiOperation("用户注册接口")
    @PostMapping("/register")
    public ResultVO register(@RequestBody Users user){
        return usersService.userRegister(user.getUsername(), user.getPassword());
    }
}
