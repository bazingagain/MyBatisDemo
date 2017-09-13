package com.bazingagain.firstdemo.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created on 13/09/2017.
 *
 * @author Xiaolei-Peng
 */
public class SqlSessionFactoryUtil {

    private static Logger logger = Logger.getLogger(SqlSessionFactoryUtil.class);

    private static SqlSessionFactory sqlSessionFactory;

    private static final Class CLASS_LOCK = SqlSessionFactoryUtil.class;

    private SqlSessionFactoryUtil() {}

    public static SqlSessionFactory initSqlSessionFactory() {
        String resources = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resources);
        } catch (IOException e) {
            logger.info(e.getCause());
        }

        synchronized (CLASS_LOCK) {
            if (sqlSessionFactory == null) {
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            }
        }
        return sqlSessionFactory;
    }

    public static SqlSession openSqlSession() {
        if (sqlSessionFactory == null) {
            initSqlSessionFactory();
        }
        return sqlSessionFactory.openSession();
    }
}
