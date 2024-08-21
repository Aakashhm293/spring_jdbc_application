package com.excel.jdbc.repository.impl;

import com.excel.jdbc.constants.Constants;
import com.excel.jdbc.constants.DatabaseConnection;
import com.excel.jdbc.constants.Queries;
import com.excel.jdbc.entity.Student;
import com.excel.jdbc.repository.ApplicationRepository;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
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
            Logger.getLogger(Constants.FAILED_TO_ESTABLISH_CONNECTION.getConstant());
        }
        return Constants.SUCCESSFULLY_INSERTED.getConstant();
    }

    @Override
    public String update(Student student) {
        try{
            connection = DriverManager.getConnection(DatabaseConnection.URL.getConnection(),DatabaseConnection.USER.getConnection(), DatabaseConnection.PWD.getConnection());
            PreparedStatement preparedStatement = connection.prepareStatement(Queries.UPDATE_STUDENT.getQuery());
            preparedStatement.setString(1,student.getStudentName());
            preparedStatement.setString(2,student.getStudentPassword());
            preparedStatement.setString(3,student.getStudentAddress());
            preparedStatement.setString(4,student.getStudentEmail());
            preparedStatement.execute();
        } catch (SQLException e){
            Logger.getLogger(Constants.FAILED_TO_ESTABLISH_CONNECTION.getConstant());
        }
        return Constants.SUCCESSFULLY_UPDATED.getConstant();
    }

    @Override
    public List<Student> getAllStudentDetails() {
        try{
            connection = DriverManager.getConnection(DatabaseConnection.URL.getConnection(),DatabaseConnection.USER.getConnection(), DatabaseConnection.PWD.getConnection());
            PreparedStatement preparedStatement = connection.prepareStatement(Queries.GET_ALL_STUDENT_DETAILS.getQuery());

            ResultSet resultSet = preparedStatement.executeQuery();

            List<Student> studentList = new ArrayList<>();

            while(resultSet.next()){
                studentList.add(Student.builder()
                        .studentId(resultSet.getInt(1))
                        .studentName(resultSet.getString(2))
                        .studentEmail(resultSet.getString(3))
                        .studentPassword(resultSet.getString(4))
                        .studentAddress(resultSet.getString(5))
                        .build());
            }
            return studentList;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
