/*    */ package com.arnoldabraham.controller;
/*    */ 
/*    */ import com.arnoldabraham.dao.UpdateBookingDaoImpl;
/*    */ import com.arnoldabraham.model.BookingBean;
/*    */ import java.io.IOException;
/*    */ import java.sql.SQLException;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @WebServlet({"/UpdateBookingController"})
/*    */ public class UpdateBookingController
/*    */   extends HttpServlet
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */   
/*    */   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}
/*    */   
/* 40 */   UpdateBookingDaoImpl updateBookingDAOImpl = new UpdateBookingDaoImpl();
/*    */   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
/* 42 */     HttpSession session = request.getSession();
/* 43 */     String us = (String)session.getAttribute("username");
/* 44 */     String from = request.getParameter("from");
/* 45 */     String to = request.getParameter("to");
/* 46 */     String airline = request.getParameter("airline");
/*    */     
/* 48 */     BookingBean traveller = new BookingBean();
/*    */     
/* 50 */     traveller.setUsername(us);
/* 51 */     traveller.setFrom(from);
/* 52 */     traveller.setTo(to);
/* 53 */     traveller.setAirline(airline);
/*    */     
/*    */     try {
/* 56 */       this.updateBookingDAOImpl.updateBook(traveller);
/* 57 */     } catch (SQLException e) {
/*    */       
/* 59 */       e.printStackTrace();
/*    */     } 
/*    */     
/* 62 */     response.sendRedirect("home.jsp");
/*    */   }
/*    */ }


/* Location:              C:\Users\hp\Desktop\IBS\LaptopData\FlightBooking\!\controller\UpdateBookingController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */