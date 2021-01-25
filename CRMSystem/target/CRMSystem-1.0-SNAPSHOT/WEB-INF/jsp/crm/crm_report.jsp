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
        <title>JSP Page</title>
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
                <table class="table table-bordered table-striped">
                    <thead>
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
                                <td>${crm.crmFirstName} ${crm.crmLastName}</td>
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
