<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Update Booking</title>
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <style>
      body {
        font-family: Arial, Helvetica, sans-serif;
      }
      form {
        border: 3px solid #f1f1f1;
        margin: 100px;
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
  
  <%
  response.setHeader("Cache-Control","no-cache,no-store,must-revalidate"); %>
  
  
    <h2>Update Flight Booking</h2>

    <form action="UpdateBookingController" method="post">
      <div class="container">

        <label for="from"><b>From</b></label>
        <select name="from">
          <option value="Kochi">Kochi</option>
          <option value="Banglore">Banglore</option></select
        ><br />

        <label for="to"><b>To</b></label>
        <select name="to">
          <option value="Dublin">Dublin</option>
          <option value="Berlin">Berlin</option></select
        ><br />


        <label for="airline"><b>Airline</b></label>
        <select name="airline">
          <option value="Indigo">Indigo</option>
          <option value="Air India">Air India</option></select
        ><br />

        <button type="submit">Update Flight</button>
      </div>
    </form>

    <div class="container" style="background-color: #f1f1f1">
      <form action="home.jsp">
        <button type="submit" class="createbtn">Back to Home</button>
      </form>
    </div>
  </body>
</html>