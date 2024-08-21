package com.excel.jdbc.repository;

import com.excel.jdbc.entity.Student;

public interface ApplicationRepository {
    String save(Student build);

    String update(Student student);
}
