<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="resources/assets/css/crm_service/remonstranceStyle.css">
        <title>Remonstrance</title>
    </head>
    <body>
        <header>
            <div class="remonstrance-header">
                <div class="remonstrance-header-left">
                    <a href="signup">
                        <div class="logo-div">
                            <div class="logo-m-first">M</div>
                            <div class="logo-c-first">C</div>
                            <div class="logo-r-first">R</div>
                            <div class="logo-m-second">M</div>
                        </div>
                    </a>
                </div>

                <div class="remonstrance-header-right">
                    <div class="remonstrance-header-right-content">
                        <p>Have An MCRM Account?</p>
                        <a href="/">Sign In</a>
                    </div>
                </div>
            </div>
        </header>

        <main>
            <div class="main-left">
                <div class="main-left-content">
                    <h1><span class="rainbow"> •••WE ARE HERE <br>TO HEAR YOU OUT•••</span></h1>
                </div>
            </div>
            <div class="main-right">
                <div class="main-right-content">
                    <p class="main-right-content-p">Select your remonstrance</p>
                    <form action="">
                        <div>
                            <input type="radio" name="remonstrance">
                            <label>Voice Service Related Remonstrance</label>
                        </div>
                        <div>
                            <input type="radio" name="remonstrance">
                            <label>Package & Charging Related Remonstrance</label>
                        </div>
                        <div>
                            <input type="radio" name="remonstrance">
                            <label>Coverage Area Related Remonstrance</label>
                        </div>
                        <div>
                            <input type="radio" name="remonstrance">
                            <label>Other</label>
                        </div>
                        <div class="button-container">
                            <button class="cancel-button" type="button" value="cancel"><a href="signup">Cancel</a></button>
                            <input class="submit-button" type="submit" value="Submit">
                        </div>
                    </form>
                </div>
            </div>
        </main>
        <a href="rating">Rate us</a>
    </body>
</html>
