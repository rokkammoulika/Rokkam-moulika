<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    <%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
<style >

.btn{
margin-left:80%;
}
.buttn{
matgin-top:10%;
margn-left:300px;
}

</style>

</head>
<body>
<table class="table">
  <thead>
    <tr>
      <th scope="col">empno</th>
      <th scope="col">ename</th>
      <th scope="col">job</th>
      <th scope="col">mgr</th>
      <th scope="col">hiredate</th>
      <th scope="col">sal</th>
      <th scope="col">comm</th>
      <th scope="col">deptno</th>
      <th scope="col">Update</th>
      <th scope="col">Delete</th>
      
    </tr>
  </thead>
  <tbody>
     <c:forEach var="emp"  items="${emplist}">
    <tr>
   
      <td>${emp.getEmpno()}</td>
      <td>${emp.getEname()}</td>
      <td>${emp.getJob()}</td>
      <td>${emp.getMgr()}</td>
      <td>${emp.getHiredate()}</td>
      <td>${emp.getSal()}</td>
      <td>${emp.getComm()}</td>
      <td>${emp.getDeptno()}</td>
      <td><a href="" class="btn btn-primary">update</a></td>
      <td><a href="" class="btn btn-primary">delete</a></td>
       
     
    </tr>
     </c:forEach>
  </tbody>
</table>
<div class="buttn">

<a href="index.jsp" class="btn btn-primary">Go Back</a>
</div>


</body>
</html>