package com.excel.jdbc.constants;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Queries {

    REGISTER_STUDENT("insert into student (student_id,student_name, student_email, student_password, student_address) values (?,?,?,?,?)"),
    UPDATE_STUDENT("update student set student_name = ? , student_password = ?, student_address = ? where student_email = ?"),
    GET_ALL_STUDENT_DETAILS("select * from student"),
    GET_STUDENT_BY_EMAIL("select * from student where student_email = ?"),
    DELETE_STUDENT_DETAILS("delete from student where student_email = ?");

    private final String query;
}
