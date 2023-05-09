<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>


</head>
<style>
    .head-wrapper {
        width: 100vh;
        margin: 100px auto;
        position: relative;
    }

    .head-wrapper #save-Btn {
        position: absolute;
        right: 50px;
        top: 50px;
    }

    .card-wrapper {
        margin: 200px auto;
        border: 2px solid #000;
        width: 1000px;
        display: flex;
        justify-content: center;
        flex-wrap: wrap;

    }

    .main-box {
        border: 1px solid #000;
        width: 200px;
        height: 200px;
        padding: 20px;
        margin: 50px 10px;
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
    <!--title -->
    <header class="head-wrapper">
        <ol>
            <h1>요것은 테스트용 페이지입니다~</h1>
            <button id="save-Btn" type="button">새글 추가</button>
        </ol>

    </header>

    <!-- end card container -->

    <div class="card-wrapper">
        <c:forEach var="a" items="${allList}">
            <div class="main-box">
                <div id="title">${a.shortTitle}</div>
                <div class="date-count-wrapper">
                    <div id="viewCount">${a.viewCount}</div>
                    <div id="date">${a.date}</div>
                </div>
                <div id="content">${a.shortContent}</div>
            </div>
        </c:forEach>
    </div>

    <script>
        const $save = document.getElementById('save-Btn');
        $save.onclick = function () {
            window.location.href = '/test2/write/'
        }
    </script>

</body>

</html>