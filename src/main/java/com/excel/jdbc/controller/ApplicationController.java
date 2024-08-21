package com.excel.jdbc.controller;

import com.excel.jdbc.dto.StudentDto;
import com.excel.jdbc.response.Response;
import com.excel.jdbc.service.ApplicationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class ApplicationController {

    private final ApplicationService applicationService;

    @PostMapping("/register")
    public ResponseEntity<Response<String>> registerStudent(@RequestBody StudentDto dto) {
        return ResponseEntity.status(HttpStatus.OK).body(Response.<String>builder()
                .data(applicationService.registerStudent(dto))
                .isError(false)
                .message("Successfully Inserted")
                .build());
    }
}
