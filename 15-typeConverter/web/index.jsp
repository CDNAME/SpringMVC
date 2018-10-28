<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  ${ex.message}
  <form action="${pageContext.request.contextPath}/test/register.do" method="post">
    <!-- 为了实现填错表单返回重填时，能够显示以前填写的信息，加上value和el表达式 -->
    年龄：<input type="text" name="age" value="${age}"/>${ageErrors}<br>
    生日：<input type="text" name="birthday" value="${birthday}"/>${birthErrors}<br>
    <input type="submit" value="注册"/>
  </form>
  </body>
</html>
