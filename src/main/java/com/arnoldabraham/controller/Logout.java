/*    */ package com.arnoldabraham.controller;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import javax.servlet.ServletException;
/*    */ import javax.servlet.annotation.WebServlet;
/*    */ import javax.servlet.http.HttpServlet;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ import javax.servlet.http.HttpSession;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @WebServlet({"/Logout"})
/*    */ public class Logout
/*    */   extends HttpServlet
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */   
/*    */   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
/* 31 */     HttpSession session = request.getSession();
/* 32 */     session.removeAttribute("username");
/* 33 */     session.invalidate();
/* 34 */     response.sendRedirect("index.html");
/*    */   }
/*    */   
/*    */   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}
/*    */ }


/* Location:              C:\Users\hp\Desktop\IBS\LaptopData\FlightBooking\!\controller\Logout.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */