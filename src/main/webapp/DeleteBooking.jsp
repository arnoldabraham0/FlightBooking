<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ page import="java.sql.*"%>
<%@ page import="com.arnoldabraham.db.ConnectionClass"%>  

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 	try {

		String s= (String)session.getAttribute("username");
		ConnectionClass connectionClass = new ConnectionClass();
		Connection connection = connectionClass.getConnection();
		PreparedStatement st = connection.prepareStatement("select * from book where username=?");
		st.setString(1,s);
		ResultSet rs = st.executeQuery();
		String s1="";
		%>
		<%
		if(rs.next()) //If there is a record
		{
			PreparedStatement st1 = connection.prepareStatement("delete from book where username=?");
			st1.setString(1,s);
			st1.executeUpdate();
			response.sendRedirect("home.jsp");
		}
		else{
			s1="No Booking Data Available";
			}
		%>
		<%= s1 %>
		<%
			} catch (Exception e) {
			e.printStackTrace();
			}
			%>

</body>
</html>
