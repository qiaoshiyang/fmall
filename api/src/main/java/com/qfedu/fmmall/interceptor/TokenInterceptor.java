package com.qfedu.fmmall.interceptor;

import cn.hutool.core.util.StrUtil;
import com.equfe.fmmall.contains.FmMallContains;
import com.equfe.fmmall.vo.ResStatus;
import com.equfe.fmmall.vo.ResultVO;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.jsonwebtoken.*;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 拦截器校验token
 *
 * @author qiaoshiyang
 * @version 1.0.0
 * @date 2021/12/19 22:32
 */
@Component
public class TokenInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String token = request.getParameter("token");
        if (StrUtil.isBlank(token)) {
            ResultVO resultVO = new ResultVO(ResStatus.NO, "未登陆！", null);
            doResponse(response, resultVO);
            return false;
        } else {
            try {
                JwtParser parser = Jwts.parser();
                parser.setSigningKey(FmMallContains.TOKEN_PASSWORD);
                Jws<Claims> claimsJws = parser.parseClaimsJws(token);
                return true;
            } catch (ExpiredJwtException e) {
                ResultVO resultVO = new ResultVO(ResStatus.NO, "登录过期，请重新登录！", null);
                doResponse(response, resultVO);
            } catch (UnsupportedJwtException e) {
                ResultVO resultVO = new ResultVO(ResStatus.NO, "token不合法！", null);
                doResponse(response, resultVO);
            } catch (Exception e) {
                ResultVO resultVO = new ResultVO(ResStatus.NO, "未知原因，token解析失败！", null);
                doResponse(response, resultVO);
            }
        }
        return false;
    }

    /**
     * 设置返回
     *
     * @param response 返回对象
     * @param resultVO 数据信息
     * @return void
     * @author ShiYang
     * @date 2021/12/19 22:49
     */
    private void doResponse(HttpServletResponse response, ResultVO resultVO) throws IOException {
        response.setContentType("application/json");
        response.setCharacterEncoding("utf-8");
        PrintWriter writer = response.getWriter();
        String s = new ObjectMapper().writeValueAsString(resultVO);
        writer.print(s);
        writer.flush();
        writer.close();
    }
}
