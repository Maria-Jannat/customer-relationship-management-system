<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/jsp/common/header.jsp" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.23/css/jquery.dataTables.css">
        <link rel="stylesheet" href="resources/assets/css/bottom-header/style.css">
        <link rel="stylesheet" href="resources/assets/css/report/crm.css">
        <title>CRM Report</title>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    </head>
    <body>
        <div class="bottom__header">
            <div class="bottom__header__left">
                <h4 class="bottom__header__title">CRM Report</h4>
            </div>
            <div class="bottom__header__right">
                <button class="bottom__header__button__save">•••</button>
                <!--<button class="bottom__header__button__saveAndNew">Save and New</button>-->
                <a href="crmusercreate"><button class="bottom__header__button__cancel">Create New</button></a>
            </div>
        </div>
        <div class="crm-report-card">
            <div class="activities">
                 <table class="display nowrap cell-border hover" id="myTable">
                    <thead style="background-image: linear-gradient(130deg,#af002d 51.07%,#319197 76.05%,#ff7a18); color: #fff;">
                        <tr>
                            <th scope="col">CRM Id</th>
                            <th scope="col">Name</th>
                            <th scope="col">Role</th>
                            <th scope="col">profile</th>
                            <th scope="col">Email</th>
                            <th scope="col">Mobile</th>
                            <th scope="col">Fax</th>
                            <th scope="col">Website</th>
                            <th scope="col">Date of Birth</th>
                            <th scope="col">Address</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${map.crmlist}" var="crm">
                            <tr>
                                <td>${crm.crmId}</td>
                                <td style="background: #af002d; color: #fff;">${crm.crmFirstName} ${crm.crmLastName}</td>
                                <td>${crm.role}</td>
                                <td>${crm.profile}</td>
                                <td>${crm.crmEmail}</td>
                                <td>${crm.crmMobile}</td>
                                <td>${crm.crmFax}</td>
                                <td>${crm.crmWebsite}</td>
                                <td>${crm.dateOfBirth}</td>
                                <td>${crm.crmCity}, ${crm.crmCountry}</td>
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
