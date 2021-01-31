<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/jsp/common/header.jsp" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="resources/assets/css/bottom-header/style.css">
        <link rel="stylesheet" href="resources/assets/css/crm/crmStyle.css">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="/crmSave" method="post">
            <div class="crm-image">


                <!--Header-->

                <div class="bottom__header">
                    <div class="bottom__header__left">
                        <h4 class="bottom__header__title">CRM Information</h4>
                    </div>
                    <div class="bottom__header__right">
                        <input type="submit" class="bottom__header__button__save" value="Save"/>
                        <!--                        <button id="button_save" class="bottom__header__button__save">Save</button>-->
                        <button class="bottom__header__button__saveAndNew">Save and New</button>
                        <a href="crmreport"><input type="button" class="bottom__header__button__cancel" value="Cancel"></a>                    
                    </div>
                </div>
                <!--Header End-->

                <div class="crm-create-body">
                    <table class="crm__table">
                        <tr>
                            <td>
                                <label for="crmId" class="field-label">CRM Id</label>
                            </td>
                            <td>
                                <input type="text" class="form-control" name="crmId"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label for="crmFirstName" class="field-label">First Name</label>
                            </td>
                            <td>
                                <input type="text" class="form-control" name="crmFirstName"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label for="crmLastName" class="field-label">Last Name</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="crmLastName"/>
                            </td>
                        </tr>


                        <tr>
                            <td>
                                <label for="role" class="field-label">Role</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="role"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label for="profile" class="field-label">Profile</label>
                            </td>
                            <td>
                                <select class="form-control-select"  name="profile">
                                    <option>Please Select</option>
                                    <option>Administrator</option>
                                    <option>Standard</option>
                                </select>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label for="crmEmail" class="field-label">Email</label>
                            </td>
                            <td>
                                <input type="email" class="form-control"  name="crmEmail"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label for="crmMobile" class="field-label">Mobile</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="crmMobile"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label for="crmFax" class="field-label">Fax</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="crmFax"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label for="crmWebsite" class="field-label">Website</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="crmWebsite"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label for="dateOfBirth" class="field-label">Date of Birth</label>
                            </td>
                            <td>
                                <input type="date" class="form-control"  name="dateOfBirth"/>
                            </td>
                        </tr>                      

                        <tr>
                            <td>
                                <label for="crmStreet" class="field-label">Street</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="crmStreet"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label for="crmCity" class="field-label">City</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="crmCity"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label for="crmState" class="field-label">State/Area</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="crmState"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label for="crmZipCode" class="field-label">Zip Code</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="crmZipCode"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label for="crmCountry" class="field-label">Country</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="crmCountry"/>
                            </td>
                        </tr>

                    </table>
                </div>
            </div>
        </form>
    </body>
</html>
