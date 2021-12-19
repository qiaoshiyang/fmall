package com.qfedu.fmmall.controller;

import com.equfe.fmmall.vo.ResStatus;
import com.equfe.fmmall.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 购物车controller
 *
 * @author qiaoshiyang
 * @version 1.0.0
 * @date 2021/12/19 18:58
 */
@RestController
@RequestMapping("/shopcart")
@Api(value = "购物车业务", tags = "购物车接口管理")
public class ShopCartController {

    @ApiOperation("查询用户购物车列表")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResultVO listCarts(@RequestParam("userId") String userId) {
        return new ResultVO(ResStatus.OK, userId, null);
    }
}
