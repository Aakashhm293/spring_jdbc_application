package com.excel.jdbc.util;

import com.excel.jdbc.dto.StudentDto;
import com.excel.jdbc.entity.Student;

public class DtoToEntity {

    public static Student dtoTOEntity(StudentDto dto){
        return Student.builder()
                .studentId(dto.getStudentId())
                .studentName(dto.getStudentName())
                .studentEmail(dto.getStudentEmail())
                .studentPassword(dto.getStudentPassword())
                .studentAddress(dto.getStudentAddress())
                .build();
    }
}
