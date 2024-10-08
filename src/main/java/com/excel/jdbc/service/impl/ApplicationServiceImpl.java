package com.excel.jdbc.service.impl;

import com.excel.jdbc.dto.StudentDto;
import com.excel.jdbc.entity.Student;
import com.excel.jdbc.repository.ApplicationRepository;
import com.excel.jdbc.service.ApplicationService;
import com.excel.jdbc.util.Conversion;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ApplicationServiceImpl implements ApplicationService {

    private final ApplicationRepository applicationRepository;

    @Override
    public String registerStudent(StudentDto dto) {
        return applicationRepository.save(Conversion.dtoToEntity(dto));
    }

    @Override
    public String updateStudent(StudentDto dto) {
        return applicationRepository.update(Conversion.dtoToEntity(dto));
    }

    @Override
    public List<StudentDto> getAllStudents() {
        List<Student> allStudentDetails = applicationRepository.getAllStudentDetails();

        return allStudentDetails.stream().map(e -> StudentDto.builder()
                .studentId(e.getStudentId())
                .studentName(e.getStudentName())
                .studentEmail(e.getStudentEmail())
                .studentPassword(e.getStudentPassword())
                .studentAddress(e.getStudentAddress())
                .build()).toList();
    }

    @Override
    public StudentDto getStudentByEmail(StudentDto dto) {
        return Conversion.entityToDto(applicationRepository.getByStudentEmail(Conversion.dtoToEntity(dto)));
    }

    @Override
    public String deleteStudentByEmail(StudentDto dto) {
        return applicationRepository.deleteStudentByEmail(dto.getStudentEmail());
    }
}

