package com.bazingagain.firstdemo.mapper;

import com.bazingagain.firstdemo.object.User;

/**
 * Created on 14/09/2017.
 *
 * @author Xiaolei-Peng
 */
public interface UserMapper {
    User getUser(Long id);
    int insertUser(User user);
}
