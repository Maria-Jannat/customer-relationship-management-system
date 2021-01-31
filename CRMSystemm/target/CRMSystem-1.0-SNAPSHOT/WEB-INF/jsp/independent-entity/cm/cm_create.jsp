<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/jsp/common/header.jsp" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="resources/assets/css/bottom-header/style.css">
        <link rel="stylesheet" href="resources/assets/css/crm/crmStyle.css">
        <title>Customer Manager</title>
    </head>
    <body>
        <form action="/cm-save" method="post">
            <div class="crm-image">


                <!--Header-->

                <div class="bottom__header">
                    <div class="bottom__header__left">
                        <h4 class="bottom__header__title">Customer Manager Information</h4>
                    </div>
                    <div class="bottom__header__right">
                        <input type="submit" class="bottom__header__button__save" value="Save"/>
                        <!--                        <button id="button_save" class="bottom__header__button__save">Save</button>-->
                        <button class="bottom__header__button__saveAndNew">Save and New</button>
                        <a href="cm-report"><input type="button" class="bottom__header__button__cancel" value="Cancel"></a>                    
                    </div>
                </div>
                <!--Header End-->

                <div class="crm-create-body">
                    <table class="crm__table">
                        <tr>
                            <td>
                                <label for="cmId" class="field-label">Customer Manager ID</label>
                            </td>
                            <td>
                                <input type="text" class="form-control" name="cmId"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label for="cmFirstName" class="field-label">First Name</label>
                            </td>
                            <td>
                                <input type="text" class="form-control" name="cmFirstName"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label for="cmLastName" class="field-label">Last Name</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="cmLastName"/>
                            </td>
                        </tr>


                        <tr>
                            <td>
                                <label for="cmRole" class="field-label">Role</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="cmRole"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label for="cmProfile" class="field-label">Profile</label>
                            </td>
                            <td>
                                <select class="form-control-select"  name="cmProfile">
                                    <option>Please Select</option>
                                    <option>Administrator</option>
                                    <option>Standard</option>
                                    <option>Other</option>
                                </select>
                            </td>
                        </tr>
                        
                        <tr>
                            <td>
                                <label for="cmJobLocation" class="field-label">Job Location</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="cmJobLocation"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label for="cmEmail" class="field-label">Email</label>
                            </td>
                            <td>
                                <input type="email" class="form-control"  name="cmEmail"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label for="cmMobile" class="field-label">Mobile</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="cmMobile"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label for="cmFax" class="field-label">Fax</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="cmFax"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label for="cmWebsite" class="field-label">Website</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="cmWebsite"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label for="cmDateOfBirth" class="field-label">Date of Birth</label>
                            </td>
                            <td>
                                <input type="date" class="form-control"  name="cmDateOfBirth"/>
                            </td>
                        </tr>                      

                        <tr>
                            <td>
                                <label for="cmStreet" class="field-label">Street</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="cmStreet"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label for="cmCity" class="field-label">City</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="cmCity"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label for="cmState" class="field-label">State/Area</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="cmState"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label for="cmZipCode" class="field-label">Zip Code</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="cmZipCode"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label for="cmCountry" class="field-label">Country</label>
                            </td>
                            <td>
                                <input type="text" class="form-control"  name="cmCountry"/>
                            </td>
                        </tr>
                        
                        <tr>
                            <td>
                                <label for="cmDescription" class="field-label">Description</label>
                            </td>
                            <td>
                                <textarea type="textarea" class="form-control" name="cmDescription"></textarea>
                            </td>
                        </tr>

                    </table>
                </div>
            </div>
        </form>
    </body>
</html>
