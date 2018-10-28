<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>welcome page</title>
</head>
<body>
<!-- 
    param.age的底层执行的是 request.getParameter("age");它得到的值是类型为String的22
    requestScope.age的底层执行的是 request.getAttribute("age");它得到的值是类型为int的22
 -->
name = ${param.pname}<br>
age = ${param.age} <br>
</body>
</html>
