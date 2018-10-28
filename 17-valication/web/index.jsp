<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="${pageContext.request.contextPath}/test/register.do" method="post">
    姓名：<input type="text" name="name"/>${nameErrorMSG}<br>
    分数：<input type="text" name="score"/>${scoreErrorMSG}<br>
    电话：<input type="text" name="mobile"/>${mobileErrorMSG}<br>
    <input type="submit" value="注册"/>
  </form>
  <hr>
  
  <form action="${pageContext.request.contextPath}/test/upload.do" method="post" enctype="multipart/form-data">
    文件：<input type="file" name="img"/><br>
    <input type="submit" value="上传"/>
  </form>
  <hr>
  
  <form action="${pageContext.request.contextPath}/test/uploadmulti.do" method="post" enctype="multipart/form-data">
    文件1：<input type="file" name="imgs"/><br>
    文件2：<input type="file" name="imgs"/><br>
    文件3：<input type="file" name="imgs"/><br>
    <input type="submit" value="上传"/>
  </form>
  </body>
</html>
