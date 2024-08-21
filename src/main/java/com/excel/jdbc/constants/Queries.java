package com.excel.jdbc.constants;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Queries {

    REGISTER_STUDENT("insert into student (student_id,student_name, student_email, student_password, student_address) values (?,?,?,?,?)"),
    UPDATE_STUDENT("update student set student_name = ? , student_password = ?, student_address = ? where student_email = ?");
    private final String query;
}
