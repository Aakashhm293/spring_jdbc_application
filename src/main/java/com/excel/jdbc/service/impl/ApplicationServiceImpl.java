package com.excel.jdbc.service.impl;

import com.excel.jdbc.dto.StudentDto;
import com.excel.jdbc.repository.ApplicationRepository;
import com.excel.jdbc.service.ApplicationService;
import com.excel.jdbc.util.DtoToEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ApplicationServiceImpl implements ApplicationService {

    private final ApplicationRepository applicationRepository;

    @Override
    public String registerStudent(StudentDto dto) {
        return applicationRepository.save(DtoToEntity.dtoTOEntity(dto));
    }

    @Override
    public String updateStudent(StudentDto dto) {
        return applicationRepository.update(DtoToEntity.dtoTOEntity(dto));
    }
}
