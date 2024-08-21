package com.excel.jdbc.constants;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Queries {

    REGISTER_STUDENT("insert into student (student_id,student_name, student_email, student_password, student_address) values (?,?,?,?,?)");

    private final String query;
}
