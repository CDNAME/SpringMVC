<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <!-- 这个路径出现在jsp页面，所以是前台路径。
       前台路径的参照路径是：当前web服务器的根，即：http://127.0.0.1:8080
       因为绝对路径是 = 参照路径 + 相对路径，所以当前超链接所提交的路径是：
       http://127.0.0.1:8080/hello.do，所以不能正确跳转
      <a href="/hello.do">跳转到welcome页面</a>       
  -->

  <!-- 这个路径出现在jsp页面，所以是前台路径。
       但是这个路径不以斜杠开头，所以其参照路径是当前的访问路径：http://127.0.0.1:8080/springmvc/
       因为绝对路径是 = 参照路径 + 相对路径，所以当前超链接所提交的路径是：
       http://127.0.0.1:8080/springmvc/hello.do
  -->
  <a href="hello.do">跳转到welcome页面</a>
  <br>

  <!--  当多次刷新访问时会出现重复/test的问题 如：http://localhost:8080/springmvc/test/test/hello.do
        参照路径：http://localhost:8080/springmvc/test/
        相对路径：test/hello.do
        <a href="test/hello.do">我是一个表单提交按钮</a><br>
  -->
  
  <!--
      如何解决该问题：加上 /项目名称
      <a href="/springmvc/test/hello.do">我是一个表单提交按钮</a><br>
  -->
  <a href="${pageContext.request.contextPath}/test/hello.do">我是一个表单提交按钮</a><br>

  <a href="servlet">跳转servlet</a>

  <!-- 当前路径是一个前台路径，前台路径的参照路径是：当前web服务器的根，即：http://127.0.0.1:8080
       因为绝对路径是 = 参照路径 + 相对路径，所以当前超链接所提交的路径是：
       http://127.0.0.1:8080/img/2.jpg
       <img src="/img/2.jpg" alt="pics"/>
  -->

  <!-- 当前路径是一个前台路径,但是这个路径不以斜杠开头，
       所以其参照路径是当前的访问路径：http://127.0.0.1:8080/springmvc/
       因为绝对路径是 = 参照路径 + 相对路径，所以当前超链接所提交的路径是：
       http://127.0.0.1:8080/springmvc/img/2.jpg
  -->
  <img src="img/2.jpg" alt="pics"/>
  </body>
</html>
