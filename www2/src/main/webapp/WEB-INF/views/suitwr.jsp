<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sample2</title>
    
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<script src="https://kit.fontawesome.com/3789e6110d.js" crossorigin="anonymous"></script>
<style>
@import url('https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,100;0,300;0,400;0,500;0,700;0,900;1,100;1,300;1,400;1,500;1,700;1,900&display=swap');
@import url('https://fonts.googleapis.com/css2?family=Mountains+of+Christmas:wght@400;700&family=Roboto:ital,wght@0,100;0,300;0,400;0,500;0,700;0,900;1,100;1,300;1,400;1,500;1,700;1,900&display=swap');
.roboto-regular {
    font-family: "Roboto", sans-serif;
    font-weight: 400;
    font-style: normal;
}
.mountains-of-christmas-regular {
    font-family: "Mountains of Christmas", serif;
    font-weight: 400;
    font-style: normal;
}
body {
    
}
header {
    font-family: "Mountains of Christmas", serif;
    background: url(http://localhost:8080/hom2/resources/image/snowflake.gif) no-repeat center center;
    background-size: cover;
    height: 150px;
    overflow: hidden;
    display: flex;
    float: left;
    width: 100%;
    justify-content:flex-end;
    align-items:baseline;
    color: white;
    font-style: italic;
}
nav {
    font-family: "Roboto", serif;
}
ul {
    list-style-type: none;
    padding-left: 0px;
    width: 100%;
    overflow: hidden;
    text-align:center;
    border: 1px solid lightcyan;
    justify-content: center;
    align-items: center;
    display: flex;
    background-color: lightskyblue;
}
ul li {
    margin-right: 5px;
}
ul li span {
    font-family: "Mountains of Christmas", serif;
    border: 1px lightcyan;
    border-radius: 3px;
    background-color:lightskyblue;
    display: block;
    border-left: 1px lightcyan solid;
    text-align: center;
    padding: 14px 105px;
    text-decoration: none;
    text-transform: uppercase;
    line-height: 1.2em;
    color: white;
}


.suit-table {
    width: 90%;
    margin: 20px auto;
    border-collapse: collapse;
    font-family: "Roboto", sans-serif;
}

.suit-table th {
    background-color: lightskyblue;
    color: white;
    padding: 12px;
    text-align: center;
    border: 1px solid lightcyan;
}

.suit-table td {
    padding: 10px;
    border: 1px solid lightcyan;
    text-align: center;
}

.suit-table tr:nth-child(even) {
    background-color: #f8f9fa;
}

.suit-table tr:hover {
    background-color: #e9ecef;
}
</style>
<body>
    <header>
        <table>
            <tr><td><h1 style="padding-top: 30px; padding-right: 150px; float: right;">Merry Christmas!</h1></td></tr>
            <tr><td><h3 style="float: right; padding-right: 200px;">We offer you a discount up to 50%!</h3></td></tr>
        </table>
    </header>
    <nav>
        <ul>
            <li><a href="https://m.booking.naver.com/booking/13/bizes/364113/items/3455254?area=plt&service-target=map-pc&startDate=2024-10-30"
                style="text-decoration-line: none; color: inherit;"><span>Suits</span></a></li>
            <li><a href="./sample2.html"
                style="text-decoration-line: none; color: inherit;"><span>Coats</span></a></li>
            <li><a href="https://search.shopping.naver.com/search/all?bt=-1&frm=NVSCVUI&query=%EC%85%94%EC%B8%A0"
                style="text-decoration-line: none; color: inherit;"><span>Shirts</span></a></li>
            <li><a href="https://search.shopping.naver.com/search/all?bt=-1&frm=NVSCVUI&query=%EB%B0%94%EC%A7%80" 
                style="text-decoration-line: none; color: inherit;"><span>Pants</span></a></li>
            <li><a href="https://search.shopping.naver.com/search/all?bt=-1&frm=NVSCVUI&query=%EC%8B%A0%EB%B0%9C" 
                style="text-decoration-line: none; color: inherit;"><span>Shoes</span></a></li>
        </ul>
    </nav>

    <form action="suitadd" method="post" name="suitForm" onsubmit="return validatename()">
    <table class="suit-table">
        <thead>
            <tr>
                <th>수트 코드</th>
                <th>수트 이름</th>
                <th>수트 설명</th>
                <th>재고</th>
                <th>입고 날짜</th>
                <th>추가 여부</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>자동 작성</td>
                <td><input type="text" id="sname" name="suitname"></td>
                <td><input type="text" id="content" name="suitcontent"></td>
                <td><input type="text" id="left" name="suitleft"></td>
                <td>자동 작성</td>
                <td><button type="submit" class="btn btn-primary">추가하기</button></td>
            </tr>
        </tbody>
    </table>
    </form>
    <script type="text/javascript">
    function validatename() {
        var sname = document.getElementById('sname').value;
        if(sname.trim() === "") {
            alert("제품 이름이 입력되지 않았습니다.");
            return false;
        } else {
            alert("제품 등록이 완료되었습니다.");
            return true;
        }
    }
    </script>
</body>
</html>