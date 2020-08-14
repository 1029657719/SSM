package com.bjpowernode.dao;

import com.bjpowernode.domain.Student;

import java.util.Iterator;
import java.util.List;

public interface StudentDao {
    List<Student> selectStudents(Integer id);

    int insertStudent(Student student);
}
