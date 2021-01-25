<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/jsp/common/header.jsp" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="resources/assets/css/bottom-header/style.css">
        <link rel="stylesheet" href="resources/assets/css/packs/packStyle.css">
        <title>Minute Pack</title>
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
                                <label for="minPackId" class="field-label">Package Id</label>
                            </td>
                            <td>
                                <input type="text" class="form-control" name="minPackId"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label for="minPackName" class="field-label">Package Name</label>
                            </td>
                            <td>
                                <input type="text" class="form-control" name="minPackName">
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label for="minPackType" class="field-label">Minute Type</label>
                            </td>
                            <td>
                                <select class="form-control-select" name="minPackType" id="minuteType">
                                    <option>Please Select</option>
                                    <option>Local</option>
                                    <option>International</option>
                                </select>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label for="minPackCount" class="field-label">Minute Count</label>
                            </td>
                            <td>
                                <input type="text" class="form-control" name="minPackCount" value="   Min"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label  for="minPackDuration" class="field-label">For</label>
                            </td>
                            <td>
                                <input type="text" class="form-control" name="minPackDuration" id="forDays" value="   Days"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label for="minPackStatus" class="field-label">Status</label>
                            </td>
                            <td>
                                <select class="form-control-select" name="minPackStatus" id="packStatus">
                                    <option>Active</option>
                                    <option>Inactive</option>
                                    <option>Planning</option>
                                </select>
                            </td>
                        </tr>

                        <tr>
                            <td>
                                <label for="minPackPrice" class="field-label">Price</label>
                            </td>
                            <td>
                                <input type="text" class="form-control" name="minPackPrice" id="packPrice" value="   Tk"/>
                            </td>
                        </tr>

                        <tr>
                            <td>
                            </td>
                            <td>
                                <textarea type="textarea" name="minPackDescription" id="taskDescription" class="form-control" placeholder="Description..."></textarea>
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