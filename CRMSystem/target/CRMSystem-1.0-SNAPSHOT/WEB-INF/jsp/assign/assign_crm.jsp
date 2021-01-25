<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/jsp/common/header.jsp" />
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="resources/assets/css/bottom-header/style.css">
        <link rel="stylesheet" href="resources/assets/css/assign/assign-style.css">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="/assignCRMSave" method="post">
            <div class="assign-image">


                <!--Header-->

                <div class="bottom__header">
                    <div class="bottom__header__left">
                        <h4 class="bottom__header__title">Assign Customer Relationship Manager</h4>
                    </div>
                    <div class="bottom__header__right">
                        <a href="assignCRM"><input type="submit" class="bottom__header__button__save" value="Save"/></a>  
                        <!--                        <button id="button_save" class="bottom__header__button__save">Save</button>-->
                        <button class="bottom__header__button__saveAndNew">Save and New</button>
                        <!--<a href="activitiesview"><button class="bottom__header__button__cancel">Cancel</button></a>-->                    
                        <a href="assignreport"><input type="button" class="bottom__header__button__cancel" value="Cancel"></a>                    
                    </div>
                </div>
                <!--Header End-->


                <div class="assign-body">

                    <table class="assign-table">
                        <tr>
                            <td>
                                <label for="crm" class="field-label">CRM</label>
                            </td>
                            <td>
                                <!--id to catch the value from ajax-->
                                <select id="selectCRM" class="form-control-select">
                                    <c:forEach items="${map.crmlist}" var="crm">
                                        <option value="${crm.id}">${crm.crmFirstName} ${crm.crmLastName}</option>
                                    </c:forEach>
                                </select>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label for="name" class="field-label">Business</label>
                            </td>
                            <td>
                                <!--id to catch the value from ajax-->
                                <select id="selectBusiness" class="form-control-select">
                                    <c:forEach items="${map.businesslist}" var="bees">
                                        <option value="${bees.id}">${bees.businessName}</option>
                                    </c:forEach>
                                </select>
                            </td>
                        </tr>

                        <!--Hidden Field for CRM-->
                        <input type="hidden"  name="crmId" id="crmId"/>
                        <input type="hidden"  name="crmFirstName" id="crmFirstName"/>
                        <input type="hidden"  name="crmLastName" id="crmLastName"/>
                        <input type="hidden"  name="role" id="role"/>
                        <input type="hidden"  name="profile" id="profile"/>
                        <input type="hidden"  name="crmEmail" id="crmEmail"/>
                        <input type="hidden"  name="crmMobile" id="crmMobile"/>
                        <input type="hidden"  name="crmFax" id="crmFax"/>
                        <input type="hidden"  name="crmWebsite" id="crmWebsite"/>
                        <input type="hidden"  name="dateOfBirth" id="dateOfBirth"/>
                        <input type="hidden"  name="crmStreet" id="crmStreet"/>
                        <input type="hidden"  name="crmCity" id="crmCity"/>
                        <input type="hidden"  name="crmState" id="crmState"/>
                        <input type="hidden"  name="crmZipCode" id="crmZipCode"/>
                        <input type="hidden"  name="crmCountry" id="crmCountry"/>
                        <!--Hidden Field for Business-->
                        <input type="hidden"  name="businessName" id="businessName"/>
                        <input type="hidden"  name="type" id="type"/>
                        <input type="hidden"  name="tradedAs" id="tradedAs"/>
                        <input type="hidden"  name="isin" id="isin"/>
                        <input type="hidden"  name="industry" id="industry"/>
                        <input type="hidden"  name="founded" id="founded"/>
                        <input type="hidden"  name="founder" id="founder"/>
                        <input type="hidden"  name="headquarter" id="headquarter"/>
                        <input type="hidden"  name="areaServed" id="areaServed"/>
                        <input type="hidden"  name="keyPeople" id="keyPeople"/>
                        <input type="hidden"  name="services" id="services"/>
                        <input type="hidden"  name="revenue" id="revenue"/>
                        <input type="hidden"  name="businessNumOfEmployees" id="businessNumOfEmployees"/>
                        <input type="hidden"  name="businessWebsite" id="businessWebsite"/>


                        <input type="hidden"  name="selectCRM" id="inputCRM"/>
                        <input type="hidden"  name="selectBusiness" id="inputBusiness"/>
                    </table>


                </div>
            </div>
        </form>

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script>
            getCRM();
            getBusiness();

            $("#selectCRM").change(function () {
                getCRM();
            });


            $("#selectBusiness").change(function () {
                getBusiness();
            });

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

            function getBusiness() {
                $.ajax({
                    url: 'getBusiness/' + $("#selectBusiness :selected").val(),
                    type: 'GET',
                    dataType: 'json',
                    success: function (data) {
                        //$("#id").val(data.id);
                        $("#businessName").val(data.businessName);
                        $("#type").val(data.type);
                        $("#tradedAs").val(data.tradedAs);
                        $("#isin").val(data.isin);
                        $("#industry").val(data.industry);
                        $("#founded").val(data.founded);
                        $("#founder").val(data.founder);
                        $("#headquarter").val(data.headquarter);
                        $("#areaServed").val(data.areaServed);
                        $("#keyPeople").val(data.keyPeople);
                        $("#services").val(data.services);
                        $("#revenue").val(data.revenue);
                        $("#numberOfEmployees").val(data.numberOfEmployees);
                        $("#website").val(data.website);
                    }
                });

            }
        </script>
    </body>
</html>
