
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/jsp/common/header.jsp" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="resources/assets/css/bottom-header/style.css">
        <link rel="stylesheet" href="resources/assets/css/packs/packStyle.css">
        <title>SMS Pack</title>
    </head>
    <body>
        <form action="/smsSave" method="post">
            <div class="package-image">


                <!--Header-->

                <div class="bottom__header">
                    <div class="bottom__header__left">
                        <h4 class="bottom__header__title">Package Information</h4>
                    </div>
                    <div class="bottom__header__right">
                        <input type="submit" class="bottom__header__button__save" value="Save"/>
                        <!--                        <button id="button_save" class="bottom__header__button__save">Save</button>-->
                        <button class="bottom__header__button__saveAndNew">Save and New</button>
                        <a href="packagereport"><input type="button" class="bottom__header__button__cancel" value="Cancel"></a>                    
                    </div>
                </div>
                <!--Header End-->

                <div id="package-create-body">

                    <table class="package-table">                       
                        <tr>
                            <td>
                                <label for="smsPackId" class="field-label">Package Id</label>
                            </td>
                            <td>
                                <input type="text" class="form-control" name="smsPackId"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label for="smsPackName" class="field-label">Package Name</label>
                            </td>
                            <td>
                                <input type="text" class="form-control" name="smsPackName">
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label for="smsPackType" class="field-label">SMS Type</label>
                            </td>
                            <td>
                                <select id="package_type" class="form-control-select" name="smsPackType">
                                    <option value="please select">Please Select</option>
                                    <option value="on-net">On net</option>
                                    <option value="off-net">Off net</option>
                                </select>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label for="smsPackCount" class="field-label">SMS Count</label>
                            </td>
                            <td>
                                <input type="text" class="form-control" name="smsPackCount" value="   SMS"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label for="smsPackDuration" class="field-label">For</label>
                            </td>
                            <td>
                                <input type="text" class="form-control" name="smsPackDuration" id="forDays" value="   Days"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label for="smsPackStatus" class="field-label">Status</label>
                            </td>
                            <td>
                                <select class="form-control-select" name="smsPackStatus" id="packStatus">
                                    <option>Active</option>
                                    <option>Inactive</option>
                                    <option>Planning</option>
                                </select>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label for="smsPackPrice" class="field-label">Price</label>
                            </td>
                            <td>
                                <input type="text" class="form-control" name="smsPackPrice" id="packPrice" value="   Tk"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                            </td>
                            <td>
                                <textarea type="textarea" name="smsPackDescription" id="taskDescription" class="form-control" placeholder="Description..."></textarea>
                            </td>
                        </tr>

                    </table>
                </div>
            </div>
        </form>
    </body>
</html>




























<!--                        <tr>
                            <td>
                                <label for="packageType"class="field-label">Package Type</label>
                            </td>
                            <td>
                                <select id="package_type" class="form-control-select" name="packageType">
                                    <option value="please select">Please Select</option>
                                    <option value="regular">Regular</option>
                                    <option value="custom">Custom</option>
                                </select>
                            </td>
                        </tr>-->