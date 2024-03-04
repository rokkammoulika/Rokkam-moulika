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
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css" rel="stylesheet">
<style>

.table{
margin-top:6%;
}
#image{
width:20%;
border-radius:70%;
}
#img{
width:15%;
}



</style>

</head>


<body>
<%@include file="navbar.jsp"%>

<table class="table">
  <thead>
    <tr>
      <th scope="col">Order Id</th>
      <th scope="col">Product Id</th>
      <th scope="col">Product Name</th>
      <th scope="col">Date</th>
      <th scope="col">Quantity</th>
      <th scope="col">Product Image</th>
    </tr>
  </thead>
  <tbody>
   <c:forEach  var="order" items="${oderslist}"> 
    <tr>
    
      <td>${order.getOrderId()}</td>                
       <td>${order.getId()}</td>
      <td>${order.getProductName()}</td>
      <td>${order.getDate()}</td>
       <td>${order.getQuantity()}</td>
       <td id="img"><img alt="image" id="image"  src="${order.getProductImage()}"></td>
        
    </tr>
      </c:forEach>  
  </tbody>
</table>
</body>
</html>