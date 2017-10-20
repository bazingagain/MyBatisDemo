package com.bazingagain.firstdemo.mapper;

import com.bazingagain.firstdemo.object.Role;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * Created on 13/09/2017.
 *
 * @author Xiaolei-Peng
 */
public interface RoleMapper {
    Role getRole(Long id);
    List<Role> findRolesByName(String roleName, RowBounds rowBounds);
    int insertRole(Role role);
    int deleteRole(Long id);
}
