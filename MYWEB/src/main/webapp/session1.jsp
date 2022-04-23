<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" session="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<% 
request.setCharacterEncoding("utf-8");
//아이디랑 비번을 받아서~~ 
 String id =request.getParameter("id"); //쿠키네임,//id입력폼에 입력받은것을 파라미타로받아 스트링으로 넣ㅎ음
 String pwd = request.getParameter("pwd"); // 인자로 쿠키네임을 받음 
//서버세션에 저장한다.
session.setAttribute("idKey", id); //폼에서받은 id를 idkey라는값으로 세션객체에 연결 오타
session.setMaxInactiveInterval(60*5); //세션연결후 5분이 지나면 세션연결이 끊김 
//체크된거 서버페이지로 보내지는거 ,아이디키 철자 제대로
%>

<h1>Session example</h1>
<form method="post" action="session1_1.jsp">
1. 가장 좋아하는 계절은? <br/>    
<input type="radio" name="season" value ="봄">봄
<input type="radio" name="season" value ="여름">여름
<input type="radio" name="season" value ="가을">가을
<input type="radio" name="season" value ="겨울">겨울
<br/>
2. 가장 좋아하는 색깔은? <br/>   
<input type="radio" name="color" value ="빨강">빨강
<input type="radio" name="color" value ="파랑">파랑    
<input type="radio" name="color" value ="초록">초록
<input type="radio" name="color" value ="노랑">노랑 <br/>
<input type="submit" value="answer">
</form>

</body>
</html>