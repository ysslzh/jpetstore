package org.csu.petstore.persistence;
import	java.util.List;
import org.csu.petstore.domain.Category;

import java.sql.*;
import java.util.Map;


public class Database {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String CONNECTION = "jdbc:mysql://localhost/petstore?serverTimezone=UTC";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "123456";

    private static Connection connection = null;
    private static PreparedStatement statement = null;

    public static Connection getConnection() throws Exception
    {
        try
        {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(CONNECTION,USERNAME,PASSWORD);
        }
        catch (Exception e)
        {
            throw e;
        }
        return connection;
    }

    public static PreparedStatement getPreparedStatement(String sql) {
        try{
            getConnection();
            statement = connection.prepareStatement(sql);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return statement;
    }
    public static void closeStatement()throws Exception
    {
        statement.close();
    }

    public static void closeConnection() throws Exception
    {
        connection.close();
    }


//    public static void closeStatement(Statement statement)throws Exception
//    {
//        statement.close();
//    }
//    public static void closePreparedStatement(PreparedStatement preparedStatement) throws Exception
//    {
//        preparedStatement.close();
//    }
//    public static void closeResultSet(ResultSet resultSet) throws Exception
//    {
//        resultSet.close();
//    }
//    public static void closeConnection(Connection connection) throws Exception
//    {
//        connection.close();
//    }

}
