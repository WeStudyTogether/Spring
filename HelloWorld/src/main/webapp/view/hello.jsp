<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
    <table border="1">
        <thead>
            <tr>
                <th>序号</th>
                <th>姓名</th>
                <th>年龄</th>
            </tr>
        </thead>
        <c:forEach var="data" items="${ users }" varStatus="loop">
            <tr>
                <td>${ loop.index + 1 }</td>
                <td>${ data.name }</td>
                <td>${ data.age }</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>