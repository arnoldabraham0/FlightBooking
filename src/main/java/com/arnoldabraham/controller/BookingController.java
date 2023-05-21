/*    */ package com.arnoldabraham.controller;
/*    */ import java.io.IOException;
/*    */ import java.sql.SQLException;
/*    */ import javax.servlet.ServletException;
/*    */ import javax.servlet.annotation.WebServlet;
/*    */ import javax.servlet.http.HttpServlet;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ import javax.servlet.http.HttpSession;

import com.arnoldabraham.dao.BookingDaoImpl;
import com.arnoldabraham.model.BookingBean;
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
/*    */ @WebServlet({"/BookingController"})
/*    */ public class BookingController
/*    */   extends HttpServlet
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */   
/*    */   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}
/*    */   
/* 32 */   private BookingDaoImpl bookingDAOImpl = new BookingDaoImpl();
/*    */   
/*    */   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
/* 35 */     HttpSession session = request.getSession();
/* 36 */     String us = (String)session.getAttribute("username");
/* 37 */     String passname = request.getParameter("passname");
/* 38 */     String from = request.getParameter("from");
/* 39 */     String to = request.getParameter("to");
/* 40 */     int age = Integer.parseInt(request.getParameter("age"));
/* 41 */     String airline = request.getParameter("airline");
/*    */     
/* 43 */     BookingBean traveller = new BookingBean();
/* 44 */     traveller.setPassname(passname);
/* 45 */     traveller.setUsername(us);
/* 46 */     traveller.setAge(age);
/* 47 */     traveller.setFrom(from);
/* 48 */     traveller.setTo(to);
/* 49 */     traveller.setAirline(airline);
/*    */     
/*    */     try {
/* 52 */       this.bookingDAOImpl.bookUser(traveller);
/* 53 */     } catch (SQLException e) {
/*    */       
/* 55 */       e.printStackTrace();
/*    */     } 
/* 57 */     response.sendRedirect("home.jsp");
/*    */   }
/*    */ }


/* Location:              C:\Users\hp\Desktop\IBS\LaptopData\FlightBooking\!\controller\BookingController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */