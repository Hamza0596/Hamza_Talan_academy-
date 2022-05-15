<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Modifier mes annonces</title>
</head>
<body>
<%@ include file="Header.jsp" %> 






<div class="container-xl">
<form method="post" action="/VitudWebApp/modifierMesAnnonces">
  

<div class="mb-3">
<label for="exampleFormControlInput1" class="form-label">Donner un nouveau titre :</label>
<input type="text" class="form-control" id="exampleFormControlInput1" placeholder=<c:out value="${annonce.getTitle() }"/>   name="title">
</div>
<div class="mb-3">
<label for="exampleFormControlTextarea1" class="form-label">Donner une nouvelle description  :</label>
<textarea class="form-control" id="exampleFormControlTextarea1" rows="3" name="description"  placeholder=<c:out value="${annonce.getDescription()}"/>></textarea>
</div>

<label for="categoryId">Choisir la category de votre annonce:</label>
<select class="form-select" aria-label="Default select example" id="categoryId" name="category">
<option selected>Select category</option>
<option value="1">category 1</option>
<option value="2">category 2</option>
<option value="3">category 3</option>

</select> <div class="mb-3">
<label for="exampleFormControlInput1" class="form-label">Donner un nouveau prix  :</label>
<input type="number" class="form-control" id="exampleFormControlInput1" placeholder=<c:out value="${annonce.getPrice() }"/> name="price">
</div>
<div class="mb-3">
<label for="exampleFormControlInput1" class="form-label">Donner une nouvelle localisation :</label>
<input type="text" class="form-control" id="exampleFormControlInput1" placeholder=<c:out value="${annonce.getLocalisation()}"/> name="localisation">
</div>
 <input type="submit" class="btn btn-primary"/>
 <form>
 
   
 
</div>
  <c:choose>
    <c:when test="${id==null}"><meta http-equiv="refresh" content="0;  http://localhost:8080/VitudWebApp/SignInController" /></c:when>
    <c:otherwise></c:otherwise>
</c:choose> 
</body>
</html>