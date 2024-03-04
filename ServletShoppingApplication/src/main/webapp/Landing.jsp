<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<style>
*{
margin:0;
padding:0;
box-sizing:border-box;
}

.card{
height:80%;

}
.container{
margin-top:6%;

}
.card-img-top{
width:100%;
height:60%;
}
.col-md-3{
z-index:-1;
}


</style>




</head>
<body >
 <%@include file="navbar.jsp"%>

  <div class="container">
    <div class="row">
   <c:forEach  var="product" items="${productList}"> 
   
      <div class="col-md-3">
      <div class="card" style="width: 18rem;">
        <img class="card-img-top" src="${product.getProductImage()}" >
        <div class="card-body ">
          <h5 class="card-title">${product.getProductName()}</h5>
          <h6 class="card-title">${product.getCategory()}</h6>
          <h6 class="card-title">${product.getPrice()}</h6>
          <div class="d-flex justify-content-between">
          <a href="CartSrevlet?id=${product.getId()}" class="btn btn-primary">Add to Cart</a>
          <a href="orderNow?action=landing&id=${product.getId()}" class="btn btn-primary">Buy Now</a>
          </div>
        </div>
      </div>
      </div>               
       </c:forEach>  
    </div>
  </div>

</body>
</html>