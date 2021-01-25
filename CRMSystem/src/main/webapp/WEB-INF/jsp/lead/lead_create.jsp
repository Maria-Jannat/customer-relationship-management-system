<jsp:include page="/WEB-INF/jsp/common/header.jsp" />
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="resources/assets/css/bottom-header/style.css">
        <link rel="stylesheet" href="resources/assets/css/lead/leadStyle.css">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="/packagesave" method="post">
            <div class="lead-image">


                <!--Header-->

                <div class="bottom__header">
                    <div class="bottom__header__left">
                        <h4 class="bottom__header__title">Lead Information</h4>
                    </div>
                    <div class="bottom__header__right">
                        <input type="submit" class="bottom__header__button__save" value="Save"/>
                        <!--<input type="submit" class="bottom__header__button__saveAndNew" value="Save and New"/>-->
                        <a href="leadcreate"><input type="submit" class="bottom__header__button__saveAndNew" value="Save and New"></a>                     

                        <!--                        <button id="button_save" class="bottom__header__button__save">Save</button>-->
                        <!--<button class="bottom__header__button__saveAndNew">Save and New</button>-->
                        <a href="leadreport"><input type="button" class="bottom__header__button__cancel" value="Cancel"></a>                    
                    </div>
                </div>
                <!--Header End-->



                <div class="lead-create-body">
                    <table class="lead-table">

                        <tr>
                            <td>
                                <label class="field-label" for="firstName">First Name</label>
                            </td>
                            <td>
                                <input type="text" class="form-control" name="leadFirstName"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label class="field-label" for="lastName">Last Name</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="leadLastName"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label class="field-label" for="jobTitle">Job Title</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="jobTitle"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label class="field-label" for="leadSource">Lead Source</label>
                            </td>
                            <td>
                                <select class="form-control-select" name="leadSource">
                                    <option>Please Select</option>
                                    <option>Advertisement</option>
                                    <option>Employee Referral</option>
                                    <option>External Referral</option>
                                    <option>Online Store</option>
                                    <option>Partner</option>
                                    <option>Public Relations</option>
                                    <option>Trade Show</option>
                                    <option>Web Research</option>
                                </select>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label class="field-label" for="leadStatus">Lead Status</label>
                            </td>
                            <td>
                                <select class="form-control-select" name="leadStatus">
                                    <option>Please Select</option>
                                    <option>Attempted to Contact</option>
                                    <option>Contacted</option>
                                    <option>Junk Lead</option>
                                    <option>Lost Lead</option>
                                    <option>Not Contacted</option>
                                    <option>Pre-Qualified</option>
                                    <option>Not Qualified</option>
                                </select>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label class="field-label" for="industry">Industry</label>
                            </td>
                            <td>
                                <select class="form-control-select" name="leadIndustry">
                                    <option>Please Select</option>
                                    <option>ASP (Application Service Provider)</option>
                                    <option>Data/Telecom OEM</option>
                                    <option>ERP (Enterprise Resource Planning)</option>
                                    <option>Government/Military</option>
                                    <option>Large Enterprise</option>
                                    <option>ManagementISV</option>
                                    <option>MSP (Management Service Provider)</option>
                                    <option>Network Equipment Enterprise</option>
                                    <option>Optical Networking</option>
                                    <option>Service Provider</option>
                                    <option>Small/Medium Enterprise</option>
                                    <option>Storage Equipment</option>
                                    <option>Storage Service Provider</option>
                                    <option>System Integrator</option>
                                    <option>Telecommunication</option>
                                    <option>Testing</option>
                                </select>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label class="field-label" for="company">Company</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="leadCompany"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label class="field-label" for="annualRevenue">Annual Revenue</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="leadCompanyAnnualRevenue"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label class="field-label" for="numberOfEmployees">No. of Employee</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="leadCompanyNumberOfEmployees"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label class="field-label" for="rating">Rating</label>
                            </td>
                            <td>
                                <select class="form-control-select" name="leadRating">
                                    <option>Please Select</option>
                                    <option>Acquired</option>
                                    <option>Active</option>
                                    <option>Market Failed</option>
                                    <option>Project Canceled</option>
                                    <option>Shut Down</option>                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
                                </select>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label class="field-label" for="email">Email</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="leadEmail"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label class="field-label" for="mobile">Mobile</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="leadMobile"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label class="field-label" for="fax">Fax</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="leadFax"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label class="field-label" for="website">Website</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="leadWebsite"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label class="field-label" for="street">Street</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="leadStreet"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label class="field-label" for="city">City</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="leadCity"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label class="field-label" for="state">State</label>
                            </td>
                            <td>
                                <input type="text" class="form-control" name="leadState"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label class="field-label" for="zipCode">Zip Code</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="leadZipCode"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label class="field-label" for="country">Country</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="leadCountry"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label class="field-label" for="description">Description</label>
                            </td>

                            <td>
                                <textarea type="textarea" class="form-control" name="leadDescription"></textarea>
                            </td>
                        </tr>

                    </table>
                </div>
            </div>
        </form>
    </div>
</body>
</html>
