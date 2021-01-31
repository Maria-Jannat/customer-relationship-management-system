<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <!--...-->
    <head>
        <meta charset="utf-8">
        <title> Ghost </title>
        <link rel="stylesheet" href="resources/assets/css/entry/signUpStyle1.css">
        <link rel="stylesheet" href="resources/assets/css/entry/dropdownButtonSignUp.css">
        <link rel="Stylesheet" href="css/style.css">
    </head>

    <body>

        <div id="sidebar">
            <div class="logo-container">
                <div class="logo-div">
                    <div class="logo-m-first">M</div>
                    <div class="logo-c-first">C</div>
                    <div class="logo-r-first">R</div>
                    <div class="logo-m-second">M</div>
                </div>
            </div>
            <div class="text-container">
                <p>"The ease and simplicity of the program <br>
                    and the way that the <br>
                    MCRM Team have continued to <br>
                    develop solutions around and <br>
                    integrated with the CRM. We <br>
                    utilize projects for clients and <br>
                    the MCRM meeting for training <br>
                    and presentations. From the <br>
                    mobile device the automated <br>
                    calling and tracking is <br>
                    Fabulous."</p>
            </div>
        </div>
        <div id="rightSideWrapper">
            <header> 
                <div class="sign-up-container-right-header">
                    <div class="header-left"></div>
                    <div class="header-center"></div>
                    <div class="header-right">
                        <div class="header-right-left">
                            <div class="dropdown">
                                <!--<button onclick="myFunction()" class="support-button"><a href="verification-page"></a>Customer Support</button>-->
                                <button class="support-button"><a href="feedverification">Customer Support</a></button>
                                <!--                                <div id="myDropdown" class="dropdown-content">
                                                                    <a href="feedverification">Feedback</a>
                                                                    <a href="remverification">Remonstrance</a>
                                                                    <a href="rating">Rate us</a>
                                                                </div>-->
                            </div>
                        </div>
                        <div class="header-right-right">
                            <p>Have An MCRM Account?</p>
                            <a href="/">Sign In</a>
                        </div>

                    </div>
                </div>
            </header>

            <div class="ContentBox"><!--. poner en minusculas.-->
                <main> 
                    <div class="sign-in-container">
                        <h1>Get started with MCRM</h1>
                        <form>
                            <h5>Full Name</h5>
                            <input type="text" name="name" value="" class="form-control" id="input_name">
                            <h5>E-mail</h5>
                            <input type="email" name="email" value="" class="form-control" id="input_email">
                            <h5>Phone Number</h5>
                            <input type="text" name="phoneNumber" value="" class="form-control" id="input_phone">
                            <h5>Password</h5>
                            <input type="password" name="password" value="" class="form-control" id="input_password">
                            <h5>Select User Role</h5>
                            <select class="form-control-select">
                                <option >--Select--</option>
                                <option >Administrator</option>
                                <option>Standard</option>
                                <option>other
                                </option>
                            </select>
                            <button type="submit" class="sign-in-button" action="home"><a href="home">GET STARTED</a></button>
                        </form>
                    </div> 

                </main>

                <section>
                    Section Content
                </section>

                <footer> 
                    Footer 
                </footer>

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
