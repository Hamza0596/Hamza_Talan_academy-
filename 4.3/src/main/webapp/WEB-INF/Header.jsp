<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<nav class="navbar-expand-lg navbar navbar-light mb-5" style="background-color: #e3f2fd;">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Vintud</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
                aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent" >
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="/VitudWebApp/vintud/create/announcement">Déposer une annonce</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="/VitudWebApp/vintud/announcements">Afficher annonces</a>
                </li>
                
                 <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="http://localhost:8080/VitudWebApp/MesAnnonces">Consulter mes annonces</a>
                </li>
                
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="http://localhost:8080/VitudWebApp/modifierMesAnnonce">Modifier mes annonces</a>
                </li>
               
            </ul>
            
            <ul style="color:blue;list-style: none;">
                 <li > Welcome <c:out value="${user_Name}"></c:out></li>
            </ul>
           
        </div>
    </div>    <!-- Navbar content -->
</nav>




</body>
</html>