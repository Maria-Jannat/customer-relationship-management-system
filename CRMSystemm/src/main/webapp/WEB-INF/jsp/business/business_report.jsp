<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/jsp/common/header.jsp" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.23/css/jquery.dataTables.css">
        <link rel="stylesheet" href="resources/assets/css/bottom-header/style.css">
        <link rel="stylesheet" href="resources/assets/css/report/businessReport.css">
        <link rel="stylesheet" href="resources/assets/css/other/breport.css">
        <title>Business Report</title>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    </head>
    <body>
        <div class="bottom__header">
            <div class="bottom__header__left">
                <h4 class="bottom__header__title">Business Report</h4>
            </div>
            <div class="bottom__header__right">
                <button class="bottom__header__button__save">•••</button>
                <!--<button class="bottom__header__button__saveAndNew">Save and New</button>-->
                <a href="businesscreate"><button class="bottom__header__button__cancel">Create New</button></a>
            </div>
        </div>

        <div class="business-report-card">
            <div class="business">
                <!--<h2>The Task Info</h2>-->
                <table class="display nowrap cell-border hover" id="myTable">
                    <thead style="background-image: linear-gradient(130deg,#af002d 51.07%,#319197 76.05%,#ff7a18); color: #fff;">
                        <tr>
                            <th scope="col">Check</th>
                            <th scope="col">Business</th>
                            <th scope="col">Type</th>
                            <th scope="col">Traded As</th>
                            <th scope="col">Industry</th>
                            <th scope="col">Area Served</th>
                            <th scope="col">key People</th>
                            <th scope="col">Services</th>
                            <th scope="col">Revenue</th>
                            <th scope="col">Num Of Employees</th>
                            <th scope="col">Website</th>
                        </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${map.businessList}" var="business">
                        <tr>
                            <td><input type="checkbox"/></td>
                            <!--<td><a href="businessreport">${business.businessName}</a></td>-->
                            <td style="background: #af002d; color: #fff;">${business.businessName}</td>
                            <td>${business.type}</td>
                            <td>${business.tradedAs}</td>
                            <td>${business.industry}</td>
                            <td>${business.areaServed}</td>
                            <td>${business.keyPeople}</td>
                            <td>${business.services}</td>
                            <td>${business.revenue}</td>
                            <td>${business.businessNumOfEmployees}</td>
                            <td>${business.businessWebsite}</td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
</body>
</html>

<script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.10.23/js/jquery.dataTables.js"></script>
<script>
    $('#myTable').DataTable();
</script>
