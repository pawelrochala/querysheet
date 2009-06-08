<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Strona logowania</title>

</head>
<h2>Formularz logowania do systemu wypełniania ankiet.</h2>
<body>
<s:form action="login">
	<s:textfield name="login" label="Username" />
	<s:password name="password" label="Password" />
	<s:submit />
</s:form>



</body>
</html>