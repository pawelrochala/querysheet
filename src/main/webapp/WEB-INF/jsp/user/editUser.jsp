<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>

<title>Querysheet by prochala</title>



</head>

<body>

<h2>Formularz edycji użytkownika. </h2>

<s:form action="updateUser">

    <s:hidden name="user.id"></s:hidden>
	<s:textfield name="user.forename" label="Imię" />
	<s:textfield name="user.surename" label="Nazwisko" />
	<s:textfield name="user.login" label="Login" />
	<s:select list="list" name="faculys" value="user.faculty" label="Katedra"></s:select>
	<s:password name="user.password" label="Hasło" />
	<s:checkbox name="user.isAdmin" label="Admin" labelposition="top"></s:checkbox>	
	<s:submit value="Uaktualnij" />	
</s:form>
<s:fielderror></s:fielderror>

</body>
</html>