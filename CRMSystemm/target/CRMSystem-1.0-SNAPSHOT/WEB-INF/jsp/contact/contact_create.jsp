<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/jsp/common/header.jsp" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="resources/assets/css/bottom-header/style.css">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="/contactSave" method="post">
            <div class="contact-image">


                <!--Header-->

                <div class="bottom__header">
                    <div class="bottom__header__left">
                        <h4 class="bottom__header__title">Create Task</h4>
                    </div>
                    <div class="bottom__header__right">
                        <a href="contactcreate"><input type="submit" class="bottom__header__button__save" value="Save"/></a>  
                        <button class="bottom__header__button__saveAndNew">Save and New</button>
                        <a href="contactreport"><input type="button" class="bottom__header__button__cancel" value="Cancel"></a>                    
                    </div>
                </div>
                <!--Header End-->


                <div id="contact-create-body">

                    <table class="contact-table">                       
                        <tr>
                            <td>
                                <label for="contactId" class="field-label">Contact Id</label>
                            </td>
                            <td>
                                <input type="text" class="form-control" name="contactId"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label class="field-label">Contact Owner</label>
                            </td>
                            <td>
                                <select id="selectCRM" class="form-control-select">
                                    <c:forEach items="${map.crmlist}" var="crm">
                                        <option value="${crm.id}">${crm.crmFirstName} ${crm.crmLastName}</option>
                                    </c:forEach>
                                </select>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label class="field-label">First Name</label>
                            </td>
                            <td>
                                <input type="text" class="form-control" name="contactFirstName">
                            </td>
                        </tr>
                        
                        <tr>
                            <td>
                                <label class="field-label">Last Name</label>
                            </td>
                            <td>
                                <input type="text" class="form-control" name="contactLastName">
                            </td>
                        </tr>



                        <input type="hidden"  name="crmFirstName" id="crmFirstName"/>
                        <input type="hidden"  name="crmLastName" id="crmLastName"/>
                        <input type="hidden"  name="crmEmail" id="crmEmail"/>
                        <input type="hidden"  name="crmMobile" id="crmMobile"/>
                        <input type="hidden"  name="leadFirstName" id="leadFirstName"/>
                        <input type="hidden"  name="leadLastName" id="leadLastName"/>
                        <input type="hidden"  name="leadSource" id="leadSource"/>
                        <input type="hidden"  name="leadIndustry" id="leadIndustry"/>
                        <input type="hidden"  name="leadCompany" id="leadCompany"/>
                        <input type="hidden"  name="leadCompany" id="leadCompany"/>

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
                        <!--                        <tr>
                                                    <td></td>
                                                    <td><input type="submit"  value="Save"/></td>
                                                </tr>-->
                    </table>


                </div>
            </div>
        </form>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script>
            $("#selectLead").change(function () {

                $.ajax({
                    url: 'getLead/' + this.value,
                    type: 'GET',
                    dataType: 'json',
                    success: function (data) {
//                        alert(data.leadLastName);
                        //$("#id").val(data.id);

                        $("#leadFirstName").val(data.leadFirstName);
                        $("#leadLastName").val(data.leadLastName);
//                        $("#jobTitle").val(data.jobTitle);
//                        $("#leadSource").val(data.leadSource);
//                        $("#leadStatus").val(data.leadStatus);
//                        $("#leadIndustry").val(data.leadIndustry);
//                        $("#leadCompany").val(data.leadCompany);
//                        $("#leadCompanyAnnualRevenue").val(data.leadCompanyAnnualRevenue);
//                        $("#leadCompanyNumberOfEmployees").val(data.leadCompanyNumberOfEmployees);
//                        $("#leadRating").val(data.leadRating);
//                        $("#leadMobile").val(data.leadMobile);
//                        $("#leadFax").val(data.leadFax);
//                        $("#leadStreet").val(data.leadStreet);
//                        $("#leadCity").val(data.leadCity);
//                        $("#leadState").val(data.leadState);
//                        $("#leadZipCode").val(data.leadZipCode);
//                        $("#leadCountry").val(data.leadCountry);
//                        $("#leadDescription").val(data.leadDescription);
                    }
                });
            });
            $("#selectCRM").change(function () {

                $.ajax({
                    url: 'getCRMUser/' + this.value,
                    type: 'GET',
                    dataType: 'json',
                    success: function (data) {
                        alert(data.crmFirstName);
                        //$("#id").val(data.id);
//                        $("#crmId").val(data.crmId);
                        $("#crmFirstName").val(data.crmFirstName);
                        $("#crmLastName").val(data.crmLastName);
//                        $("#role").val(data.role);
//                        $("#profile").val(data.profile);
//                        $("#crmEmail").val(data.crmEmail);
//                        $("#crmMobile").val(data.crmMobile);
//                        $("#crmFax").val(data.crmFax);
//                        $("#crmWebsite").val(data.crmWebsite);
//                        $("#dateOfBirth").val(data.dateOfBirth);
//                        $("#crmStreet").val(data.crmStreet);
//                        $("#crmCity").val(data.crmCity);
//                        $("#crmState").val(data.crmState);
//                        $("#crmZipCode").val(data.crmZipCode);
//                        $("#crmCountry").val(data.crmCountry);
                    }
                });
            });
//            $("#button_save").on("click", function () {
//
//            $.ajax({
//            url: '/taskSave',
//                    type: 'POST',
//                    dataType: 'json',
//                    data: {
//                    selectCRM : $("#selectCRM").val(),
//                            taskSubject : $("#taskSubject").val(),
//                            taskDueDate : $("#taskDueDate").val(),
//                            selectLead : $("#selectLead").val(),
//                            taskStatus : $("#taskStatus").val()
//                            taskPriority : $("#taskPriority").val()
//                            taskDescription : $("#taskDescription").val()
//                    }
//
//            });
//            });

        </script>
    </body>
</html>





<!--                        <tr>
                            <td>
                                <label class="field-label">Contact</label>
                            </td>

                            <td>
                                <select id="selectLead" class="form-control-select">
<c:forEach items="${map.leadlist}" var="lead">
    <option value="${lead.id}">${lead.leadFirstName} ${lead.leadLastName}</option>
</c:forEach>
</select>
</td>
</tr>-->
