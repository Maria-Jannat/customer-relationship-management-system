<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/jsp/common/header.jsp" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.23/css/jquery.dataTables.css">
        <link rel="stylesheet" href="resources/assets/css/bottom-header/style.css">
        <link rel="stylesheet" href="resources/assets/css/report/cm.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <title>Customer Customer Report</title>
    </head>
    <body>
        <div class="bottom__header">
            <div class="bottom__header__left">
                <h4 class="bottom__header__title">Customer Customer Report</h4>
            </div>
            <div class="bottom__header__right">
                <button class="bottom__header__button__save">•••</button>
                <!--<button class="bottom__header__button__saveAndNew">Save and New</button>-->
                <a href="cm-create"><button class="bottom__header__button__cancel">Create New</button></a>
            </div>
        </div>
        <div class="cm-report-card">
            <div class="activities">
                <table class="display nowrap cell-border hover" id="myTable">
                    <thead style="background-image: linear-gradient(130deg,#af002d 51.07%,#319197 76.05%,#ff7a18); color: #fff;">
                        <tr>
                            <th scope="col">CM ID</th>
                            <th scope="col">Name</th>
                            <th scope="col">Role</th>
                            <th scope="col">Profile</th>
                            <th scope="col">Job Location</th>
                            <th scope="col">Email</th>
                            <th scope="col">Mobile</th>
                            <!--<th scope="col">Fax</th>-->
                            <th scope="col">Website</th>
                            <th scope="col">DOB</th>
                            <!--<th scope="col">Address</th>-->
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${map.customerManagersList}" var="cm">
                            <tr>
                                <td>${cm.cmId}</td>
                                <td style="background: #af002d; color: #fff;">${cm.cmFirstName} ${cm.cmLastName}</td>
                                <td>${cm.cmRole}</td>
                                <td>${cm.cmProfile}</td>
                                <td>${cm.cmJobLocation}</td>
                                <td>${cm.cmEmail}</td>
                                <td>${cm.cmMobile}</td>
                                <!--<td>${cm.cmFax}</td>-->
                                <td>${cm.cmWebsite}</td>
                                <td>${cm.cmDateOfBirth}</td>
                                <!--<td>${crm.cmCity}, ${crm.cmCountry}</td>-->
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

    $(document).ready(function () {
        $('#myTable').DataTable();
    });

</script>
