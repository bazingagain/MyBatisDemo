package com.bazingagain.firstdemo.app;

import com.bazingagain.firstdemo.enums.Gender;
import com.bazingagain.firstdemo.mapper.RoleMapper;
import com.bazingagain.firstdemo.mapper.UserMapper;
import com.bazingagain.firstdemo.object.Role;
import com.bazingagain.firstdemo.object.User;
import com.bazingagain.firstdemo.utils.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import java.util.Date;

/**
 * Created on 13/09/2017.
 *
 * @author Xiaolei-Peng
 */
public class App {
    private static Logger logger = Logger.getLogger(App.class);

    public static void main(String[] args) {
        testUser();
    }

    public static void testRole() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtil.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            Role role = new Role();
            role.setRoleName("teacher");
            role.setNote("a note");
            roleMapper.insertRole(role);
            roleMapper.getRole(1L);
            roleMapper.deleteRole(1L);
            sqlSession.commit();
        } catch (Exception e) {
            logger.error("execute error", e);
            if (sqlSession != null) {
                sqlSession.rollback();
            }
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    public static void testUser() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtil.openSqlSession();
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            User user = new User();
            user.setUserName("testUser");
            user.setGender(Gender.MALE);
            user.setBirthday(new Date());
            userMapper.insertUser(user);
            System.out.println(user.getId());
//            User user1 = userMapper.getUser(user.getId());
            sqlSession.commit();
        } catch (Exception e) {
            logger.error("execute error", e);
            if (sqlSession != null) {
                sqlSession.rollback();
            }
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }
}
