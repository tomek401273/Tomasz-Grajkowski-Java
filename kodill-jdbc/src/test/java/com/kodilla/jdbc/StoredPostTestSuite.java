package com.kodilla.jdbc;

import org.junit.Assert;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StoredPostTestSuite {

    @Test
    public void testUpdateVipLevels() throws SQLException {
        // Given
        DbMenager dbMenager = DbMenager.getInstance();
        String sqlUpdate = "UPDATE READERS SET VIP_LEVEL=\"Not set\"";
        Statement statement = dbMenager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);
        // When
        String sqlProcedureCall = "CALL UpdateVipLevels()";
        statement.execute(sqlProcedureCall);
        // Then
        String sqlCheckTable= "SELECT COUNT(*) AS HOW_MANY FROM READERS WHERE VIP_LEVEL=\"Not set\"";
        ResultSet rs = statement.executeQuery(sqlCheckTable);
        int howMany= -1;
        if (rs.next()) {
            howMany= rs.getInt("HOW_MANY");
            System.out.println(howMany);
        }
        Assert.assertEquals(0,howMany);
    }

    @Test
    public void testUpdateBestsellers() throws SQLException {
        // Given
        DbMenager dbMenager = DbMenager.getInstance();
        String sqlUpdate = "UPDATE BOOKS SET BESTSELLER=0";
        Statement statement = dbMenager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);
        // When
        String sqlProdceducreCall = "CALL UpdateBestsellers";
        statement.execute(sqlProdceducreCall);
        //Then
        String sqlCheckTable = "SELECT COUNT(*) AS HOW_MANY FROM BOOKS WHERE BESTSELLER=0";
        ResultSet resultSet = statement.executeQuery(sqlCheckTable);
        int howMany = -1;
        if (resultSet.next()) {
            howMany = resultSet.getInt("HOW_MANY");
            System.out.println("howMany: "+howMany);
        }

        String sqlChechSizeTable ="SELECT COUNT(*) AS SIZE FROM BOOKS";
        ResultSet resultSet2 = statement.executeQuery(sqlChechSizeTable);
        int size=-1;
        if (resultSet2.next()) {
            size= resultSet2.getInt("SIZE");
            System.out.println("size: "+size);
        }

        Assert.assertNotEquals(size, howMany);

    }
}
