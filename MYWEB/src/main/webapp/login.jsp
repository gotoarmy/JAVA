<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
   String id =(String)session.getAttribute("idKey"); //���ǰ��� ������ �޾ƾ���
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>�α���������</h1>
<%
    if(id !=null) //������ �޾�����
    {    
%>
<%=id%>�� �ݰ����ϴ�.<p/>
<a href='logout.jsp'>logout</a>
<%
}
    else //������ ���̵� ���޾��� ��
    {    
%>     
<form method="post" action=loginServlet>
id: <input name="id"><br/>
password: <input name="pwd" type="password"><br/>
<input type="submit" value="�α���">
</form>
<%} %>
</body>
</html>