<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/jsp/common/header.jsp" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="resources/assets/css/header/logo.css">
        <link rel="stylesheet" href="resources/assets/css/bottom-header/style.css">
        <link rel="stylesheet" href="resources/assets/css/home/style.css">
        <link rel="stylesheet" href="resources/assets/css/report/business.css">
        <title>JSP Page</title>
    </head>
    <body>
        <div className="lead">
            <div class="bottom__header">
                <div class="bottom__header__left">
                    <h4 class="bottom__header__title">Hosgeldiniz</h4>
                </div>
                <!--                <div class="bottom__header__right">
                                    <button class="bottom__header__button__save">Save</button>
                                    <button class="bottom__header__button__saveAndNew">Save and New</button>
                                    <button class="bottom__header__button__cancel">Cancel</button>
                                </div>-->
            </div>

            <div class="activities-report-card">
                <div class="activities">
                    <h2>The Task Info</h2>
                    <table class="table table-bordered table-striped">
                        <thead>
                            <tr>
                                <th scope="col">Id</th>
                                <th scope="col">Task Owner</th>
                                <th scope="col">Due Date</th>
                                <th scope="col">Related Person</th>
                                <th scope="col">Status</th>
                                <th scope="col">Priority</th>
                                <th scope="col">Description</th>
                            </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${map.task}" var="task">
                            <tr>
                                <td>${task.taskOwner}</td>
                                <td>${task.taskSubject} </td>
                                <td>${task.taskDueDate}</td>
                                <td>${task.relatedPerson}</td>
                                <td>${task.taskStatus}</td>
                                <td>${task.taskPriority}</td>
                                <td>${task.taskDescription}</td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
    </body>
</html>
