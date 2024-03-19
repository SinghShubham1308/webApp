<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Welcome to Todo App</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
        }
        h1 {
            color: #007bff;
        }
        ul {
            list-style-type: none;
            padding: 0;
        }
        li {
            margin-bottom: 10px;
        }
        .todo-item {
            display: flex;
            align-items: center;
        }
        .todo-checkbox {
            margin-right: 10px;
        }
    </style>
</head>
<body>
    <h1>Welcome to Todo App</h1>
    <%-- Check if there are todo items to display --%>
    <c:if test="${not empty todos}">
        <ul>
            <%-- Loop through the todo items and display each one --%>
            <c:forEach var="todo" items="${todos}">
                <li class="todo-item">
                    <input type="checkbox" class="todo-checkbox">
                    <span>${todo}</span>
                </li>
            </c:forEach>
        </ul>
    </c:if>
    <%-- If there are no todo items, display a message --%>
    <c:if test="${empty todos}">
        <p>No todo items yet.</p>
    </c:if>
</body>
</html>
