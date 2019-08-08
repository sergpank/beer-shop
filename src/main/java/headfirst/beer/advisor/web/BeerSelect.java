package headfirst.beer.advisor.web;

import headfirst.beer.advisor.model.BeerExpert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@Component
public class BeerSelect extends HttpServlet
{
  @Autowired
  private BeerExpert beerExpert = new BeerExpert();

  public void init(ServletConfig config) throws ServletException
  {
    super.init(config);
    SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this, config.getServletContext());
  }

  public void doPost(HttpServletRequest request, HttpServletResponse response)
  throws IOException, ServletException
  {
    response.setContentType("text/html");

    String color = request.getParameter("color");
    List<String> brands = beerExpert.getBrands(color);

    PrintWriter out = response.getWriter();
    out.println("Beer Selection Advice<br>");
    out.println("<br>Got beer color : " + color);
    brands.forEach(b -> out.println("<br>TRY : " + b));

//    request.setAttribute("styles", brands);
//    RequestDispatcher view = request.getRequestDispatcher("result.jsp");
//    view.forward(request, response);
  }
}
