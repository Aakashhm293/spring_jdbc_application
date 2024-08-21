package com.excel.jdbc.service.impl;

import com.excel.jdbc.dto.StudentDto;
import com.excel.jdbc.entity.Student;
import com.excel.jdbc.repository.ApplicationRepository;
import com.excel.jdbc.service.ApplicationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ApplicationServiceImpl implements ApplicationService {

    private final ApplicationRepository applicationRepository;

    @Override
    public String registerStudent(StudentDto dto) {
        return applicationRepository.save(Student.builder()
                .studentId(dto.getStudentId())
                .studentName(dto.getStudentName())
                .studentEmail(dto.getStudentEmail())
                .studentPassword(dto.getStudentPassword())
                .studentAddress(dto.getStudentAddress())
                .build());
    }
}
