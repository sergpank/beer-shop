<%@ page import="java.util.List" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%--<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>--%>
<html>
<head>
    <meta charset="UTF-8">
</head>
<body>

<h1 align="center">Beer Recommendations JSP</h1>

<p>
<%
List<String> styles = (List<String>)request.getAttribute("styles");
for (String style : styles)
{
    out.println("<br>try: " + style);
}
%>
</p>

</body>
</html>