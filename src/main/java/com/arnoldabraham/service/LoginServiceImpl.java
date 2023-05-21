/*    */ package com.arnoldabraham.service;
/*    */ 
/*    */ import com.arnoldabraham.dao.LoginDAOImpl;
/*    */ import com.arnoldabraham.service.LoginService;
/*    */ import java.sql.SQLException;
/*    */ 
/*    */ public class LoginServiceImpl
/*    */   implements LoginService
/*    */ {
/*    */   public boolean validateUser(String username) {
/* 11 */     if (username.equals("")) {
/* 12 */       return false;
/*    */     }
/*    */     
/* 15 */     return true;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean checkwithDB(String username, String password) throws SQLException {
/* 21 */     LoginDAOImpl loginD = new LoginDAOImpl();
/* 22 */     boolean returnval = loginD.checkwithDB(username, password);
/* 23 */     return returnval;
/*    */   }
/*    */ }


/* Location:              C:\Users\hp\Desktop\IBS\LaptopData\FlightBooking\!\service\LoginServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */