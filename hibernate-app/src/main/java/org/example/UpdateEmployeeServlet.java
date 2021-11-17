package org.example;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class UpdateEmployeeServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        Integer id;
        id = Integer.parseInt((request.getParameter("id")));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String gender = request.getParameter("gender");
        String country = request.getParameter("country");

      //  out.println("Employee : " + id + ", " + name + ", " + email + ", " + gender + ", " + country );

        //Preparing for an instance of employee
        Employee employee = new Employee();
        employee.setId(id);
        employee.setName(name);
        employee.setEmail(email);
        employee.setGender(gender);
        employee.setCountry(country);

        //Hibernate add employee
        HibernateUtil.updateEmployee(employee);

        RequestDispatcher rd = request.getRequestDispatcher("/index.html");
        rd.include(request,response);
        out.println("<br>Employee updated");
    }
}
