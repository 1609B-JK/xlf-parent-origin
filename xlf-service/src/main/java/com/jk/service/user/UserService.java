package com.jk.service.user;

import com.jk.pojo.user.UserRequest;

import java.util.Map;

/**
 * Created by Lynn-F_X on 2017/5/24.
 */
public interface UserService {

    Map<String,Object> login(UserRequest userRequest);

    int regedit(UserRequest userRequest);
}
