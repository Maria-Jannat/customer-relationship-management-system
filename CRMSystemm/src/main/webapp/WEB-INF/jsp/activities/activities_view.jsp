<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/jsp/common/header.jsp" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.23/css/jquery.dataTables.css">
        <link rel="stylesheet" href="resources/assets/css/bottom-header/style.css">
        <link rel="stylesheet" href="resources/assets/css/activities/style.css">
        <link rel="stylesheet" href="resources/assets/css/report/businessReport.css">

        <title>Activities Report</title>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

        <style>
            #ne{
                display:none;
                margin-top: 2px;
                margin-left: 23px;
            }
        </style>
    </head>
    <body>
        <div className="lead">
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
                    <table class="display nowrap cell-border hover" id="myTable">
                        <thead style="background-image: linear-gradient(130deg,#af002d 51.07%,#319197 76.05%,#ff7a18); color: #fff;">
                            <tr>
                                <th scope="col">Task Owner</th>
                                <th scope="col">Activity Type</th>
                                <th scope="col">Due Date</th>
                                <th scope="col">Related Person</th>
                                <th scope="col">Status</th>
                                <th scope="col">Priority</th>
                                <th scope="col">Description</th>
                                <!--<th>Action</th>-->

                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${map.task}" var="task">
                                <tr>
                                    <td>${task.taskOwner}</td>
                                    <td><a href="activity-details" class="activity-type" style="text-decoration: none;">${task.taskSubject}</a></td>
                                    <td>${task.taskDueDate}</td>
                                    <td>${task.relatedPerson}</td>
                                    <td style="background: #af002d; color: #fff; font-weight: bold;">${task.taskStatus}</td>
                                    <td>${task.taskPriority}</td>
                                    <td>${task.taskDescription}</td>
                                </tr>
                                <!--                                    <td>
                                <c:if test = "${task.taskStatus == 'Done'}">
                                    <label>Task Completed</label>
                                    <input type="hidden" value="${task.taskStatus}" class="task-status"/>
                                </c:if>

                                <c:if test = "${task.taskStatus != 'Done'}">
                                    <button type="button" onclick="changeAction(this)">Change</button>
                                    <input type="hidden" value="${task.taskStatus}" class="task-status"/>                                      
                                    <input type="hidden" value="${task.id}" class="task-id"/>                                      
                                </c:if>
                            </td>
                        </tr>-->
                                <!--                                <tr>
                                                                    <td>${task.taskOwner}</td>
                                                                    <td><a href="activity-details" class="activity-type" style="text-decoration: none;">${task.taskSubject}</a></td>
                                                                    <td>${task.taskDueDate}</td>
                                                                    <td>${task.relatedPerson}</td>
                                                                    <td>
                                                                        <input type="text" value="${task.taskStatus}" class="input-status" disabled="disabled"/>
                                                                    </td>
                                                                    <td>${task.taskPriority}</td>
                                                                    <td>${task.taskDescription}</td>
                                
                                                                    <td>
                                <c:if test = "${task.taskStatus == 'Done'}">
                                    <label>Task Completed</label>
                                    <input type="hidden" value="${task.taskStatus}" class="task-status"/>
                                </c:if>

                                <c:if test = "${task.taskStatus != 'Done'}">
                                    <button type="button" onclick="changeAction(this)">Change</button>
                                    <input type="hidden" value="${task.taskStatus}" class="task-status"/>                                      
                                    <input type="hidden" value="${task.id}" class="task-id"/>                                      
                                </c:if>
                            </td>
                        </tr>-->
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </body>
</html>

<script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.10.23/js/jquery.dataTables.js"></script>
<script>

    function changeAction(el) {
        var taskStatus = $(el).closest("tr").find(".task-status").val();
        var taskID = $(el).closest("tr").find(".task-id").val();
        //console.log(taskStatus)
        $(el).closest("tr").find(".input-status").val("Done");
        $(el).attr("disabled", "disabled");


        $.post("/taskupdate",
                {
                    id: taskID,
                    status: taskStatus
                },
                function (data, status) {
                });
    }


$('#myTable').DataTable();


</script>