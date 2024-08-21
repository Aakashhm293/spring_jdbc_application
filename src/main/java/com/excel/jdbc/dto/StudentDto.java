package com.excel.jdbc.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentDto {
    private Integer studentId;
    private String studentName;
    private String studentEmail;
    private String studentPassword;
    private String studentAddress;
}
