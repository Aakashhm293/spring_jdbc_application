package com.excel.jdbc.controller.impl;

import com.excel.jdbc.constants.Constants;
import com.excel.jdbc.controller.ApplicationController;
import com.excel.jdbc.dto.StudentDto;
import com.excel.jdbc.response.Response;
import com.excel.jdbc.service.ApplicationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class ApplicationControllerImpl implements ApplicationController {

    private final ApplicationService applicationService;

    @PostMapping("/register")
    @Override
    public ResponseEntity<Response<String>> registerStudent(@RequestBody StudentDto dto) {
        return ResponseEntity.status(HttpStatus.OK).body(Response.<String>builder()
                .data(applicationService.registerStudent(dto))
                .isError(false)
                .message(Constants.SUCCESSFULLY_INSERTED.getConstant())
                .build());
    }

    @PutMapping("/update")
    @Override
    public ResponseEntity<Response<String>> updateStudent(@RequestBody StudentDto dto){
        return ResponseEntity.status(HttpStatus.OK).body(Response.<String>builder()
                        .data(applicationService.updateStudent(dto))
                        .isError(false)
                        .message(Constants.SUCCESSFULLY_UPDATED.getConstant())
                .build());
    }

    @GetMapping("/get")
    @Override
    public ResponseEntity<Response<List<StudentDto>>> getAllStudentDetails(){
        return ResponseEntity.status(HttpStatus.OK).body(Response.<List<StudentDto>>builder()
                        .data(applicationService.getAllStudents())
                        .isError(false)
                        .message(Constants.ALL_RECORDS.getConstant())
                .build());
    }

    @PostMapping("/getByEmail")
    @Override
    public ResponseEntity<Response<StudentDto>> getStudentByEmail(@RequestBody StudentDto dto){
        return ResponseEntity.status(HttpStatus.OK).body(Response.<StudentDto>builder()
                        .data(applicationService.getStudentByEmail(dto))
                        .isError(false)
                        .message(Constants.STUDENT_FETCH_BY_EMAIL.getConstant())
                .build());
    }

    @DeleteMapping("/delete")
    @Override
    public ResponseEntity<Response<String>> deleteStudentByEmail(@RequestBody StudentDto dto){
        return ResponseEntity.status(HttpStatus.OK).body(Response.<String>builder()
                        .data(applicationService.deleteStudentByEmail(dto))
                        .isError(false)
                        .message(Constants.STUDENT_SUCCESSFULLY_DELETED.getConstant())
                .build());
    }
}
