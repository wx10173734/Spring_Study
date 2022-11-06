package com.cn.lzc.dao.impl;

import com.cn.lzc.dao.StudentDao;
import org.springframework.stereotype.Repository;

/**
 * @title: StudentDaoImplForMysql
 * @Author luozouchen
 * @Date: 2022/10/31 23:27
 */
@Repository("studentDao")
public class StudentDaoImplForOracle implements StudentDao {
    @Override
    public void deleteById() {
        System.out.println("oracle数据库正在删除学生信息");
    }
}
