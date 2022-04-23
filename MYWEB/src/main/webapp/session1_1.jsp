<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" session="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
  request.setCharacterEncoding("utf-8");
  String season =request.getParameter("season");
  String color =request.getParameter("color");
  String id =(String)session.getAttribute("idKey"); //객체로 리턴하기에 string에 넣어줘야함
  String sessionID = session.getId(); //세션아이디를 반환함
  int intervalTime = session.getMaxInactiveInterval();
  if (id != null){
%>   <b><%=id%></b>님이 좋아하시는 계절과 색은<p/>
     <%=season %>,<%=color %>입니다<p/>
     세션 ID : <%=sessionID %> <p/>
     세션 유지시간 : <%=intervalTime %>초 <p/>

<% session.invalidate(); 
} else{
	out.println("시간이 너무 경과해 세션정보가 사라졌습니다");
}
	
%>
</body>
</html>