<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/jsp/common/header.jsp" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.23/css/jquery.dataTables.css">
        <link rel="stylesheet" href="resources/assets/css/bottom-header/style.css">
        <link rel="stylesheet" href="resources/assets/css/report/lead.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <title>Lead Report</title>
    </head>
    <body>
        <div class="bottom__header">
            <div class="bottom__header__left">
                <h4 class="bottom__header__title">Lead Report</h4>
            </div>
            <div class="bottom__header__right">
                <button class="bottom__header__button__save">•••</button>
                <!--<button class="bottom__header__button__saveAndNew">Save and New</button>-->
                <a href="leadcreate"><button class="bottom__header__button__cancel">Create New</button></a>
            </div>
        </div>

        <div class="lead-report-card">
            <div class="activities">
                <table class="display nowrap cell-border hover" id="myTable">
                    <thead style="background-image: linear-gradient(130deg,#af002d 51.07%,#319197 76.05%,#ff7a18); color: #fff;">
                        <tr>
                            <th scope="col">Check</th>
                            <th scope="col">Name</th>
                            <th scope="col">Job Title</th>
                            <th scope="col">Lead Source</th>
                            <th scope="col">Lead Status</th>
                            <th scope="col">Industry</th>
                            <th scope="col">Company</th>
                            <th scope="col">Annual Revenue</th>
                            <th scope="col">No. Of Employee</th>
                            <th scope="col">Rating</th>
                            <th scope="col">Email</th>
                            <th scope="col">Mobile</th>
                            <th scope="col">Fax</th>
                            <th scope="col">Website</th>
                            <th scope="col">Address</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${map.leadlist}" var="lead">
                            <tr>
                                <td><input type="checkbox"/></td>
                                <td style="background: #af002d; color: #fff;">${lead.leadFirstName} ${lead.leadLastName}</td>
                                <td>${lead.jobTitle}</td>
                                <td>${lead.leadSource}</td>
                                <td>${lead.leadStatus}</td>
                                <td>${lead.leadIndustry}</td>
                                <td>${lead.leadCompany}</td>
                                <td>${lead.leadCompanyAnnualRevenue}</td>
                                <td>${lead.leadCompanyNumberOfEmployees}</td>
                                <td>${lead.leadRating}</td>
                                <td>${lead.leadEmail}</td>
                                <td>${lead.leadMobile}</td>
                                <td>${lead.leadFax}</td>
                                <td>${lead.leadWebsite}</td>
                                <td>${lead.leadCity}, ${lead.leadCountry}</td>
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
