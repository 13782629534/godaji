<%--
  Created by IntelliJ IDEA.
  User: 石头
  Date: 2020/2/19
  Time: 17:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="yj" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link href="css/bootstrap.min.css" type="text/css" rel="styleSheet" />
</head>
<body>
${list}
<table class="table table-bordered table-striped table-hover table-condensed" style="width: 600px;" align="center">
    <thead>
    <tr class="success" >
        <th align="center">商品规格ID</th>
        <th align="center">商品规格</th>
        <th align="center">是否删除</th>
        <th align="center">备用字段</th>
        <th align="center">排序</th>
        <th align="center">备注</th>
        <th align="center">操作</th>
    </tr>
    </thead>

    <tbody>
    <yj:forEach items="${list}" var="i">
        <tr align="center">
            <td>${i.warespecid}</td>
            <td>${i.warespec}</td>
            <td>${i.isdelete}</td>
            <td>${i.iscurrent}</td>
            <td>${i.sortnum}</td>
            <td>${i.thenote}</td>
            <td>
                <a href="" class="btn btn-primary btn-xs">修改</a>
                <a href="" class="btn btn-danger btn-xs">添加</a>
            </td>
        </tr>

    </yj:forEach>
</table>


</body>
</html>

<script type="text/javascript" src="js/jquery-1.12.3.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript">

</script>
