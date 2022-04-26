<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
   String id =(String)session.getAttribute("idKey"); //세션값을 폼에서 받아야함
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>로그인페이지</h1>
<%
    if(id !=null) //폼에서 받았을때
    {    
%>
<%=id%>님 반갑습니다.<p/>
<a href='logout.jsp'>logout</a>
<%
}
    else //폼에서 아이디를 못받았을 때
    {    
%>     
<form method="post" action=loginServlet>
id: <input name="id"><br/>
password: <input name="pwd" type="password"><br/>
<input type="submit" value="로그인">
</form>
<%} %>
</body>
</html>