<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    <%@ page isELIgnored = "false" %>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<style>
    body{
       background-color: rgb(206, 129, 154);
    }
form{
margin-top: 5%;
margin-left: 30%;
margin-right: 50%;

}


</style>

</head>
<body>
<c:if test="${user!=null}">
    <form action="./EditServlet" method="post">
       <div class="form-group">
            <label for="empno">Empno:</label>
            <input type="text" name="empno" value="${user.getEmpno()}" class="form-control" id="empno" >
          </div>
        <div class="form-group">
            <label for="ename">Ename:</label>
            <input type="text" name="ename" value="${user.getEname()}" class="form-control" id="ename" >
          </div>
          <div class="form-group">
            <label for="job">Job:</label>
            <input type="text" name="job" value="${user.getJob()}" class="form-control" id="job" >
          </div>
          <div class="form-group">
            <label for="mgr">Mgr:</label>
            <input type="number" name="mgr" value="${user.getMgr()}" class="form-control" id="mgr" >
          </div>
          <div class="form-group">
            <label for="hiredate">Hiredate:</label>
            <input type="text" name="hiredate" value="${user.getHiredate()}" class="form-control" id="hiredate" >
          </div>
          <div class="form-group">
            <label for="sal">Salary:</label>
            <input type="number" name="sal" value="${user.getSal()}" class="form-control" id="sal" >
          </div>
          <div class="form-group">
            <label for="comm">Comm:</label>
            <input type="number" name="comm" value="${user.getComm()}" class="form-control" id="comm" >
          </div>
          <div class="form-group">
            <label for="deptno">Deptno:</label>
            <input type="number" name="deptno" value="${user.getDeptno()}" class="form-control" id="deptno" >
          </div>
        
       
        <button type="submit" class="btn btn-primary">Submit</button>
      </form>
      </c:if>
</body>
</html>