<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>

<title>Querysheet by prochala</title>



</head>
<h2>Tworzenie katedry</h2>
<body>
<s:form action="createFaculty">
	<s:textfield name="name" label="Nazwa katedry" />
	<s:submit />

</s:form>

<s:fielderror></s:fielderror>

</body>
</html>