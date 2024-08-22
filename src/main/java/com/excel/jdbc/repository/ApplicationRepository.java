package com.excel.jdbc.repository;

import com.excel.jdbc.entity.Student;

import java.util.List;

public interface ApplicationRepository {

    String save(Student student);

    String update(Student student);

    List<Student> getAllStudentDetails();

    Student getByStudentEmail(Student student);

    String deleteStudentByEmail(String studentEmail);
}
