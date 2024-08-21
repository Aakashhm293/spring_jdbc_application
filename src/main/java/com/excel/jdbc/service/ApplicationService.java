package com.excel.jdbc.service;

import com.excel.jdbc.dto.StudentDto;

import java.util.List;

public interface ApplicationService {

    String registerStudent(StudentDto dto);

    String updateStudent(StudentDto dto);

    List<StudentDto> getAllStudents();

    StudentDto getStudentByEmail(StudentDto dto);

    String deleteStudentByEmail(StudentDto dto);
}
