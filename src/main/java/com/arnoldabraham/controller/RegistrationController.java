/*    */ package com.arnoldabraham.controller;
/*    */ 
/*    */ import com.arnoldabraham.dao.RegistrationDaoImpl;
/*    */ import com.arnoldabraham.model.RegistrationBean;
/*    */ import java.io.IOException;
/*    */ import java.sql.SQLException;
/*    */ import javax.servlet.ServletException;
/*    */ import javax.servlet.http.HttpServlet;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ 
/*    */ public class RegistrationController
/*    */   extends HttpServlet
/*    */ {
/* 15 */   private RegistrationDaoImpl registrationDao = new RegistrationDaoImpl();
/*    */   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
/* 17 */     String name = request.getParameter("name");
/* 18 */     String username = request.getParameter("username");
/* 19 */     String password = request.getParameter("password");
/* 20 */     String gender = request.getParameter("gender");
/* 21 */     String profession = request.getParameter("profession");
/* 22 */     String phoneno = request.getParameter("phoneno");
/* 23 */     String email = request.getParameter("email");
/* 24 */     String hobbies = request.getParameter("hobbies");
/* 25 */     int walletmoney = Integer.parseInt(request.getParameter("walletmoney"));
/*    */     
/* 27 */     RegistrationBean registrant = new RegistrationBean();
/* 28 */     registrant.setName(name);
/* 29 */     registrant.setUsername(username);
/* 30 */     registrant.setPassword(password);
/* 31 */     registrant.setGender(gender);
/* 32 */     registrant.setProfession(profession);
/* 33 */     registrant.setPhoneno(phoneno);
/* 34 */     registrant.setEmail(email);
/* 35 */     registrant.setHobbies(hobbies);
/* 36 */     registrant.setWalletmoney(walletmoney);
/*    */     
/*    */     try {
/* 39 */       this.registrationDao.registerUser(registrant);
/* 40 */     } catch (SQLException e) {
/*    */       
/* 42 */       e.printStackTrace();
/*    */     } 
/* 44 */     response.sendRedirect("index.html");
/*    */   }
/*    */ }


/* Location:              C:\Users\hp\Desktop\IBS\LaptopData\FlightBooking\!\controller\RegistrationController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */