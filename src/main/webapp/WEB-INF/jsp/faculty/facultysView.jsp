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

<h2>Lista katedr</h2>
<displaytag:table name="list">
	<displaytag:column property="name" sortable="true" title="Nazwa" />
	
	<displaytag:column href="prepareEditionFaculty" titleKey="edycja"
		paramProperty="id" paramId="id">
		<s:text name="Edytuj"></s:text>
	</displaytag:column>
	<displaytag:column href="prepareDeleteFaculty" titleKey="usun" paramProperty="id"
		paramId="id">
		<s:text name="Usuń"></s:text>
	</displaytag:column>
</displaytag:table>
<a href="addFaculty">Dodaj katedrę. </a>
</body>
</html>