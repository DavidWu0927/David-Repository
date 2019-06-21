<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<style type="text/css">
	span{
		color:red;
	}
</style>
</head>
<body>
	<form action="${pageContext.request.contextPath}/student/regist" method="post">
		学号：<input type="text" name="sno"><span>${sno}</span><br/>
		姓名：<input type="text" name="sname"><span>${sname}</span><br/>
		班级：<input type="text" name="cid"><span>${cid}</span><br/>
		成绩：<input type="text" name="sresult"><span>${sresult}</span><br/>
		年龄：<input type="text" name="age"><span>${age}</span><br/>
		地址：<input type="text" name="address"><span>${address}</span><br/>
		生日：<input type="text" name="bornDate"><span>${bornDate}</span><br/>
		邮箱：<input type="text" name="email"><span>${email}</span><br/>
		
		<input type="submit" value="提交">
	
	
	</form>


</body>
</html>