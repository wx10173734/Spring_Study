package com.cn.lzc.service;

import com.cn.lzc.dao.StudentDao;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @title: StudentService
 * @Author luozouchen
 * @Date: 2022/10/31 23:28
 */
@Service
public class StudentService {
    @Resource
    private StudentDao studentDao;
    //不能出现在构造方法上
//    @Resource(name = "studentDaoImplForMysql")
//    public StudentService(StudentDao studentDao) {
//        this.studentDao = studentDao;
//    }

//    @Resource(name = "studentDaoImplForMysql")
//    public void setStudentDao(StudentDao studentDao) {
//        this.studentDao = studentDao;
//    }

    public void deleteStudent() {
        studentDao.deleteById();
    }
}
