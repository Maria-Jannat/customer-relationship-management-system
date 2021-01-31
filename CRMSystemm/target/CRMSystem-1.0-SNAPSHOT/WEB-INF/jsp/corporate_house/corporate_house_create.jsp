<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/jsp/common/header.jsp" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="resources/assets/css/bottom-header/style.css">
        <link rel="stylesheet" href="resources/assets/css/corporateHouse/corporateHouseStyle.css">
        <title>Corporate House</title>
    </head>
    <body>
        <form action="chousesave" method="post">
            <div class="chouse-image">


                <!--Header-->

                <div class="bottom__header">
                    <div class="bottom__header__left">
                        <h4 class="bottom__header__title">CRM Information</h4>
                    </div>
                    <div class="bottom__header__right">
                        <input type="submit" class="bottom__header__button__save" value="Save"/>
                        <!--                        <button id="button_save" class="bottom__header__button__save">Save</button>-->
                        <button class="bottom__header__button__saveAndNew">Save and New</button>
                        <a href="chousereport"><input type="button" class="bottom__header__button__cancel" value="Cancel"></a>                    
                    </div>
                </div>
                <!--Header End-->

                <div class="chouse-create-body">
                    <!--<p>Business Information</p>-->

                    <table class="chouse-table">

                        <tr>
                            <td>
                                <label for="corporateHouseId" class="field-label" id="business-field">Corporate House Id</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="corporateHouseId"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label for="corporateHouseName" class="field-label" id="business-field">Corporate House Name</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="corporateHouseName"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label for="corporateHouseType" class="field-label" id="business-field">Type</label>
                            </td>
                            <td>
                                <select class="form-control-select"  name="corporateHouseType">
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
                                <label for="corporateHouseTradedAs" class="field-label" id="business-field">Traded As</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="corporateHouseTradedAs"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label for="corporateHouseISIN" class="field-label" id="business-field">ISIN</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="corporateHouseISIN"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label for="corporateHouseIndustry" class="field-label" id="business-field">Industry</label>
                            </td>
                            <td>
                                <select class="form-control-select" name="corporateHouseIndustry">
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
                                    <option>Retail</option>
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
                                <label for="corporateHouseNumOfEmp" class="field-label" id="business-field">No. of Employee</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="corporateHouseNumOfEmp"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label for="corporateHouseServices" class="field-label" id="business-field">Services</label>
                            </td>
                            <td>
                                <select class="form-control-select" name="corporateHouseServices">
                                    <option>Please Select</option>
                                    <option>Mobile telephony</option>
                                    <option>Mobile Internet</option>
                                    <option>Digital Services</option>
                                    <option>Azure</option>
                                    <option>Bing</option>
                                    <option>Social Assistance</option>
                                    <option>Health Care</option>
                                    <option>Waste Management</option>
                                    <option>Professional and Technical Services</option>
                                    <option>Scientific Services</option>
                                    <option>Transportation</option>
                                    <option>Telecommunication</option>
                                </select>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label for="corporateHouseRevenue" class="field-label" id="business-field">Revenue</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="corporateHouseRevenue"/>
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
                                <label for="corporateHouseContact" class="field-label" id="business-field">Contact Name</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="corporateHouseContact"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label for="contactJobTitle" class="field-label" id="business-field">Job Title of Contact</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="contactJobTitle"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label for="contactDepartment" class="field-label" id="business-field">Department of Contact</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="contactDepartment"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label for="contactEmail" class="field-label" id="business-field">Email of Contact</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="contactEmail"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label for="contactMobile" class="field-label" id="business-field">Mobile of Contact</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="contactMobile"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label for="contactFax" class="field-label" id="business-field">Fax of Contact</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="contactFax"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label for="contactWebsite" class="field-label" id="business-field">Website of Contact</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="contactWebsite"/>
                            </td>
                        </tr>


                        <!--BACKUP CONTACT PERSON INFO-->
                        <tr>
                            <td>
                                <label for="backupContact" class="field-label" id="business-field">Backup Contact Name</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="backupContact"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label for="backupContactJobTitle" class="field-label" id="business-field">Job Title of Backup Contact</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="backupContactJobTitle"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label for="backupContactEmail" class="field-label" id="business-field">Email of Backup Contact</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="backupContactEmail"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label for="backupContactMobile" class="field-label" id="business-field">Mobile of Backup Contact</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="backupContactMobile"/>
                            </td>
                        </tr>

                        <!--ADDRESS INFO OF CORPORATE HOUSE-->
                        <tr>
                            <td>
                                <label class="field-label" for="corporateHouseStreet">Corporate House Street</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="corporateHouseStreet"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label class="field-label" for="corporateHouseCity">Corporate House City</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="corporateHouseCity"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label class="field-label" for="corporateHouseState">Corporate House State</label>
                            </td>
                            <td>
                                <input type="text" class="form-control" name="corporateHouseState"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label class="field-label" for="corporateHouseZipCode">Corporate House Zip Code</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="corporateHouseZipCode"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label class="field-label" for="corporateHouseCountry">Corporate House Country</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="corporateHouseCountry"/>
                            </td>
                        </tr>

                        <!--ADDRESS INFO OF CONTACT PERSON-->
                        <tr>
                            <td>
                                <label class="field-label" for="contactStreet">Contact Street</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="contactStreet"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label class="field-label" for="contactCity">Contact City</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="contactCity"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label class="field-label" for="contactState">Contact State</label>
                            </td>
                            <td>
                                <input type="text" class="form-control" name="contactState"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label class="field-label" for="contactZipCode">Zip Code</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="contactZipCode"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label class="field-label" for="contactCountry">Contact Country</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="contactCountry"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label class="field-label" for="corporateHouseDescription">Description</label>
                            </td>

                            <td>
                                <textarea type="textarea" class="form-control" name="corporateHouseDescription"></textarea>
                            </td>
                        </tr>

                    </table>
                </div>
            </div>
        </form>
    </body>
</html>
