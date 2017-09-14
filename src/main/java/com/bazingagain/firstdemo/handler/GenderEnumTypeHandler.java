package com.bazingagain.firstdemo.handler;

import com.bazingagain.firstdemo.enums.Gender;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 自定义 性别枚举处理器
 *
 * Created on 15/09/2017.
 *
 * @author Xiaolei-Peng
 */
public class GenderEnumTypeHandler implements TypeHandler<Gender> {
    public void setParameter(PreparedStatement preparedStatement, int i, Gender gender, JdbcType jdbcType) throws SQLException {
        preparedStatement.setInt(i, gender.getId());
    }

    public Gender getResult(ResultSet resultSet, String s) throws SQLException {
        int id = resultSet.getInt(s);
        return Gender.getGender(id);
    }

    public Gender getResult(ResultSet resultSet, int i) throws SQLException {
        int id = resultSet.getInt(i);
        return Gender.getGender(id);
    }

    public Gender getResult(CallableStatement callableStatement, int i) throws SQLException {
        int id = callableStatement.getInt(i);
        return Gender.getGender(id);
    }
}
