<%-- 
    Document   : studentinfo
    Created on : Nov 22, 2016, 10:48:58 PM
    Author     : mahdifar424
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
    <head>
        <title>Spring MVC Form Handling</title>
    </head>
    <body>

        <h2>i'm trying to change it  Aredeshir!</h2>
        <table>
            <tr>
                <td>Name</td>
                <td>${name}</td>
            </tr>
            <tr>
                <td>Age</td>
                <%
                    if (request.getAttribute("age")!=null){
                %>
                <td>${age}</td>
                <%
                }else{
                %>
                <td>Age Unknown!</td>
                <% } %>

            </tr>

            <tr>
                <td>ID</td>
                <td>${id}</td>
            </tr>
        </table>  
    </body>
</html>
