<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

<meta charset="UTF-8">
<title> Déposer une annonce</title>
</head>
<body>
<%@ include file="Header.jsp" %>

<div class="container-xl">
<form method="post" action="/VitudWebApp/vintud/create/announcement">

<div class="mb-3">
<label for="exampleFormControlInput1" class="form-label">Donner le titre de cette annonce :</label>
<input type="text" class="form-control" id="exampleFormControlInput1" placeholder="title" name="title">
</div>
<div class="mb-3">
<label for="exampleFormControlTextarea1" class="form-label">Donner une description pour cette annonce :</label>
<textarea class="form-control" id="exampleFormControlTextarea1" rows="3" name="description"></textarea>
</div>

<label for="categoryId">Choisir la category de votre annonce:</label>
<select class="form-select" aria-label="Default select example" id="categoryId" name="category">
<option selected>Select category</option>
<option value="1">category 1</option>
<option value="2">category 2</option>
<option value="3">category 3</option>

</select> <div class="mb-3">
<label for="exampleFormControlInput1" class="form-label">Donner le prix de cette annonnce :</label>
<input type="number" class="form-control" id="exampleFormControlInput1" placeholder="price" name="price">
</div>
<div class="mb-3">
<label for="exampleFormControlInput1" class="form-label">Donner votre localisation :</label>
<input type="text" class="form-control" id="exampleFormControlInput1" placeholder="localisation " name="localisation">
</div>
 <input type="submit" class="btn btn-primary"/>
 <form>
 
</div>
 
  <c:choose>
    <c:when test="${ id==null }"><meta http-equiv="refresh" content="0;  http://localhost:8080/VitudWebApp/SignInController" /></c:when>
    <c:when test="${ resultat==true }">Votre annonce a bien été enregistrée</c:when>
    <c:when test="${ resultat==false }"> Votre annonce n'a pas pu être ajoutée</c:when>
    <c:otherwise></c:otherwise>
</c:choose>



   
</body>
</html>