<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/tld/sitemesh-decorator.tld" prefix="decorator"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css"
	href="/querysheet/styles/main.css" />
<title>Insert title here</title>
</head>
<body>

<div><img src="/querysheet/images/wfii.gif"
	alt="Wydział fizyki i informatyki stosowanej " /></div>
<s:if test="#session.user.isAdmin">
	<div id="bar"><s:a href="prepareUserView">
		<img src="/querysheet/images/user.png" alt="użytkownicy" border="none"
			title="Użytkownicy"></img>
	</s:a> <s:a href="prepareFacultyView">
		<img src="/querysheet/images/faculty.png" alt="katedry" border="none"
			title="Katedry"></img>
	</s:a> <img src="/querysheet/images/list.png" alt="lista ministerstwa"
		title="Lista ministerztwa"></img>
</s:if>
<img src="/querysheet/images/questionary.png" alt="ankiety"
	title="Ankiety"></img>
<img src="/querysheet/images/authors.png" alt="autorzy" title="Autorzy"></img>
<img src="/querysheet/images/publication.png" alt="publikacje"
	title="Publikacje"></img>

<img src="/querysheet/images/password.png" alt="zmiana hasła"
	title="Zmiana hasła"></img>
<img src="/querysheet/images/logout.png" alt="wylogowanie"
	title="Wylogowywanie"></img>

</div>

<s:property value="#session.user.isAdmin" />
<decorator:body></decorator:body>
<br />
<%@ include file="/includes/footer.jsp"%>
<s:debug></s:debug>
</body>
</html>