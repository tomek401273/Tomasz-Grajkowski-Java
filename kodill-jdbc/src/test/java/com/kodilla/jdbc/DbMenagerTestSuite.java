package com.kodilla.jdbc;

import org.junit.Assert;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbMenagerTestSuite {
    @Test
    public void testConnect() throws SQLException {
        //Given
        //When
        DbMenager dbMenager = DbMenager.getInstance();
        //Then
        Assert.assertNotNull(dbMenager.getConnection());
    }

    @Test
    public void testSelectUsers() throws SQLException {
        //Given
        DbMenager dbMenager = DbMenager.getInstance();

        //When
        String sqlQuery = "SELECT * FROM USERS;";
        Statement statement = dbMenager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getInt("ID") + " " +
                    rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        Assert.assertEquals(5, counter);
    }

    @Test
    public void testSelectUsersAndPosts() throws SQLException {
        //Given
        DbMenager dbMenager = DbMenager.getInstance();

        //When
        String sqlQQuery =
                "SELECT U.ID, U.FIRSTNAME, U.LASTNAME, COUNT(*)" +
                        " AS POST FROM POSTS P, USERS U WHERE U.ID = " +
                        "P.USER_ID GROUP BY P.USER_ID HAVING COUNT(*) >2;";
        Statement statement = dbMenager.getConnection().createStatement();
        ResultSet resultSet = statement.executeQuery(sqlQQuery);

        //Then
        int counter = 0;
        while (resultSet.next()) {
            System.out.println(resultSet.getInt("ID") + " " +
                    resultSet.getString("FIRSTNAME") + ", " +
                    resultSet.getString("LASTNAME") + ", " +
                    resultSet.getInt("POST"));
            counter++;
        }
        resultSet.close();
        statement.close();
        Assert.assertEquals(2, counter);
    }
}
