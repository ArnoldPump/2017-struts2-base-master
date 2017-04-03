<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!-- indica que se usan tags de struts dentro de este jsp -->
<%@ taglib prefix="s" uri="/struts-tags"%>

<!-- aca empieza el html -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Basic Struts 2 Application - Welcome</title>
</head>
<body>
	<!-- Aca empieza lo que se va a mostrar en la pagina -->
	<h1>ABM</h1>
	<p>
		<!-- este es un link al action "hello" que está definido en el struts.xml -->
		<a href="<s:url action='save'/>">Ejecutar el action (utn.frd.action.PersonaAction -> metodo save)</a>
		Esta regla está definida en el archivo struts.xml
		
	</p>
	<p>
		<!-- este es un link al action "hello" que está definido en el struts.xml -->
		<a href="<s:url action='execute'/>">Ejecutar el action (utn.frd.action.PersonaAction -> metodo execute)</a>
		Esta regla está definida en el archivo struts.xml
		
	</p>
</body>
</html>