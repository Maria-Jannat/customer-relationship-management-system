<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/jsp/common/header.jsp" />
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>Haydi...
<!--        <div className="lead">
            <div class="bottom__header">
                <div class="bottom__header__left">
                    <h4 class="bottom__header__title">Activities Report</h4>

                </div>
                <div><button class="bottom__header__button__save" id="ne">Done</button></div>
                <div class="bottom__header__right">
                    <button class="bottom__header__button__save">Call</button>
                    <button class="bottom__header__button__saveAndNew">Meeting</button>
                    <a href="taskcreate"><button class="bottom__header__button__cancel">Task</button></a>
                </div>
            </div>

            <div class="activities-report-card">
                <div class="activities">
                    <table class="table table-bordered table-striped">
                        <thead>
                            <tr>
                                <th scope="col">Task Owner</th>
                                <th scope="col">Task Subject</th>
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
                                    <td>
                                        <button class="btn btn-info">${task.taskSubject}</button>
                                    </td>
                                    <td>${task.taskDueDate}</td>
                                    <td>${task.relatedPerson}</td>
                                    <td onclick="taskAction('${task.taskStatus}')">${task.taskStatus}</td>
                                    <td>${task.taskPriority}</td>
                                    <td>${task.taskDescription}</td>
                                                                <td>
                                                                    <a href="/edit/${business.id}"><input type="button" value="Edit" class="btn btn-info"/></a>
                                                                    <a href="/delete/${business.id}"><input type="button" value="Delete" class="btn btn-danger"/></a>
                                                                </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>-->
    </body>
</html>
