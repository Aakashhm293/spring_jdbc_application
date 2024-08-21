package com.excel.jdbc.repository;

import com.excel.jdbc.entity.Student;

import java.util.List;

public interface ApplicationRepository {
    String save(Student build);

    String update(Student student);

    List<Student> getAllStudentDetails();
}
