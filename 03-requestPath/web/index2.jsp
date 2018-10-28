<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <title>Title</title>
</head>
<body>
hello SomeServlet!<br>
<!-- base标签会自动在当前页面的不已斜杠开头的路径前加上basePath路径，使其变为绝对路径，存在浏览器间的兼容问题 -->
<a href="test/hello.do">我是一个表单提交按钮</a>
</body>
</html>
