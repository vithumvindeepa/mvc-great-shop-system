package db;

import java.sql.*;

public class DbConnection {

    private static DbConnection dbConnection;
    private static Connection connection;

    private static void DbConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/grosury_store", "root", "1234");
    }
    public static DbConnection getInstance() throws SQLException, ClassNotFoundException {
        if(dbConnection == null){
            dbConnection = new DbConnection();
        }
        return dbConnection;
    }

    public Connection getConnection(){
        return this.connection;
    }

}