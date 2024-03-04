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
#shopybody{
  background-image: url("https://img.freepik.com/free-photo/shopping-bag-cart_23-2148879372.jpg");
  background-repeat: no-repeat;
  background-size: cover;
}

.form{
    width: 400px;
    margin-left: 400px;
    margin-top: 100px;
    

}
.form-control{
    border-radius: 3rem;
}
.msg{
  margin-top: 20px;
  text-align: center;
  color: red;
  background-color: beige;
  margin-left: 40%;
  margin-right: 40%;
  border-radius: .6rem;
}




</style>




</head>
<body id="shopybody">
<%@include file="navbar.jsp"%>
   
   
<form class="form " action="./ProductServlet" method="post">                       
  <div class="mb-3">
    <label for="ProductName" class="form-label">Product Name</label>
    <input type="text" name="ProductName" class="form-control" id="ProductName" aria-describedby="textHelp"  required>
  </div>
  <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Category</label>
    <input type="text" name="Category" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" required>
  </div>
  <div class="mb-3">
    <label for="Price" class="form-label">Price</label>
    <input type="number" name="Price" class="form-control" id="Price" required>
  </div>
  <div class="mb-3">
    <label for="ProductImage" class="form-label">Product Image</label>
    <input type="text" name="ProductImage" class="form-control" id="ProductImage"  required>
  </div>
  <button type="submit" class="btn btn-primary">Submit</button>

</form>
</body>
</html>