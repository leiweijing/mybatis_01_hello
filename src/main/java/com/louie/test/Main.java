package com.louie.test;

import com.louie.mapper.StudentMapper;
import com.louie.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;

/**
 * mybatis基础使用：
 * 1. 导入依赖
 * 2. 编写mybatis配置文件 mybatis-config.xml 和 config.properties
 * 3. 编写SqlSessionFactoryUtils工具类
 * 4. 编写实体类
 * 5. 编写StudentMapper接口和StudentMapper.xml映射器
 * 6. Main类启动运行
 */
public class Main {

    public static void main(String[] args) {
        SqlSession sqlSession = SqlSessionFactoryUtils.openSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        System.out.println(mapper.getStudent(1).toString());
    }
}
