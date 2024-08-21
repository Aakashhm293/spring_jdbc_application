package com.excel.jdbc.util;

import com.excel.jdbc.dto.StudentDto;
import com.excel.jdbc.entity.Student;

public class Conversion {

    public static Student dtoToEntity(StudentDto dto){
        return Student.builder()
                .studentId(dto.getStudentId())
                .studentName(dto.getStudentName())
                .studentEmail(dto.getStudentEmail())
                .studentPassword(dto.getStudentPassword())
                .studentAddress(dto.getStudentAddress())
                .build();
    }

    public static StudentDto entityToDto(Student student){
        return StudentDto.builder()
                .studentId(student.getStudentId())
                .studentName(student.getStudentName())
                .studentEmail(student.getStudentEmail())
                .studentPassword(student.getStudentPassword())
                .studentAddress(student.getStudentAddress())
                .build();
    }
}
