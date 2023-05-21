/*    */ package com.arnoldabraham.dao;
/*    */ 
/*    */ import com.arnoldabraham.dao.BookingDao;
/*    */ import com.arnoldabraham.db.ConnectionClass;
/*    */ import com.arnoldabraham.model.BookingBean;
/*    */ import java.sql.Connection;
/*    */ import java.sql.PreparedStatement;
/*    */ import java.sql.SQLException;
/*    */ 
/*    */ public class BookingDaoImpl
/*    */   implements BookingDao
/*    */ {
/*    */   public int bookUser(BookingBean traveller) throws SQLException {
/* 14 */     String Insert_user = "INSERT INTO book (passname,username,fromcity,tocity,age,airline) values (?,?,?,?,?,?);";
/*    */     
/* 16 */     int result = 0;
/* 17 */     ConnectionClass connectionClass = new ConnectionClass();
/* 18 */     Connection connection = connectionClass.getConnection();
/* 19 */     PreparedStatement st = connection.prepareStatement(Insert_user);
/* 20 */     st.setString(1, traveller.getPassname());
/* 21 */     st.setString(2, traveller.getUsername());
/* 22 */     st.setString(3, traveller.getFrom());
/* 23 */     st.setString(4, traveller.getTo());
/* 24 */     st.setInt(5, traveller.getAge());
/* 25 */     st.setString(6, traveller.getAirline());
/* 26 */     result = st.executeUpdate();
/* 27 */     return result;
/*    */   }
/*    */ }


/* Location:              C:\Users\hp\Desktop\IBS\LaptopData\FlightBooking\!\dao\BookingDaoImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */