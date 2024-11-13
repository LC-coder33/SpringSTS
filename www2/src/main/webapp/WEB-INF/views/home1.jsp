<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sample</title>
    <link rel="stylesheet" href="http://localhost:8080/hom2/resources/css/sample.css">

</head>
<!-- 내비게이션바의 Coat 버튼을 누르면 sample2로 이동 -->
<!-- 내비게이션바의 Coat 버튼을 누르면 sample2로 이동 -->


<script src="https://kit.fontawesome.com/3789e6110d.js" crossorigin="anonymous">
</script>

<body>
    <header id ="header">
        <h1><a href="http://www.naver.com/"
            style="color: inherit; text-decoration-line: none;">Elegant</a></h1>
    </header>
    <aside>
        <table>
            <tr><td>ID</td><td><input type="text"></td></tr>
            <tr><td>PW</td><td><input type="password"></td></tr>
            <tr><td></td><td><input type="button" value="LOGIN" style="padding-left: 66px; padding-right: 66px;"></td></tr>
        </table>
    </aside>
    <nav id="nav">
        <ul>
            <li><a href="suitpage"
                style="text-decoration-line: none; color: inherit;"><span>Suits</span></a></li>
            <li><a href="./sample2.html"
                style="text-decoration-line: none; color: inherit;"><span>Coats</span></a></li>
            <li><a href="https://search.shopping.naver.com/search/all?
                bt=-1&frm=NVSCVUI&query=%EC%85%94%EC%B8%A0"
                style="text-decoration-line: none; color: inherit;"><span>Shirts</span></a></li>
            <li><a href="https://search.shopping.naver.com/search/all?
                bt=-1&frm=NVSCVUI&query=%EB%B0%94%EC%A7%80" style="text-decoration-line: none; color: inherit;"><span>Pants</span></a></li>
            <li><a href="https://search.shopping.naver.com/search/all?
                bt=-1&frm=NVSCVUI&query=%EC%8B%A0%EB%B0%9C" style="text-decoration-line: none; color: inherit;"><span>Shoes</span></a></li>
        </ul>
    </nav>
        <div style="background: url(http://localhost:8080/hom2/resources/image/img-01.jpg) no-repeat; background-size: cover; 
        padding-bottom: 200px; margin-bottom: 30px;" class="slide">
        <h1 style="color: white;">Collection for real gentlemen</h1>
        <p style="color: white;">Lorem ipsum dolor sit amet, consectetur adipiscing elit. <br> 
            In fringilla vestibulum est, sit amet molestie diam rhoncus nec. <br> 
            Donec lobortis odio a dui vulputate lacinia</p>
        <a href="https://m.booking.naver.com/booking/13/bizes/364113/items/
        3455254?area=plt&service-target=map-pc&startDate=2024-10-30">
            <input class="searchbtn" type="button" value="Search Suit Collection"></a>
    </div>

<style>
</style>


    <div>
    <a href="https://suitshop.com/"><div id="clist" style="background: url(http://localhost:8080/hom2/resources/image/img-03.jpg) 0% 0%; background-size: cover; 
    width: 30%; height: 500px;">
        <h4>Suits for Gentlemen</h4>
    </div>
    </a>
    <a href="https://www.thetiebar.com/">
    <div id="clist" style="background: url(http://localhost:8080/hom2/resources/image/img-04.jpg); background-size: cover;
    width: 30%; height:500px; margin-left: 62px;">
    <h4 style="color: black;">Ties for Gentlemen</h4>
    </div>
    </a>
    <a href="https://www.next.co.uk/shop/gender-men-category-shirts/colour-white">
    <div id="clist" style="background: url(http://localhost:8080/hom2/resources/image/img-02.jpg); background-size: cover;
    width: 30%; height:500px; margin-left: 62px;">
    <h4>Shirts for Gentlemen</h4>
    </div>
    </a>
    </div>
    <div id = "google">
    <div><b><span id = "newsletter">NEWSLETTER</span></b><br>
        <span style="margin-left: 30px;">Join to receive promotions and other good News</span>
    </div>
    <input type="text" placeholder="YOUR EMAIL..." id = "email">
    <input type="button" value="SUBSCRIBE" id = "subscribe">
    </div>
    <div id="bfooter">
        <table>
            <tr>
                <td><Strong>About Us</Strong></td><td><b>Contact Us</b></td><td><b>Follow Us</b></td>
            </tr>
            <tr><td><hr></td><td><hr></td><td><hr></td></tr>
            <tr><td>Vero eos et accusamus et iusto dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti
                <br><br> by Human Education Center
            </td>
            <td style="line-height: 2rem;"><b>Human Education Center<br></b>Suwon, Kyeonggido, <br> South Korea <br> 대한민국 </td>
            <td>
                <table>
                    <tr>
                        <td><a href="https://www.facebook.com" style="color: inherit;"><i class="fa-brands fa-facebook" style="font-size: 30px;"></i></a><br><br>facebook</td>
                        <td><a href="https://instagram.com" style="color: inherit;"><i class="fa-brands fa-instagram" style="font-size: 30px;"></i></a><br><br>instagram</td>
                        <td><a href="https://x.com/" style="color: inherit;"><i class="fa-brands fa-twitter" style="font-size: 30px;"></i></a><br><br>twitter</td>                    </tr>
                </table>
                </td>
        </tr>
        </table>

    </div>
    <footer id="footer">
        <p>Copyright 2024 Elegantic. All rights reserved.</p>
    </footer>
</body>
</html>