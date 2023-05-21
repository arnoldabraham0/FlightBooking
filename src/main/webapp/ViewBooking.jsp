<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="java.sql.*"%>    
<%@ page import="com.arnoldabraham.db.ConnectionClass"%>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Booking Details</title>
<meta name="viewport" content="width=device-width, initial-scale=1" />
<style>
  body {
    font-family: Arial, Helvetica, sans-serif;
  }
  form {
    border: 3px solid #f1f1f1;
    margin: 100px;
  }

  select,
  input[type="password"] {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
  }
  h2 {
    text-align: center;
  }
  button {
    background-color: #04aa6d;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    align-items: center;
    width: 50%;
  }

  button:hover {
    opacity: 0.8;
  }

  .createbtn {
    width: auto;
    padding: 10px 18px;
    background-color: #f44336;
  }

  .container {
    padding: 16px;
  }

  /* Change styles for span and cancel button on extra small screens */
  @media screen and (max-width: 300px) {
    span.psw {
      display: block;
      float: none;
    }
    .createbtn {
      width: 100%;
    }
  }
</style>
</head>
<body>
    <form>
      <div class="container">
<% 	try {

		String s= (String)session.getAttribute("username");
		System.out.println(s);
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
			s1="Passenger Name :"+rs.getString("passname")+" | Age :"+rs.getString("age")+"  | From :"+rs.getString("fromcity")+"  |  To :"+rs.getString("tocity")+"  |  Air Line :"+rs.getString("airline");
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
</div>
    </form>

    <div class="container" style="background-color: #f1f1f1">
      <form action="home.jsp">
        <button type="submit" class="createbtn">Back to Home</button>
      </form>
    </div>
</body>
</html>
