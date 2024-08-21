package com.excel.jdbc.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {

    private Integer studentId;
    private String studentName;
    private String studentEmail;
    private String studentPassword;
    private String studentAddress;
}
