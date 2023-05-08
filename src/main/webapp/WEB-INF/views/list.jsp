<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>


</head>
<style>
    .main-box {
        border: 1px solid #000;
        width: 200px;
        height: 200px;
        padding: 20px;
        margin: 200px auto;
    }

    .main-box #title {
        border: 1px solid #000;
        height: 20px;
        margin-bottom: 10px;
    }

    .main-box #viewCount {
        border: 1px solid #000;
        height: 20px;
    }

    .main-box .date-count-wrapper {
        display: flex;
        justify-content: space-around;
    }

    .main-box #date {
        border: 1px solid #000;
        height: 20px;
    }

    .main-box #content {
        margin-top: 10px;
        border: 1px solid #000;
        height: 100px;
    }
</style>

<body>
    <!-- end card container -->


    <c:forEach var="a" items="allList">
        <div class="main-box">
            <div id="title">${a.title}</div>
            <div class="date-count-wrapper">
                <div id="viewCount">${a.viewCount}</div>
                <div id="date">date</div>
            </div>
            <div id="content">${a.content}</div>
        </div>
    </c:forEach>

</body>

</html>