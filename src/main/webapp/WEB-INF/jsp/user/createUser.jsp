<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>

<title>Querysheet by prochala</title>



</head>

<body>
<h2>Tworzenie nowego użytkownika.</h2>
<s:form action="createuser">
	<s:textfield name="forename" label="Imie" />
	<s:textfield name="surename" label="Nazwisko" />
	<s:textfield name="login" label="Login" />
	<s:select list="list"></s:select>
	<s:password name="password" label="Hasło" />
	<s:password name="retypepassword" label="Powtorz hasło" />
	<s:checkbox name="isAdmin" labelposition="top" label="Administrator"> </s:checkbox>
	<s:submit value="Utworz"  />





</s:form>

<s:fielderror></s:fielderror>

</body>
</html>