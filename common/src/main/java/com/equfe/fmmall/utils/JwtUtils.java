package com.equfe.fmmall.utils;

import com.equfe.fmmall.contains.FmMallContains;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * jwt工具类
 *
 * @author qiaoshiyang
 * @version 1.0.0
 * @date 2021/12/19 22:22
 */
public class JwtUtils {

    /**
     * 生成token
     *
     * @param username 用户名
     * @param id 用户id
     * @return java.lang.String
     * @author ShiYang
     * @date 2021/12/19 22:25
     */
    public static String getToken(String username, String id) {
        Map<String, Object> map = new HashMap<>();
        JwtBuilder builder = Jwts.builder().setSubject(username)
                .setIssuedAt(new Date())
                .setId(id)
                .setClaims(map)
                .setExpiration(new Date(System.currentTimeMillis() + 24 * 60 * 60 * 1000))
                .signWith(SignatureAlgorithm.HS256, FmMallContains.TOKEN_PASSWORD);
        return builder.compact();
    }
}
