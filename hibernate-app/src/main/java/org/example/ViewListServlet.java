package org.example;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class ViewListServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        RequestDispatcher rd = request.getRequestDispatcher("/navbar.html");
        rd.include(request,response);

        out.print("<h1>Employee List </h1>");
        List<Employee> employees = HibernateUtil.getAllEmployees();
        for(Employee employee: employees){
            out.print("Employee: " + employee.getId() + ", " + employee.getName()+ ", " + employee.getEmail() + ", " + employee.getGender() + ", " + employee.getCountry() + "</br>");
        }
      // out.println("Employees: " + employees);
      //  out.println("<p>test</p>");
    }
}
