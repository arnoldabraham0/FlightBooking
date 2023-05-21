package com.arnoldabraham.dao;

import java.sql.SQLException;

import com.arnoldabraham.model.BookingBean;

public interface BookingDao {
  int bookUser(BookingBean paramBookingBean) throws SQLException;
}


/* Location:              C:\Users\hp\Desktop\IBS\LaptopData\FlightBooking\!\dao\BookingDao.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */