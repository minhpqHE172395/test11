<%-- 
    Document   : subjects
    Created on : Feb 22, 2024, 11:41:02 AM
    Author     : admin
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Subjects</title>
    </head>
    <body>
        <form action="subjects" method="post">
            Code <input type="text" name="code"><br>
            Name <input type="text" name="name"><br>
            Major <select name="major">
                <option value="SE">SE</option>
                <option value="AL">AL</option>
                <option value="IA">IA</option>
                <option value="IS">IS</option>
            </select><br>
            <input type="submit" value="SUBMIT">
        </form>
        <div>List of subjects:</div>
        <div>
            <c:forEach var="subject" items="${subjects}">
                <div>${subject.code} - ${subject.name} - ${subject.major}</div>
            </c:forEach>
        </div>
    </body>
</html>