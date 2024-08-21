package com.excel.jdbc.controller;

import com.excel.jdbc.dto.StudentDto;
import com.excel.jdbc.response.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface ApplicationController {

    ResponseEntity<Response<String>> registerStudent(@RequestBody StudentDto dto);

    ResponseEntity<Response<String>> updateStudent(@RequestBody StudentDto dto);

    ResponseEntity<Response<List<StudentDto>>> getAllStudentDetails();

    ResponseEntity<Response<StudentDto>> getStudentByEmail(@RequestBody StudentDto dto);

    ResponseEntity<Response<String>> deleteStudentByEmail(@RequestBody StudentDto dto);
}
