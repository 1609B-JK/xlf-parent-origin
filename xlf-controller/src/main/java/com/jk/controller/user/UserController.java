package com.jk.controller.user;

import com.jk.pojo.ResultData;
import com.jk.pojo.user.UserRequest;
import com.jk.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by Lynn-F_X on 2017/5/24.
 */
@Controller
@RequestMapping("/user/")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("login")
    @ResponseBody
    public ResultData  login(@RequestBody UserRequest userRequest){
        String msg = "登录成功";
        int code = 200;
        Object data = null;
        ResultData rd = new ResultData();
        Map<String,Object> map = userService.login(userRequest);
        if("0".equals(map.get("flag"))){//业务逻辑层传来值是0
            code = 201;
            msg = "用户登录不成功";
        }else if("1".equals(map.get("flag"))){
            code = 201;
            msg = "用户密码不正确";
        }else {
            data = map.get("userInfo");//登录成功,返回查询用户的信息
        }
        rd.setCode(code);
        rd.setMsg(msg);
        rd.setData(data);
        return rd;
    }

    @RequestMapping("regedit")//注册
    @ResponseBody
    public ResultData regedit(@RequestBody UserRequest userRequest){
        String msg = "注册成功";
        int code = 200;
        Object data = null;
        ResultData rd = new ResultData();
        int result = userService.regedit(userRequest);
        if(0 == result){//假,用户名重复
            code = 201;
            msg = "用户名重复";
        }
        rd.setCode(code);
        rd.setMsg(msg);
        rd.setData(data);
        return rd;

    }




}
