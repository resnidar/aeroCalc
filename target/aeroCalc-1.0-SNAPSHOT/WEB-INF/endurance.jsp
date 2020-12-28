<%--
  Created by IntelliJ IDEA.
  User: rerem2
  Date: 17/12/2020
  Time: 17:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <meta charset="UTF-8">
    <title>main</title>
</head>
<body>
<div class="jumbotron jumbotron-fluid">
    <div class="container-fluid">
        <h1 class="display-4 text-center">AeroCalc</h1>
    </div>
</div>


<div class="container-fluid">
    <div class="row border">
    </div>



    <!-- debut de la navbar-->




    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <a class="navbar-brand" href="/">AeroCalcul</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
                aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse " id="navbarSupportedContent">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
                       data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        calcul
                    </a>
                    <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                        <a class="dropdown-item" href="porteTheoriqueVor">porté théorique VOR</a>
                        <a class="dropdown-item" href="endurance">endurance</a>
                        <a class="dropdown-item" href="altitudePression">altitude pression</a>
                        <a class="dropdown-item" href="calculVentTravers">Calcul vent travers</a>
                        <a class="dropdown-item" href="TODTemps">TODTemps</a>
                    </div>
                </li>
                <li class="nav-item active">
                    <a class="nav-link" href="#">contact <span class="sr-only">(current)</span></a>
                </li>
            </ul>
            <form class="form-inline my-2 my-lg-0">
                <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
            </form>
        </div>
    </nav>


    <!-- fin de la navbar-->


    <div class="row  align-items, flex-direction: column border">
        <div class="col">
            <form method="post" action="endurance">
                <div class="form-group">
                    <p class="text-center">quantité carburant</p>
                    <input type="number" class="form-control" id="quantiteCarburant" name="quantiteCarburant"
                           aria-describedby="carburant a bord" placeholder="quantité de carburant a bord">
                </div>
                <div class="form-group">
                    <p class="text-center">consommation l/h</p>
                    <input type="number" class="form-control" id="consommationHeure" name="consommationHeure"
                           aria-describedby="consommation par heure" placeholder="consommation en l/h">
                </div>
                <div class="form-group">
                    <p class="text-center">vitesse en noeud</p>
                   <input type="number" class="form-control" id="vitesse" name="vitesse" aria-describedby="vitesse"
                           placeholder="vitesse en noeud">
                </div>

                <button type="submit" class="btn btn-primary">envoyé</button>
            </form>
            <%
                Object carburant = request.getAttribute("tempsCarburantRestant");
                if(carburant != null)
                    out.println(carburant);
            %>
            <p><br></p>
            <%
                Object consommation = request.getAttribute("distanceRestante");
                if (consommation != null)
                    out.println("il reste " + consommation + " NM d'autonomie");
            %>
        </div>
    </div>

</div>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>
