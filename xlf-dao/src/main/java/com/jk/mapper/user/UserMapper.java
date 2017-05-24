package com.jk.mapper.user;

import com.jk.pojo.user.UserRequest;
import com.jk.pojo.user.UserResponse;

/**
 * Created by Lynn-F_X on 2017/5/24.
 */
public interface UserMapper {
    UserResponse login(UserRequest userRequest);

    void insertUser(UserRequest userRequest);
}
