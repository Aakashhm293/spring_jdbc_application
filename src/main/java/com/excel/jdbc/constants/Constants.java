package com.excel.jdbc.constants;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Constants {

    SUCCESSFULLY_INSERTED ("Successfully Inserted"),
    SUCCESSFULLY_DELETED ("Successfully Deleted"),
    REGISTRATION_FAILED ("Registration Failed"),
    SUCCESSFULLY_UPDATED("Successfully Updated"),
    ALL_RECORDS("All the records present in the database"),

    FAILED_TO_ESTABLISH_CONNECTION("Failed to Establish Connection");

    private final String constant;
}
