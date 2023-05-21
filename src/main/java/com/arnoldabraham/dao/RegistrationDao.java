package com.arnoldabraham.dao;

import com.arnoldabraham.model.RegistrationBean;
import java.sql.SQLException;

public interface RegistrationDao {
  int registerUser(RegistrationBean paramRegistrationBean) throws SQLException;
}


/* Location:              C:\Users\hp\Desktop\IBS\LaptopData\FlightBooking\!\dao\RegistrationDao.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */