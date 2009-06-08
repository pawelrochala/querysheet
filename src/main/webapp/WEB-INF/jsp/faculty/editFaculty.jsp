<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>

<title>Querysheet by prochala</title>



</head>

<body>
<s:form action="editUser">
	<s:textfield name="forename" label="Imie" />
	<s:textfield name="surename" label="Nazwisko" />
	<s:textfield name="login" label="Login" />
	<s:select list="list"></s:select>
	<s:password name="password" label="Hasło" />
	<s:password name="retypepassword" label="Powtorz hasło" />

	<s:submit />
	
</s:form>
<s:fielderror></s:fielderror>
Formularz  edycji użytkownika.
</body>
</html>