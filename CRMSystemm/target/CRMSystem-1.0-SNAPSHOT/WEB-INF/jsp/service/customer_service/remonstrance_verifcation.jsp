<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta charset="utf-8">
        <title> Ghost </title>
        <link rel="stylesheet" href="resources/assets/css/crm_service/remonstrance1.css">
        <link rel="stylesheet" href="resources/assets/css/entry/dropdownButtonSignUp.css">
        <!--        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.0.0/jquery.min.js"></script>
        
                 jQuery Modal 
                <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-modal/0.9.1/jquery.modal.min.js"></script>
                <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jquery-modal/0.9.1/jquery.modal.min.css" />-->
    </head>

    <body>

        <div id="sidebar">
            <div class="siderbar-header">
                <a href="signup">
                    <div class="logo-div">
                        <div class="logo-m-first">M</div>
                        <div class="logo-c-first">C</div>
                        <div class="logo-r-first">R</div>
                        <div class="logo-m-second">M</div>
                    </div>
                </a>
            </div>
            <div class="main-left">
                <div class="main-left-content">
                    <h1><span class="rainbow"> •••WE ARE HERE <br>TO HEAR YOU OUT•••</span></h1>
                </div>
            </div>
        </div>
        <div id="rightSideWrapper">
            <header> 
                <div class="sign-up-container-right-header">
                    <div class="header-left">
                        <div class="remonstrance-header-left">

                        </div>
                    </div>
                    <div class="header-center"></div>
                    <div class="header-right">
                        <div class="header-right-left">
<!--                            <div class="dropdown">
                                <button onclick="myFunction()" class="support-button">Customer Support</button>
                                <div id="myDropdown" class="dropdown-content">
                                    <a href="mcrm/customer-service/feedback">Feedback</a>
                                    <a href="remonstrance">Remonstrance</a>
                                </div>
                            </div>-->
                        </div>
                        <div class="header-right-right">
                            <p>Have An MCRM Account?</p>
                            <a href="/">Sign In</a>
                        </div>

                    </div>
                </div>
            </header>

            <div class="ContentBox">
                <main> 
                    <div class="sign-in-container">
                        <h1>To Express Your Remonstrance</h1>
                        <form>
                            <h5 style="justify-content: center">Enter Your Phone Number</h5>
                            <input type="text" name="phoneNumber" value="" class="form-control" id="input_phone">
                            <div class="button-container">
                                <button id="myBtn" class="submit-button"><a href="#">SUBMIT</a></button>
                                <button id="myBtn" class="cancel-button"><a href="signup">CANCEL</a></button>
                            </div>

                            <!--<button id="myBtn" class="sign-in-button"><a href="#ex1" rel="modal:open">SUBMIT</a></button>-->
                        </form>
                    </div> 

                    <!-- The Modal -->
                    <div id="myModal" class="modal">

                        <!-- Modal content -->
                        <div class="modal-content">
                            <span class="close">&times;</span>
                            <p style="font-weight: bold">Your OTP is <span id="otp"></span></p>
                            <br>
                            <button type="button" onclick="generate()" class="sign-in-button"><a href="#">Generate OTP</a></button>
                            <br><br><hr><br>
                            <p style="font-weight: bold">Enter your OTP below</p>
                            <br>
                            <div class="input-div">
                                <input> <input> <input> <input>
                            </div><br>
                            <button class="verify-button"><a href="remonstrance">GO NEXT</a></button>

                        </div>

                    </div>


                </main>

                <!--                <section>
                                    Section
                                </section>
                
                                <footer> 
                                    Footer 
                                </footer>-->

            </div>

        </div>

    </body>




</html>
<script>
    /* When the user clicks on the button, 
     toggle between hiding and showing the dropdown content */
    function myFunction() {
        document.getElementById("myDropdown").classList.toggle("show");
    }

    // Close the dropdown if the user clicks outside of it
    window.onclick = function (event) {
        if (!event.target.matches('.support-button')) {
            var dropdowns = document.getElementsByClassName("dropdown-content");
            var i;
            for (i = 0; i < dropdowns.length; i++) {
                var openDropdown = dropdowns[i];
                if (openDropdown.classList.contains('show')) {
                    openDropdown.classList.remove('show');
                }
            }
        }
    }

    function generate() {
        let num = '1234567890';
        let OTP = '';
        for (let i = 0; i < 4; i++) {
            OTP += num[Math.floor(Math.random() * 10)];
        }
        document.getElementById('otp').innerHTML = OTP;
    }

// Get the modal
    var modal = document.getElementById("myModal");

// Get the button that opens the modal
    var btn = document.getElementById("myBtn");

// Get the <span> element that closes the modal
    var span = document.getElementsByClassName("close")[0];

// When the user clicks the button, open the modal 
    btn.onclick = function () {
        modal.style.display = "block";
    }

// When the user clicks on <span> (x), close the modal
    span.onclick = function () {
        modal.style.display = "none";
    }

// When the user clicks anywhere outside of the modal, close it
    window.onclick = function (event) {
        if (event.target == modal) {
            modal.style.display = "none";
        }
    }

</script>















<!--<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="resources/assets/css/entry/signUpStyle1.css">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="sign-up-container">
            <div class="sign-up-container-left">
                <div class="logo-container">
                    <div class="logo-div">
                        <div class="logo-m-first">M</div>
                        <div class="logo-c-first">C</div>
                        <div class="logo-r-first">R</div>
                        <div class="logo-m-second">M</div>
                    </div>
                </div>
            </div>
            <div class="sign-up-container-right">
                <div class="sign-up-container-right-header">
                    <div class="header-left">left</div>
                    <div class="header-center">center</div>
                    <div class="header-right">
                        <div class="header-right-left">
                            <p>Customer Support</p>
                        </div>
                        <div class="header-right-right">
                        <p>Have An MCRM Account?</p>
                        <a href="/">Sign In</a>
                        </div>
                    
                    </div>
                </div>
                <div class="sign-up-container-right-body">
                    <div class="sign-up-container">
                        <form>
                            <h1>Sign In</h1>
                            <form>
                                <h5>E-mail</h5>
                                <input type="email" name="email" value="" class="form-control" id="input_email">
                                <h5>Password</h5>
                                <input type="password" name="password" value="" class="form-control" id="input_password">
                                <h5>Please Select</h5>
                                <select class="form-control-select">
                                    <option >Administrator</option>
                                    <option>Standard</option>
                                    <option>Other</option>
                                </select>
                                <button type="submit" class="sign-in-button" action="home"><a href="home">Sign in</a></button>
                                <h5 class="soru">Don't Have an Account?</h5>
                                <button type="submit" class="sign-up-button"><a href="signup">Create your MCRM Account</a></button>
                            </form>
                    </div>
                </div>
            </div>
        </div>
        <a href="home">Home</a>
    </body>
</html>-->
