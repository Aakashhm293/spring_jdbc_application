package com.excel.jdbc.constants;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Constants {

    SUCCESSFULLY_INSERTED ("Successfully Inserted"),
    SUCCESSFULLY_DELETED ("Successfully Deleted"),
    REGISTRATION_FAILED ("Registration Failed");

    private final String constant;
}
