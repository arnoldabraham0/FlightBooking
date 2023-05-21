/*    */ package com.arnoldabraham.dao;
/*    */ 
/*    */ import com.arnoldabraham.dao.LoginDAO;
/*    */ import com.arnoldabraham.db.ConnectionClass;
/*    */ import java.sql.Connection;
/*    */ import java.sql.PreparedStatement;
/*    */ import java.sql.ResultSet;
/*    */ import java.sql.SQLException;
/*    */ 
/*    */ 
/*    */ public class LoginDAOImpl
/*    */   implements LoginDAO
/*    */ {
/*    */   public boolean checkwithDB(String username, String password) throws SQLException {
/* 15 */     ConnectionClass connectionClass = new ConnectionClass();
/* 16 */     Connection connection = connectionClass.getConnection();
/* 17 */     PreparedStatement st = connection.prepareStatement("select * from register where username=? and password=?");
/* 18 */     st.setString(1, username);
/* 19 */     st.setString(2, password);
/* 20 */     ResultSet rs = st.executeQuery();
/*    */     
/* 22 */     if (rs.next())
/*    */     {
/* 24 */       return true;
/*    */     }
/* 26 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\hp\Desktop\IBS\LaptopData\FlightBooking\!\dao\LoginDAOImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */