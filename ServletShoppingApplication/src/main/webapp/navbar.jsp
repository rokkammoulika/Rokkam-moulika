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

.navbar{
position:fixed;
top:1px;
margin:2px;
width:100%

}
#nav{
background-color: tomato;
  border-radius: 3.5px;
}
.nav-link{
  transition: all .3s;
}
.nav-link:hover{
  background-color: rgb(240, 175, 165);
  border-radius: .6rem;
  font-size: 1.2rem;
 
}
#text{
background-color:rgb(53, 205, 39);
border-radius:70%;
}
</style>
</head>
<body >
    <div>
    <nav class="navbar navbar-expand-lg navbar-light  " id="nav">
        <div class="container-fluid ">
          <a class="navbar-brand text-light" href="#">SSD Ecom</a>
          <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
          <div class="collapse navbar-collapse " id="navbarNav">
            <ul class="navbar-nav ms-auto ">
            <c:if test="${user!=null}">  
              <li class="nav-item">
                <a class="nav-link text-light active" aria-current="page" href="./ProductList">Home</a>
              </li>
              <li class="nav-item">
                <a class="nav-link text-light" href="product.jsp">Products</a>
              </li>
              <li class="nav-item " id="cart">
                <a class="nav-link text-light" href="./Cartlist"><span>${oldCartList.size()}</span>Cart</a>
              </li>
                <li class="nav-item">
                <a class="nav-link text-light" href="./orderList">Orders</a>
              </li>
            
               <li class="nav-item">
                <span id="text"><c:out value="${user.getName()}"/></span>
              </li>  
                <li class="nav-item">
                <a class="nav-link text-light" href="./logout">Logout</a>
              </li>
                 </c:if> 
                 
              <c:if test="${user==null}">  
              <li class="nav-item">
                <a class="nav-link text-light" href="./signup">Signup</a>
              </li>
              <li class="nav-item">
                <a class="nav-link text-light" href="./login">Login</a>
              </li>
              </c:if>                 
            </ul>                      
  
          </div>
        </div>
      </nav>
   </div>
</body>
</html>