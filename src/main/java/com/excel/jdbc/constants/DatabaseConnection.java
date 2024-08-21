package com.excel.jdbc.constants;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum DatabaseConnection {
    URL("jdbc:mysql://localhost/java_jdbc"),
    USER("root"),
    PWD("Sa123");

    private final String connection;
}
