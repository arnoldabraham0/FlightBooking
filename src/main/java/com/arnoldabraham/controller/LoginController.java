/*    */ package com.arnoldabraham.controller;
/*    */ 
/*    */ import com.arnoldabraham.service.LoginServiceImpl;
/*    */ import java.io.IOException;
/*    */ import java.io.PrintWriter;
/*    */ import java.sql.SQLException;
/*    */ import javax.servlet.RequestDispatcher;
/*    */ import javax.servlet.ServletException;
/*    */ import javax.servlet.ServletRequest;
/*    */ import javax.servlet.ServletResponse;
/*    */ import javax.servlet.http.HttpServlet;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ import javax.servlet.http.HttpSession;
/*    */ 
/*    */ public class LoginController extends HttpServlet {
/*    */   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
/* 18 */     String Username = request.getParameter("username");
/* 19 */     String Password = request.getParameter("password");
/* 20 */     LoginServiceImpl loginSer = new LoginServiceImpl();
/* 21 */     boolean returnValue = loginSer.validateUser(Username);
/* 22 */     if (returnValue) {
/*    */       try {
/* 24 */         boolean value = loginSer.checkwithDB(Username, Password);
/*    */         
/* 26 */         if (value) {
/* 27 */           HttpSession session = request.getSession(true);
/* 28 */           session.setAttribute("username", Username);
/*    */           
/* 30 */           response.sendRedirect("home.jsp");
/*    */         } else {
/*    */           
/* 33 */           PrintWriter p = response.getWriter();
/* 34 */           p.print("Invalid Username or Password");
/* 35 */           response.setContentType("text/html");
/* 36 */           RequestDispatcher d = request.getRequestDispatcher("index.html");
/* 37 */           d.include((ServletRequest)request, (ServletResponse)response);
/*    */         }
/*    */       
/* 40 */       } catch (SQLException e) {
/* 41 */         e.printStackTrace();
/*    */       } 
/*    */     } else {
/*    */       
/* 45 */       PrintWriter p = response.getWriter();
/* 46 */       p.print("Please enter a value");
/* 47 */       response.setContentType("text/html");
/* 48 */       RequestDispatcher d = request.getRequestDispatcher("index.html");
/* 49 */       d.include((ServletRequest)request, (ServletResponse)response);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\hp\Desktop\IBS\LaptopData\FlightBooking\!\controller\LoginController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */