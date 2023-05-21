<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Home</title>
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <style>
      body {
        font-family: Arial, Helvetica, sans-serif;
      }
      div {
        border: 3px solid #f1f1f1;
        margin: 100px;
        width: 30%;
        margin-left: 30rem;
      }

      input[type="text"],
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
        width: 100%;
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
  <%
  response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
  
  if(session.getAttribute("username")==null)
  {
	  response.sendRedirect("index.html");
  }
  %>
  
  
  
  
    <h2>Welcome <%= session.getAttribute("username")  %> !!</h2>
    <div class="container">
      <form action="Booking.jsp" method="post">
        <button type="submit">Book a Flight</button>
      </form>
      <br />
      
      <form action="ViewRegistrationController">
        <button type="submit">View Registration Details</button>
      </form>
      
      <form action="ViewBookingController">
        <button type="submit">View Booking Details</button>
      </form>
      <form action="UpdateBooking.jsp" method="post">
        <button type="submit">Update Flight Details</button>
      </form>
      <form action="DeleteBookingController">
        <button type="submit">Delete Booking</button>
      </form>
    </div>

    <div class="container" style="background-color: #f1f1f1">
      <form action="Logout">
        <button type="submit" class="createbtn">Logout</button>
      </form>
    </div>
  </body>
</html>