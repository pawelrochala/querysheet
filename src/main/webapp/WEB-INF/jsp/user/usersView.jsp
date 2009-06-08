<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="displaytag" uri="http://displaytag.sf.net"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

</head>
<body>
<s:if test="#session.user.isAdmin">
<h2>List użytkowników systemu.</h2>

<displaytag:table name="users" requestURI="prepareUserView"  >
	<displaytag:column property="forename" sortable="true" title="Imię" />
	<displaytag:column property="surename" sortable="true" title="Nazwisko" />
	<displaytag:column property="login" sortable="true" title="Login" />
    
	<displaytag:column href="prepareEditionUser" titleKey="edycja"
		paramProperty="id" paramId="id">
		<s:text name="Edytuj"></s:text>
	</displaytag:column>
	<displaytag:column href="prepareDeleteUser" titleKey="usun"
		paramProperty="id" paramId="id">

		<s:text name="Usuń"></s:text>
	</displaytag:column>
</displaytag:table>
<a href="prepareCreateUser">Dodaj użytkownika.</a>
</s:if>
</body>
</html>