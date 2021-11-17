package org.example;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class DeleteEmployeeServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        Integer id;
        id = Integer.parseInt((request.getParameter("id")));
        String name = request.getParameter("name");

        //  out.println("Employee : " + id + ", " + name + ", " + email + ", " + gender + ", " + country );

        //Preparing for an instance of employee
        Employee employee = new Employee();
        employee.setId(id);
        employee.setName(name);

        //Hibernate add employee
        HibernateUtil.deleteEmployee(employee);

        RequestDispatcher rd = request.getRequestDispatcher("/delete.html");
        rd.include(request,response);
        out.println("<br>Employee deleted");
    }
}
