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
.price{
margin-top:5%;
}
.table{
margin-top:6%;
}

#txt{
width:25%;
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
<div class="price">
<h2>Total Price: ${totalprice}</h2>
</div>
<table class="table">
  <thead>
    <tr>
      <th scope="col">Name</th>
      <th scope="col">Category</th>
      <th scope="col">Price</th>
      <th scope="col">Buy Now</th>
      <th scope="col" >Product Image</th>
      <th scope="col">Cancel</th>
    </tr>
  </thead>
  <tbody>
   <c:forEach  var="product" items="${Cartlist}"> 
    <tr>
    
      <td>${product.getProductName()}</td>
       <td>${product.getCategory()}</td>
      <td>${product.getPrice()}</td>
       <td id="txt">
       <form action="order-now" method="post">
       <div class="form-group d-flex justify-content-between">
       <a href="quantity-dec-inc?action=inc&id=${product.getId()}" class="btn btn-sm btn-incre">
       <i class="fa-solid fa-square-plus"></i></a>
        <input type="text" name="Quantity" class="form-control" id="Quantity" value="${product.getQuantity()}" readonly>
         <c:if test="${product.getQuantity()>=1 }">  
         <a href="quantity-dec-inc?action=dec&id=${product.getId()}" class="btn btn-sm btn-decre">
         <i class="fa-solid fa-square-minus"></i></a>
         </c:if>
        <a href="orderNow?quantity=${product.getQuantity()}&id=${product.getId()}" class="btn btn-primary">Buy</a>
       </div>
       </form>
       </td>
       <td id="img"><img alt="image" id="image" src="${product.getProductImage()}"></td>
        <td><a href="remove?id=${product.getId()}" class="btn btn-primary">Remove</a></td>
        
    </tr>
      </c:forEach>  
  </tbody>
</table>
</body>
</html>