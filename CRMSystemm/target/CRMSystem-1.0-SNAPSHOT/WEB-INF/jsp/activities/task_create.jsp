<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/jsp/common/header.jsp" />
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="resources/assets/css/bottom-header/style.css">
        <link rel="stylesheet" href="resources/assets/css/task/taskStyle.css">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="/taskSave" method="post">
            <div class="task-image">


                <!--Header-->

                <div class="bottom__header">
                    <div class="bottom__header__left">
                        <h4 class="bottom__header__title">Create Task</h4>
                    </div>
                    <div class="bottom__header__right">
                        <a href="activitiesview"><input type="submit" class="bottom__header__button__save" value="Save"/></a>  
                        <button class="bottom__header__button__saveAndNew">Save and New</button>
                        <a href="activitiesview"><input type="button" class="bottom__header__button__cancel" value="Cancel"></a>                    
                    </div>
                </div>
                <!--Header End-->


                <div id="task-create-body">

                    <table class="task-table">
                        <tr>
                            <td>
                                <label class="field-label">Task Owner</label>
                            </td>
                            <td>
                                <select id="selectCRM" class="form-control-select">
                                    <c:forEach items="${map.crmlist}" var="crm">
                                        <option value="${crm.id}">${crm.crmFirstName} ${crm.crmLastName}</option>
                                    </c:forEach>
                                </select>
                            </td>
                        </tr>

                        <input type="hidden"  name="crmFirstName" id="crmFirstName"/>
                        <input type="hidden"  name="crmLastName" id="crmLastName"/>
                        <input type="hidden"  name="leadFirstName" id="leadFirstName"/>
                        <input type="hidden"  name="leadLastName" id="leadLastName"/>

                        <tr>
                            <td>
                                <label class="field-label">Subject</label>
                            </td>
                            <td>
                                <select class="form-control-select" name="taskSubject" id="taskSubject">
                                    <option>Email</option>
                                    <option>Call</option>
                                    <option>Meeting</option>
                                    <option>Send Letter</option>
                                </select>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label class="field-label">Due Date</label>
                            </td>
                            <td>
                                <input type="date" class="form-control" name="taskDueDate" id="taskDueDate"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label class="field-label">Related Person</label>
                            </td>

                            <td>
                                <select id="selectLead" class="form-control-select">
                                    <c:forEach items="${map.leadlist}" var="lead">
                                        <option value="${lead.id}">${lead.leadFirstName} ${lead.leadLastName}</option>
                                    </c:forEach>
                                </select>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label class="field-label">Status</label>
                            </td>
                            <td>
                                <select class="form-control-select" name="taskStatus" id="taskStatus">
                                    <option>Not Started</option>
                                    <option>Deferred</option>
                                    <option>In Progress</option>
                                    <option>Completed</option>
                                    <option>Waiting for input</option>
                                </select>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label class="field-label">Priority</label>
                            </td>
                            <td>
                                <select class="form-control-select" name="taskPriority" id="taskPriority">
                                    <option>High</option>
                                    <option>Highest</option>
                                    <option>Low</option>
                                    <option>Lowest</option>
                                    <option>Normal</option>
                                </select>
                            </td>
                        </tr>
                        <tr>
                            <td>
                            </td>
                            <td>
                                <textarea type="textarea" name="taskDescription" id="taskDescription" class="form-control" placeholder="Description..."></textarea>
                            </td>
                        </tr>
                    </table>
                </div>
            </div>
        </form>

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script>
            getCRM();
            getLeads();
            $("#selectCRM").change(function () {
                //getCRM();
                getBusinessByCRM();
            });

            $("#selectLead").change(function () {
                getLeads();
            });

            function getLeads() {
                $.ajax({
                    url: 'getLead/' + $("#selectLead :selected").val(),
                    type: 'GET',
                    dataType: 'json',
                    success: function (data) {
                        //$("#id").val(data.id);
                        $("#leadFirstName").val(data.leadFirstName);
                        $("#leadLastName").val(data.leadLastName);
                        $("#jobTitle").val(data.jobTitle);
                        $("#leadSource").val(data.leadSource);
                        $("#leadStatus").val(data.leadStatus);
                        $("#leadIndustry").val(data.leadIndustry);
                        $("#leadCompany").val(data.leadCompany);
                        $("#leadCompanyAnnualRevenue").val(data.leadCompanyAnnualRevenue);
                        $("#leadCompanyNumberOfEmployees").val(data.leadCompanyNumberOfEmployees);
                        $("#leadRating").val(data.leadRating);
                        $("#leadMobile").val(data.leadMobile);
                        $("#leadFax").val(data.leadFax);
                        $("#leadStreet").val(data.leadStreet);
                        $("#leadCity").val(data.leadCity);
                        $("#leadState").val(data.leadState);
                        $("#leadZipCode").val(data.leadZipCode);
                        $("#leadCountry").val(data.leadCountry);
                        $("#leadDescription").val(data.leadDescription);
                    }
                });
            }

            function getCRM() {

                $.ajax({
                    url: 'getCRMUser/' + $("#selectCRM :selected").val(),
                    type: 'GET',
                    dataType: 'json',
                    success: function (data) {
                        //$("#id").val(data.id);
                        $("#crmId").val(data.crmId);
                        $("#crmFirstName").val(data.crmFirstName);
                        $("#crmLastName").val(data.crmLastName);
                        $("#role").val(data.role);
                        $("#profile").val(data.profile);
                        $("#crmEmail").val(data.crmEmail);
                        $("#crmMobile").val(data.crmMobile);
                        $("#crmFax").val(data.crmFax);
                        $("#crmWebsite").val(data.crmWebsite);
                        $("#dateOfBirth").val(data.dateOfBirth);
                        $("#crmStreet").val(data.crmStreet);
                        $("#crmCity").val(data.crmCity);
                        $("#crmState").val(data.crmState);
                        $("#crmZipCode").val(data.crmZipCode);
                        $("#crmCountry").val(data.crmCountry);
                    }
                });


            }
        </script>
    </body>
</html>
