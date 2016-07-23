package services.DAOImpl;


import services.DAO.DBConnectionDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionDAOSQLImpl implements DBConnectionDAO{

    public DBConnectionDAOSQLImpl() {
    }

    public Connection getConnection() throws SQLException {
       return DriverManager.getConnection("localhost:4000/SQLdb");
    }
}
