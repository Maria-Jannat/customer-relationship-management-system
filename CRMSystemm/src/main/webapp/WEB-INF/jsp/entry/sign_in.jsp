

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="resources/assets/css/entry/entryStyle1.css">
        <title>Sign In Page</title>
    </head>
    <body>
        <div class="logo-container">
            <div class="logo-div">
                <div class="logo-m-first">M</div>
                <div class="logo-c-first">C</div>
                <div class="logo-r-first">R</div>
                <div class="logo-m-second">M</div>
            </div>
        </div>
        <div class="sign-in-container">
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
    </body>
</html>
