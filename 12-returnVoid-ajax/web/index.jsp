<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
    <script type="text/javascript" src="js/jquery-1.9.1.min.js"></script>
    <script type="text/javascript">
        $(function () {
            
            $("#button").click(function () {
                $.ajax({
                   url:"test/myAjax.do",
                   data:{
                       name:"张三",
                       age:23
                   },
                    success:function(data){
                       var json = eval("(" + data + ")");
                       alert(json.name + "  " + json.age);
                }
                });
            });

            $("#button2").click(function() {
                $.ajax({
                    url:"test/myAjax2.do",
                    success:function(data){
                        alert(data);
                    }
                });
            });

            $("#button3").click(function() {
                $.ajax({
                url:"test/myAjax3.do",
                    success:function(data){
                        alert(data.name + "  " + data.age);
                    }
                });
            });

            $("#button4").click(function() {
                $.ajax({
                url:"test/myAjax4.do",
                    success:function(data){
                        alert(data.stu1.name + "  " + data.stu2.age);
                    }
                });
            });

            $("#button5").click(function() {
                $.ajax({
                url:"test/myAjax5.do",
                    success:function(data){
                        $(data).each(function (index) {
                            alert(data[index].name + "  " + data[index].age);
                        });
                    }
                });
            });
            
        });
    </script>
</head>

<body>
<input id="button" type="button" value="提交Ajax请求"/><br>
<input id="button2" type="button" value="提交Ajax请求2"/><br>
<input id="button3" type="button" value="提交Ajax请求3"/><br>
<input id="button4" type="button" value="提交Ajax请求4"/><br>
<input id="button5" type="button" value="提交Ajax请求5"/><br>
</body>
</html>
