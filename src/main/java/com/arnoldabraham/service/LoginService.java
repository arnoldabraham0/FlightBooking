package com.arnoldabraham.service;

import java.sql.SQLException;

public interface LoginService {
  boolean validateUser(String paramString);
  
  boolean checkwithDB(String paramString1, String paramString2) throws SQLException;
}


/* Location:              C:\Users\hp\Desktop\IBS\LaptopData\FlightBooking\!\service\LoginService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */