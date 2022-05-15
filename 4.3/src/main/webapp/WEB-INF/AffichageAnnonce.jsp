<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Liste des Annonces</title>
</head>
<body>

<%@ include file="Header.jsp" %> 

<table class="table">

  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">id</th>
      <th scope="col">Title</th>
      <th scope="col">description</th>
      <th scope="col">category_id</th>
      <th scope="col">price</th>
      <th scope="col">picture</th>
      <th scope="col">publication_date</th>
      <th scope="col">is_available</th>
      <th scope="col">view_number</th>
      <th scope="col">localisation</th>
      <th scope="col">user_id</th>
      <th scope="col">Favoris</th>
      
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${ listeannonce }" var="annonce"  varStatus="status" >
   <tr>   
     <c:if test="${annonce.getUser_id() != id}">  
      <th scope="row"><c:out value="${ status.count }" /></th> 
      <td><c:out value="${ annonce.getId()}"/></td>
      <td><c:out value="${annonce.getTitle() }"/></td>
      <td><c:out value="${annonce.getDescription()}"/></td>     
      <td><c:out value="${annonce.getCatégorie()}"/></td>
      <td><c:out value="${annonce.getPrice() }"/></td>
      <td><c:out value="${annonce.getPhoto()}"/></td>   
      <td><c:out value="${annonce.getPublication_Date()}"/></td>
      <td><c:out value="${annonce.getDisponibility_State() }"/></td>
      <td><c:out value="${annonce.getViewNumber()}"/></td> 
      <td><c:out value="${annonce.getLocalisation()}"/></td>
      <td><c:out value="${annonce.getUser_id()}"/></td> 
      <td>
      <form action="/VitudWebApp/Affiche_Annonces" method="get">
      <input type="hidden" name="idAnnonce" value="${annonce.getId()}"/>
      
      <c:if test="${favourdOrNo==true }">
      <button type="button" class="btn btn-success">Success</button>
      </c:if>
      
       <c:if test="${favourdOrNo==false }">
       <button type="button" class="btn btn-danger">Danger</button>
      </c:if>
      
     
      </form>
     </td> 
      
      
      
      </c:if>
    </tr>   
    </c:forEach>     
    
  </tbody>
</table>
   

   
   
  <c:choose>
    <c:when test="${ id==null }"><meta http-equiv="refresh" content="0;  http://localhost:8080/VitudWebApp/SignInController" /></c:when>
    <c:otherwise></c:otherwise>
</c:choose>  




 </body>
</html>