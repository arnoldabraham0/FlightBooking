/*    */ package com.arnoldabraham.dao;
/*    */ 
/*    */ import com.arnoldabraham.dao.UpdateBookingDao;
/*    */ import com.arnoldabraham.db.ConnectionClass;
/*    */ import com.arnoldabraham.model.BookingBean;
/*    */ import java.sql.Connection;
/*    */ import java.sql.PreparedStatement;
/*    */ import java.sql.SQLException;
/*    */ 
/*    */ public class UpdateBookingDaoImpl
/*    */   implements UpdateBookingDao
/*    */ {
/*    */   public int updateBook(BookingBean traveller) throws SQLException {
/* 14 */     String Insert_user = "UPDATE book SET fromcity=?,tocity=?,airline=? WHERE username=?;";
/*    */     
/* 16 */     int result = 0;
/* 17 */     ConnectionClass connectionClass = new ConnectionClass();
/* 18 */     Connection connection = connectionClass.getConnection();
/* 19 */     PreparedStatement st = connection.prepareStatement(Insert_user);
/* 20 */     st.setString(1, traveller.getFrom());
/* 21 */     st.setString(2, traveller.getTo());
/* 22 */     st.setString(3, traveller.getAirline());
/* 23 */     st.setString(4, traveller.getUsername());
/* 24 */     result = st.executeUpdate();
/* 25 */     return result;
/*    */   }
/*    */ }


/* Location:              C:\Users\hp\Desktop\IBS\LaptopData\FlightBooking\!\dao\UpdateBookingDaoImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */