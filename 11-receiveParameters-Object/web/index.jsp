<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="${pageContext.request.contextPath}/test/register.do" method="post">
    <!-- 整体接收时，要求表单参数名与对象属性名相同 -->
    姓名：<input type="text" name="name"/><br>
    年龄：<input type="text" name="age"/><br>
    学校：<input type="text" name="school.sname"/><br>
    校址：<input type="text" name="school.address"/><br>
    <input type="submit" value="注册"/>
  </form>
  </body>
</html>