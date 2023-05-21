package com.arnoldabraham.dao;

import java.sql.SQLException;

public interface LoginDAO {
  boolean checkwithDB(String paramString1, String paramString2) throws SQLException;
}


/* Location:              C:\Users\hp\Desktop\IBS\LaptopData\FlightBooking\!\dao\LoginDAO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */