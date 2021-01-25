<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/jsp/common/header.jsp" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="resources/assets/css/bottom-header/style.css">
        <link rel="stylesheet" href="resources/assets/css/report/business.css">
        <link rel="stylesheet" href="resources/assets/css/other/breport.css">
        <link rel="stylesheet" href="resources/assets/css/packs/dropdownButton.css">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="bottom__header">
            <div class="bottom__header__left">
                <h4 class="bottom__header__title">Package Report</h4>
            </div>
            <div class="bottom__header__right">
                <button class="bottom__header__button__save">•••</button>

                <!--<a href="packagecreate"><button class="bottom__header__button__cancel">Create New</button></a>-->
                <div class="dropdown">
                    <button onclick="myFunction()" class="bottom__header__button__cancel">Create New</button>
                    <div id="myDropdown" class="dropdown-content">
                        <a href="minpackcreate">Minute</a>
                        <a href="smspackcreate">SMS</a>
                        <a href="gprspackcreate">GPRS</a>
                        <a href="combinedpackcreate">Combined</a>
                    </div>
                </div>
            </div>
        </div>

        <script>
            /* When the user clicks on the button, 
             toggle between hiding and showing the dropdown content */
            function myFunction() {
                document.getElementById("myDropdown").classList.toggle("show");
            }

// Close the dropdown if the user clicks outside of it
            window.onclick = function (event) {
                if (!event.target.matches('.bottom__header__button__cancel')) {
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