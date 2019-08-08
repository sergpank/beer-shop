<%@ page import="headfirst.beer.advisor.model.BeerExpert" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Beer order</title>
</head>
<body>
    <%= "Hello " + request.getParameter("userName") + "<br>" %>
    <%
        Object nrOfBottles = request.getParameter("nrOfBottles");
        Object type = request.getParameter("beerType");
        String msg = String.format("You have ordered %s bottles of %s beer <br>", nrOfBottles, type);
        out.println(msg); %>
    <%
        List<String> brands = new BeerExpert().getBrands(request.getParameter("beerType"));
        out.println("You can try: <br>");
        for (String brand : brands)
        {
          out.println(brand + "<br>");
        }
    %>
</body>
</html>
