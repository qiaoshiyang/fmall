package com.qfedu.fmmall.service.impl;

import com.equfe.fmmall.utils.JwtUtils;
import com.equfe.fmmall.utils.MD5Utils;
import com.equfe.fmmall.vo.ResStatus;
import com.equfe.fmmall.vo.ResultVO;
import com.qfedu.fmmall.entity.Users;
import com.qfedu.fmmall.mapper.UsersMapper;
import com.qfedu.fmmall.service.UsersService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.Date;
import java.util.List;

/**
 * 用户接口实现类
 *
 * @author qiaoshiyang
 * @version 1.0.0
 * @date 2021/12/15 20:33
 */
@Service
@Slf4j
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public ResultVO checkLogin(String name, String pwd) {
        Example example = new Example(Users.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("username", name);
        List<Users> usersList = usersMapper.selectByExample(example);
        if(usersList.size() == 0){
            return new ResultVO(ResStatus.NO,"登录失败，用户名不存在！",null);
        }else{
            String md5Pwd = MD5Utils.md5(pwd);
            assert md5Pwd != null;
            Users users = usersList.get(0);
            if(md5Pwd.equals(users.getPassword())){
                log.info("用户【{}】登录成功，生成token返回", users.getUserImg());
                String token = JwtUtils.getToken(users.getUsername(), users.getUserId().toString());
                return new ResultVO(ResStatus.OK, token, users);
            }else{
                return new ResultVO(ResStatus.NO,"登录失败，密码错误！",null);
            }
        }
    }

    @Override
    public ResultVO userRegister(String username, String password) {
        synchronized (this) {
            Example example = new Example(Users.class);
            Example.Criteria criteria = example.createCriteria();
            criteria.andEqualTo("username", username);
            List<Users> users = usersMapper.selectByExample(example);
            if (users.size() == 0) {
                log.info("用户名{}没有被注册则进行保存操作", username);
                String md5Pwd = MD5Utils.md5(password);
                Users user = new Users();
                user.setUsername(username);
                user.setPassword(md5Pwd);
                user.setUserImg("img/default.png");
                user.setUserRegtime(new Date());
                user.setUserModtime(new Date());
                int i = usersMapper.insertUseGeneratedKeys(user);
                if (i > 0) {
                    return new ResultVO(ResStatus.OK, "注册成功！", user);
                } else {
                    return new ResultVO(ResStatus.NO, "注册失败！", null);
                }
            } else {
                return new ResultVO(ResStatus.NO, "用户名已经被注册！", null);
            }
        }
    }
}
