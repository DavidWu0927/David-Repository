<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<h1>主页</h1>
	<table  width="80%" border="1px" align="center">
	   		<tr>
	   			<th>学号</th>  
		   		<th>姓名</th>
		   		<th>班级 </th>
		   		<th>成绩</th>
		   		<th>年龄</th>
		   		<th>地址</th>
		   		<th>操作</th>
	   		</tr>
	   		<c:forEach items="${list}" var="stu">
	   			<tr>
		   			<th>${stu.sno}</th>
			   		<th>${stu.sname}</th>
			   		<th>${stu.cid} </th>
			   		<th>${stu.sresult}</th>
			   		<th>${stu.age}</th>
			   		<th>${stu.address}</th>
			   		<th><a href="${pageContext.request.contextPath}/student/delete/${stu.sno}/${stu.sname}">删除</a></th>
	   			</tr>
	   		</c:forEach>
	</table>
	
</body>
</html>