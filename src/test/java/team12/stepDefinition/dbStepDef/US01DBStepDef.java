package team12.stepDefinition.dbStepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.sql.*;

import static org.junit.Assert.assertEquals;

public class US01DBStepDef {

    Connection connection;
    Statement statement;
    ResultSet resultSet;


    @Given("Send query to get guest user by id {string}")
    public void sendQueryToGetGuestUserById(String id) throws SQLException {

        connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management", "select_user", "43w5ijfso");
        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM guest_user WHERE id = "+id+";");
        resultSet.next();

    }


}
