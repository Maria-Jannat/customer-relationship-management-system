<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/jsp/common/header.jsp" />
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Business Service</title>
        <link rel="stylesheet" href="resources/assets/css/bottom-header/style.css">
        <link rel="stylesheet" href="resources/assets/css/assign/assign-style.css">
        <title>VAS</title>
    </head>
    <body>
        <form action="/busines-service-save" method="post">
            <div class="assign-image">


                <!--Header-->

                <div class="bottom__header">
                    <div class="bottom__header__left">
                        <h4 class="bottom__header__title">Value Added Service</h4>
                    </div>
                    <div class="bottom__header__right">
                        <input type="submit" class="bottom__header__button__save" value="Save"/>
                        <button class="bottom__header__button__saveAndNew">Save and New</button>
                        <a href="service-report"><input type="button" class="bottom__header__button__cancel" value="Cancel"></a>                    
                    </div>
                </div>
                <!--Header End-->


                <div class="assign-body">

                    <table class="assign-table">
                        
                        <tr>
                            <td>
                                <label for="name" class="field-label">Business</label>
                            </td>
                            <td>
                                <select id="selectBusinessForService" class="form-control-select">
                                    <c:forEach items="${map.businesses}" var="business">
                                        <option value="${business.id}">${business.businessName}</option>
                                    </c:forEach>
                                </select>
                            </td>
                        </tr>
                        
                        <tr>
                            <td>
                                <label for="serviceCode" class="field-label">Service Code</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="serviceCode" id="serviceCode"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label for="serviceType" class="field-label" id="business-field">Service Type</label>
                            </td>
                            <td>
                                <select class="form-control-select"  name="serviceType">
                                    <option>Please Select</option>
                                    <option>Chargeable</option>
                                    <option>Free</option>
                                </select>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label for="serviceName" class="field-label">Service Name</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="serviceName" id="serviceName"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label for="serviceRate" class="field-label">Service Rate</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="serviceRate" id="serviceName"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label for="serviceStatus" class="field-label" id="business-field">Service Status</label>
                            </td>
                            <td>
                                <select class="form-control-select"  name="serviceStatus">
                                    <option>Please Select</option>
                                    <option>Requested</option>
                                    <option>Pre Launched</option>
                                    <option>Launched</option>
                                </select>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label class="field-label" for="serviceDescription">Description</label>
                            </td>

                            <td>
                                <textarea type="textarea" class="form-control" name="serviceDescription"></textarea>
                            </td>
                        </tr>


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

                        <!--<input type="hidden"  name="selectBusiness" id="inputBusiness"/>-->
                    </table>


                </div>
            </div>
        </form>

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script>
            getBusinessForService();

            $("#selectBusinessForService").change(function () {
                getBusinessForService();
            });

            function getBusinessForService() {
                $.ajax({
                    url: 'getBusinessForService/' + $("#selectBusinessForService :selected").val(),
                    type: 'GET',
                    dataType: 'json',
                    success: function (data) {
                        alert();
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
