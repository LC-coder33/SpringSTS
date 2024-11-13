<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>단어입력</title>
</head>
<body>
    <h3>찾으려는 단어를 입력하세요</h3>
    
    <form action="translate" method="GET">
        검색: 
        <input type="text" name="word">
        <input type="submit" value="검색"> 
    </form>

    <br><br>

    <h3>단어를 추가하세요</h3>
    <form action="addword" method="POST">
        영단어: 
        <input type="text" name="english"><br>
        단어뜻:
        <input type="text" name="korean"><br>
        <input type="submit" value="단어추가">
    </form>

    <br>
    <p>
        <strong>${message}</strong> <!-- 단어 추가 후 메시지를 표시 -->
    </p>
</body>
</html>
