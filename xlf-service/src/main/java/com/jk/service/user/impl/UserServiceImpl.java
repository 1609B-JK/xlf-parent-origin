package com.jk.service.user.impl;

import com.jk.mapper.user.UserMapper;
import com.jk.pojo.ResultData;
import com.jk.pojo.user.UserRequest;
import com.jk.pojo.user.UserResponse;
import com.jk.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Lynn-F_X on 2017/5/24.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public Map<String, Object> login(UserRequest userRequest) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("flag",0);//设置初始值,默认登录不成功
        map.put("userInfo",null);//用户也无信息
        //进行查询,返回用户的信息
        UserResponse userResponse = userMapper.login(userRequest);
        if(null != userResponse){//用户的信息不为空,说明用户存在
            if(userRequest.getUserPwd().equals(userResponse.getUserPwd())){
                map.put("flag",2);//密码对比.密码正确
                map.put("userInfo",userResponse);//保存用户信息
            }else{
                map.put("flag",1);//密码不正确
            }

        }
        return map;
    }

    @Override
    public int regedit(UserRequest userRequest) {
        int flag = 0;//设置flag为0即假,用户名重复
        //查询用户名看是否重复
        UserResponse userResponse = userMapper.login(userRequest);
        if (null == userResponse) {//是空,不重复,进行注册
            flag = 1;
            //非0即真,用户名不重复,注册
            userMapper.insertUser(userRequest);
        }
        return flag;//用户名重复,flag=0
    }


}
