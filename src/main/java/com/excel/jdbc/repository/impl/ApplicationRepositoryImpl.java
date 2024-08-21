package com.excel.jdbc.repository.impl;

import com.excel.jdbc.constants.Constants;
import com.excel.jdbc.constants.DatabaseConnection;
import com.excel.jdbc.constants.Queries;
import com.excel.jdbc.entity.Student;
import com.excel.jdbc.repository.ApplicationRepository;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Logger;

@Repository
public class ApplicationRepositoryImpl implements ApplicationRepository {

    Connection connection = null;

    @Override
    public String save(Student student) {
        try{
            connection = DriverManager.getConnection(DatabaseConnection.URL.getConnection(),DatabaseConnection.USER.getConnection(), DatabaseConnection.PWD.getConnection());
            PreparedStatement preparedStatement = connection.prepareStatement(Queries.REGISTER_STUDENT.getQuery());
            preparedStatement.setInt(1,student.getStudentId());
            preparedStatement.setString(2,student.getStudentName());
            preparedStatement.setString(3,student.getStudentEmail());
            preparedStatement.setString(4,student.getStudentPassword());
            preparedStatement.setString(5,student.getStudentAddress());
            preparedStatement.execute();

        } catch (SQLException e){
            Logger.getLogger("Failed to Establish Connection");
        }
        return Constants.SUCCESSFULLY_INSERTED.getConstant();
    }
}
