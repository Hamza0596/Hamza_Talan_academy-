<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>signUp</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body>

 <%@ include file="Header.jsp" %>
 <h1 >signUp</h1>
<div class="container-xl">  
<form method="post" action="/VitudWebApp/signUp">
<div class="mb-3">
<label for="exampleFormControlInput1" class="form-label">First name:</label>
<input type="text" class="form-control" id="exampleFormControlInput1" placeholder="Past name" name="first name">
</div>

<div class="mb-3">
<label for="exampleFormControlInput2" class="form-label">Last name</label>
<input type="text" class="form-control" id="exampleFormControlInput2" placeholder="Past your last name" name="last name">
</div>

<div class="mb-3">
<label for="exampleFormControlInput3" class="form-label">Pseudo</label>
<input type="text" class="form-control" id="exampleFormControlInput3" placeholder="Past your pseudo" name="pseudo">
</div>

<div class="mb-3">
<label for="exampleFormControlInput4" class="form-label">Email :</label>
<input type="email" class="form-control" id="exampleFormControlInput4" placeholder="Past your mail" name="mail">
</div>


 <div class="mb-3">
<label for="exampleFormControlInput5" class="form-label">Password :</label>
<input type="text" class="form-control" id="exampleFormControlInput5" placeholder="Past Your Password" name="password">
</div>

 <div class="mb-3">
<label for="exampleFormControlInput6" class="form-label">Phone_Number :</label>
<input type="number" class="form-control" id="exampleFormControlInput6" placeholder="Past Your phone number" name="phone">
</div>

 <input type="submit" class="btn btn-primary"/>
</form>

  <c:choose>
    <c:when test="${ resultat==true }">Compte ajouté avec succé <meta http-equiv="refresh" content="0; url=http://localhost:8080/VitudWebApp/SignInController" />
     </c:when>
    <c:when test="${ resultat==false }"> email/phone Number is already exist</c:when>
    <c:otherwise></c:otherwise>
</c:choose>

</div>





</body>
</html>