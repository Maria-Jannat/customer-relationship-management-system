<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/jsp/common/header.jsp" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="resources/assets/css/bottom-header/style.css">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="bottom__header">
            <div class="bottom__header__left">
                <h4 class="bottom__header__title">Assign Report</h4>
            </div>
            <div class="bottom__header__right">
                <button class="bottom__header__button__save">•••</button>
                <a href="assignLead"><button class="bottom__header__button__saveAndNew">Assign Lead</button></a>
                <a href="assignCRM"><button class="bottom__header__button__cancel">Assign CRM</button></a>
            </div>
        </div>
    </body>
</html>
