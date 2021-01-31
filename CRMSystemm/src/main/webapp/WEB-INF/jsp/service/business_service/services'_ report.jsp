<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/jsp/common/header.jsp" />
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.23/css/jquery.dataTables.css">
        <link rel="stylesheet" href="resources/assets/css/bottom-header/style.css">
        <link rel="stylesheet" href="resources/assets/css/service/businessServiceStyle.css">
        <link rel="stylesheet" href="resources/assets/css/packs/dropdownButton.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="bottom__header">
            <div class="bottom__header__left">
                <h4 class="bottom__header__title">Service Report</h4>
            </div>
            <div class="bottom__header__right">
                <button class="bottom__header__button__save">•••</button>

                <!--<a href="packagecreate"><button class="bottom__header__button__cancel">Create New</button></a>-->
                <div class="dropdown">
                    <button onclick="myFunction()" class="bottom__header__button__cancel">Create New</button>
                    <div id="myDropdown" class="dropdown-content">
                        <a href="core-service">Core</a>
                        <a href="vas">VAS</a>
                    </div>
                </div>
            </div>
        </div>



        <div class="business-service-report-card">
            <div class="activities">
                <table class="display nowrap cell-border hover" id="myTable">
                    <thead style="background-image: linear-gradient(130deg,#af002d 51.07%,#319197 76.05%,#ff7a18); color: #fff;">
                        <tr>
                            <th scope="col">Service Code</th>
                            <th scope="col">Service Type</th>
                            <th scope="col">Name</th>
                            <th scope="col">Rate</th>
                            <th scope="col">Service Status </th>
                            <th scope="col">Business Name</th>
                            <th scope="col">Business Type</th>
                            <th scope="col">Description</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${map.businessServicelist}" var="bs">
                            <tr>
                                <td>${bs.serviceCode}</td>
                                <td>${bs.serviceType}</td>
                                <td style="background: #af002d; color: #fff;">${bs.serviceName}</td>
                                <td>${bs.serviceRate}</td>
                                <td>${bs.serviceStatus}</td>
                                <td>${bs.businessName}</td>
                                <td>${bs.type}</td>
                                <td>${bs.serviceDescription}</td>

                            </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>

        <script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.10.23/js/jquery.dataTables.js"></script>
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


                        $('#myTable').DataTable();
        </script>