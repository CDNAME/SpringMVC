package com.cd.service;

import com.cd.beans.Student;
import com.cd.dao.IStudentDao;
import org.apache.felix.ipojo.transaction.Transactional;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("studentService")
public class StudentServiceImpl implements IStudentService {
    @Resource(name="IStudentDao")
    private IStudentDao dao;

    public void setDao(IStudentDao dao) {
        this.dao = dao;
    }

    @Transactional
    public void addStudent(Student student) {
        dao.insertStudent(student);
    }
}
