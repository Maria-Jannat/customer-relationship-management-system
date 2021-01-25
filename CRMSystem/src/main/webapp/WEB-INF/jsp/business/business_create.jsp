
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/jsp/common/header.jsp" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="resources/assets/css/bottom-header/style.css">
        <link rel="stylesheet" href="resources/assets/css/business/style.css">
        <link rel="stylesheet" href="resources/assets/css/business/businessiki.css">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="/businessSave" method="post">
            <div class="business-image">


                <!--Header-->

                <div class="bottom__header">
                    <div class="bottom__header__left">
                        <h4 class="bottom__header__title">Business Information</h4>
                    </div>
                    <div class="bottom__header__right">
                        <input type="submit" class="bottom__header__button__save" value="Save"/>
                        <!--                        <button id="button_save" class="bottom__header__button__save">Save</button>-->
                        <button class="bottom__header__button__saveAndNew">Save and New</button>
                        <a href="businessreport"><input type="button" class="bottom__header__button__cancel" value="Cancel"></a>                    
                    </div>
                </div>
                <!--Header End-->




                <div class="business-create-body">
                    <!--<p>Business Information</p>-->

                    <table id="business-table">

                        <tr>
                            <td>
                                <label for="businessName" class="field-label" id="business-field">Name</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="businessName"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label for="type" class="field-label" id="business-field">Type</label>
                            </td>
                            <td>
                                <select class="form-control-select"  name="type">
                                    <option>Please Select</option>
                                    <option>Private</option>
                                    <option>Public</option>
                                    <option>Social</option>
                                    <option>Subsidiary</option>
                                </select>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label for="tradedAs" class="field-label" id="business-field">Traded As</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="tradedAs"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label for="isin" class="field-label" id="business-field">ISIN</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="isin"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label for="industry" class="field-label" id="business-field">Industry</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="industry"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label for="founded" class="field-label" id="business-field">Founded</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="founded"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label for="founder" class="field-label" id="business-field">Founder</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="founder"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label for="headquarter" class="field-label" id="business-field">Headquarter</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="headquarter"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label for="areaServed" class="field-label" id="business-field">Area Served</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="areaServed"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label for="keyPeople" class="field-label" id="business-field">Key People</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="keyPeople"/>
                            </td>
                        </tr>                      

                        <tr>
                            <td>
                                <label for="services" class="field-label" id="business-field">Services</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="services"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label for="revenue" class="field-label" id="business-field">Revenue</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="revenue"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label for="numberOfEmployees" class="field-label" id="business-field">NO. Of Employees</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="businessNumOfEmployees"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label for="website" class="field-label" id="business-field">Website</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="businessWebsite"/>
                            </td>
                        </tr>

                    </table>


                </div>
            </div>
        </form>
    </body>
</html>
