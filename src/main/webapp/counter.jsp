<%--Directive--%>
<%@ page import="headfirst.beer.advisor.model.Counter" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Counter JSP</title>
</head>
<body>

<%--Scriptlet--%>
<%
out.println("Scriptlet : " + Counter.getCount() + "<br>");
//out.println("Count = " + headfirst.beer.advisor.model.Counter.getCount());
%>

<%--Expression--%>
<%=
"Expression : " + Counter.getCount() + "<br>"
%>

<%--Local Variable--%>
<% int localCounter = 0; %>
<%= "Local variable : " + (++localCounter) + "<br>" %>

<%--Declaration (instance variable)--%>
<%! int instanceCounter = 0; %>
<%= "Instance variable : " + (++instanceCounter) + "<br>" %>

<%! int doubleCount()
{
    return instanceCounter * 2;
}
%>
<%= "Double count : " + doubleCount() %>


</body>
</html>
