package com.arnoldabraham.db; 
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;
import org.postgresql.Driver;


public class ConnectionClass
{
  public Connection getConnection() throws SQLException {
     Driver driver = new Driver();
     Properties properties = new Properties();
     properties.put("user", "postgres");
     properties.put("password", "root");
     String url = "jdbc:postgresql://localhost:5432/userdata";
     Connection connection = driver.connect(url, properties);
     return connection;
  }
}


/* Location:              C:\Users\hp\Desktop\IBS\LaptopData\FlightBooking\!\db\ConnectionClass.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */