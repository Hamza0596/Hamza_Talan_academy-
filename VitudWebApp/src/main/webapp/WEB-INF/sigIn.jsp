<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

<meta charset="UTF-8">
<title> SignIn</title>
</head>
<body>

 <%@ include file="Header.jsp" %>
 
<div class="container-xl">  
<form method="post" action="/VitudWebApp/SignInController">
<div class="mb-3">
<label for="exampleFormControlInput1" class="form-label">Email :</label>
<input type="email" class="form-control" id="exampleFormControlInput1" placeholder="Past your mail" name="mail">
</div>

 <div class="mb-3">
<label for="exampleFormControlInput1" class="form-label">Password :</label>
<input type="text" class="form-control" id="exampleFormControlInput1" placeholder="Past Your Password" name="password">
</div>

 <input type="submit" class="btn btn-primary"/>
</form>

</div>



  <c:choose>
    <c:when test="${ resultat==true }"><meta http-equiv="refresh" content="0;  http://localhost:8080/VitudWebApp/vintud/announcements" /></c:when>
    <c:when test="${ resultat==false }"> Verifier votre mdp/mail  </c:when>
    <c:otherwise></c:otherwise>
</c:choose>

   
</body>
</html>



