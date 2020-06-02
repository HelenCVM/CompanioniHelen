<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@  taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html >

<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<link href="/css/estilos.css" rel="stylesheet" type="text/css" />
</head>
<body style="background-color:powderblue;">
<div class="container col-lg-3">
 <form action="/JPAProyecto/CreacionCuenta" style="padding: 30px;margin-top:20px;">
   <div class="form-group">
     <h1 style="color:black;font-family: verdana;text-align:center;border: 1px solid black;">Realizar Pedido</h1>
    </div>
    
    <div class="form-group">
    <label >Cedula:</label>
    <input class="form-control" type="number" minlength="10" maxlength="10" placeholder="0161489812" name="cedula"  required>
    </div>
    
    <div class="form-group">
    <label >Nombre:</label>
	<input class="form-control" type="text" name="nombre" placeholder="Juan" required pattern="[A-Za-z]+" required>
	</div>
	
	 <div class="form-group">
	<label >Apellido:</label>
    <input class="form-control" type="text" name="apellido" placeholder="Perez" required pattern="[A-Za-z]+" required>
     </div>
     
    <div class="form-group">
    <label >Correo:</label>
    <input class="form-control" type="email" name="correo" placeholder="example@gmail.com" required>
    </div> 
  
   <div class="form-group">
    <label >Contraseña:</label>
    <input class="form-control" type="password" name="contrasena" required>
   </div> 
   
	<input  class="btn btn-info btn-block" type="submit" value="Enviar">

</form>

</div>
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
</body>
</html>