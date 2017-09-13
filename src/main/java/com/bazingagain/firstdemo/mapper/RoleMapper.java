package com.bazingagain.firstdemo.mapper;

import com.bazingagain.firstdemo.object.Role;

/**
 * Created on 13/09/2017.
 *
 * @author Xiaolei-Peng
 */
public interface RoleMapper {
    Role getRole(Long id);
    int insertRole(Role role);
    int deleteRole(Long id);
}
