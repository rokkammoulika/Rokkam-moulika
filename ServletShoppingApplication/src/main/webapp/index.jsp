<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored = "false" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<style>
#shopybody{
  background-image: url("https://img.freepik.com/free-photo/shopping-bag-cart_23-2148879372.jpg");
  background-repeat: no-repeat;
  background-size: cover;
}

.form{
  text-align: center;
border: .3rem solid rgb(241, 165, 151);
  margin-top: 200px;
  margin-left: 400px;
  margin-right: 700px;
  display: flex;
  justify-content: space-between;
 padding: 5rem;
 border-radius: 2rem;
 border: none;
  
}
.btn{
font-size: 1rem;
  background-color: skyblue;
  color: black;
  border-radius: .5rem;
  transition: all .6s;
  border: none;
  padding: .5rem;
}

.btn:hover{
background-color: rgb(22, 89, 116);
font-size: 1.2rem;
color: white;
}
#tag{
  height: 50px;
  width: 100px;
}
</style>
</head>
<body id="shopybody">

<%@include file="navbar.jsp"%>
   
   <div class="form">
    <a href="./login" ><button type="button" class="btn btn-primary" id="tag">Login</button></a>
      <a href="./signup" ><button type="button" class="btn btn-primary" id="tag">Signup</button></a>
    </div>
</body>
</html>
