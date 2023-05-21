/*    */ package com.arnoldabraham.dao;
/*    */ 
/*    */ import com.arnoldabraham.dao.RegistrationDao;
/*    */ import com.arnoldabraham.db.ConnectionClass;
/*    */ import com.arnoldabraham.model.RegistrationBean;
/*    */ import java.sql.Connection;
/*    */ import java.sql.PreparedStatement;
/*    */ import java.sql.SQLException;
/*    */ 
/*    */ public class RegistrationDaoImpl implements RegistrationDao {
/*    */   public int registerUser(RegistrationBean registrant) throws SQLException {
/* 12 */     String Insert_user = "INSERT INTO register (name,username,password,gender,profession,phoneno,email,hobbies,walletmoney) values (?,?,?,?,?,?,?,?,?);";
/*    */     
/* 14 */     int result = 0;
/* 15 */     ConnectionClass connectionClass = new ConnectionClass();
/* 16 */     Connection connection = connectionClass.getConnection();
/* 17 */     PreparedStatement st = connection.prepareStatement(Insert_user);
/* 18 */     st.setString(1, registrant.getName());
/* 19 */     st.setString(2, registrant.getUsername());
/* 20 */     st.setString(3, registrant.getPassword());
/* 21 */     st.setString(4, registrant.getGender());
/* 22 */     st.setString(5, registrant.getProfession());
/* 23 */     st.setString(6, registrant.getPhoneno());
/* 24 */     st.setString(7, registrant.getEmail());
/* 25 */     st.setString(8, registrant.getHobbies());
/* 26 */     st.setInt(9, registrant.getWalletmoney());
/* 27 */     result = st.executeUpdate();
/*    */     
/* 29 */     return result;
/*    */   }
/*    */ }


/* Location:              C:\Users\hp\Desktop\IBS\LaptopData\FlightBooking\!\dao\RegistrationDaoImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */