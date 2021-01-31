<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <title>Star Rating</title> 
        <link rel="stylesheet" href="resources/assets/css/service/ratingStyle.css">
    </head>
    <body>
        <div class="header">
            <div class="rating-header-left">
                <a href="signup">
                    <div class="logo-div">
                        <div class="logo-m-first">M</div>
                        <div class="logo-c-first">C</div>
                        <div class="logo-r-first">R</div>
                        <div class="logo-m-second">M</div>
                    </div>
                </a>
            </div>

            <div class="rating-header-right">
                <div class="rating-header-right-content">
                    <p>Have An MCRM Account?</p>
                    <a href="/">Sign In</a>
                </div>
            </div>
        </div>


        <main>
            <div class="main-left">
                <h1><span class="rainbow">•••RATE OUR SERVICES FOR BETTER EXPERIENCE•••</span></h1>
            </div>
            <div class="main-right">
                <div class="center">
                    <form action="/rating-save">
                        <span class="voice"><h2>Voice Service</h2></span>
                        <p>Voice communications is a business resource that can improve internal and external communication, maintain good internal and external relationships, save time and money, and even help earn money</p>
                        <div class="stars">
                            <input type="radio" id="five" name="ratingPoint" value="5">
                            <label for="five"></label>
                            <input type="radio" id="four" name="ratingPoint" value="4">
                            <label for="four"></label>
                            <input type="radio" id="three" name="ratingPoint" value="3">
                            <label for="three"></label>
                            <input type="radio" id="two" name="ratingPoint" value="2">
                            <label for="two"></label>
                            <input type="radio" id="one" name="ratingPoint" value="1">
                            <label for="one"></label>
                            <span class="result"></span>
                        </div>
                        <input type="submit" class="post-button-voice" value="POST" name="voice-rating">
                    </form>
                </div>
            </div>
                
<!--               <div class="center-one">
                    <form action="/rating-save">
                        <span class="voice"><h2>Internet Service</h2></span>
                        <p>Voice communications is a business resource that can improve internal and external communication, maintain good internal and external relationships, save time and money, and even help earn money</p>
                        <div class="stars">
                            <input type="radio" id="five" name="ratingPoint" value="5">
                            <label for="five"></label>
                            <input type="radio" id="four" name="ratingPoint" value="4">
                            <label for="four"></label>
                            <input type="radio" id="three" name="ratingPoint" value="3">
                            <label for="three"></label>
                            <input type="radio" id="two" name="ratingPoint" value="2">
                            <label for="two"></label>
                            <input type="radio" id="one" name="ratingPoint" value="1">
                            <label for="one"></label>
                            <span class="result"></span>
                        </div>
                        <input type="submit" class="post-button-internet" value="POST" name="internet-rating">
                    </form>
                </div>-->
                
                
<!--                  <div class="center-two">
                    <form action="/packages">
                        <span class="voice"><h2>Packages</h2></span>
                        <p>Voice communications is a business resource that can improve internal and external communication, maintain good internal and external relationships, save time and money, and even help earn money</p>
                        <div class="stars">
                            <input type="radio" id="five" name="rate" value="5">
                            <label for="five"></label>
                            <input type="radio" id="four" name="rate" value="4">
                            <label for="four"></label>
                            <input type="radio" id="three" name="rate" value="3">
                            <label for="three"></label>
                            <input type="radio" id="two" name="rate" value="2">
                            <label for="two"></label>
                            <input type="radio" id="one" name="rate" value="1">
                            <label for="one"></label>
                            <span class="result"></span>
                        </div>
                        <input type="submit" class="post-button-package" value="POST">
                    </form>
                </div>
            </div>-->
        </main>



    </body>
</html>
