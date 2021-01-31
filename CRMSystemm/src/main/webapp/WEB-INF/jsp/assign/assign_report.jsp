<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/jsp/common/header.jsp" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.23/css/jquery.dataTables.css">
        <link rel="stylesheet" href="resources/assets/css/bottom-header/style.css">
        <link rel="stylesheet" href="resources/assets/css/report/assign.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="bottom__header">
            <div class="bottom__header__left">
                <h4 class="bottom__header__title">Assign Report</h4>
            </div>
            <div class="bottom__header__right">
                <button class="bottom__header__button__save">•••</button>
                <a href="assignLead"><button class="bottom__header__button__saveAndNew">Assign Lead</button></a>
                <a href="assignCRM"><button class="bottom__header__button__cancel">Assign CRM</button></a>
            </div>
        </div>


        <div class="assign-report-card">
            <div class="activities">
                <table class="display nowrap cell-border hover" id="myTable">
                    <thead style="background-image: linear-gradient(130deg,#af002d 51.07%,#319197 76.05%,#ff7a18); color: #fff;">
                        <tr>
                            <th scope="col">Business</th>
                            <th scope="col">Type</th>
                            <th scope="col">Traded As</th>
                            <th scope="col">CRM</th>
                            <th scope="col">Role</th>
                            <th scope="col">Lead</th>
                            <th scope="col">Lead Company</th>
                            <th scope="col">Source</th>
                            <th scope="col">Status</th>
                            <th scope="col">Rating</th>
                            <th scope="col">No. Of Emp</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${map.assignLeads}" var="assignedCRML">
                            <tr>
                                <td>${assignedCRML.businessName}</td>
                                <td>${assignedCRML.type}</td>
                                <td>${assignedCRML.tradedAs}</td>
                                <td>${assignedCRML.crmFirstName} ${assignedCRML.crmLastName}</td>
                                <td>${assignedCRML.role}</td>
                                <td>${assignedCRML.leadFirstName} ${assignedCRML.leadLastName}</td>
                                <td>${assignedCRML.leadCompany}</td>
                                <td>${assignedCRML.leadSource}</td>
                                <td style="background: #319197; color: #fff; font-weight: bold;">${assignedCRML.leadStatus}</td>
                                <td>${assignedCRML.leadRating}</td>
                                <td>${assignedCRML.leadCompanyNumberOfEmployees}</td>
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