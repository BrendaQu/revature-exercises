package org.example;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class AddEmployeeServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        //getting the value from query string
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String gender = request.getParameter("gender");
        String country = request.getParameter("country");
        out.println("Record saved successfully </br>");
       // out.println("Employee :" + name + ", " + email + ", " + gender + ", " + country );

        //Preparing for an instance of employee
        Employee employee = new Employee();
        employee.setName(name);
        employee.setEmail(email);
        employee.setGender(gender);
        employee.setCountry(country);
        System.out.println(employee.getGender());

        //Hibernate add employee
        HibernateUtil.addEmployee(employee);

      /*  HttpSession session = request.getSession();
        session.setAttribute("uname", name);
        session.setAttribute("uemail", email);
        session.setAttribute("ugender", gender);
        session.setAttribute("ucountry", country);*/


        RequestDispatcher rd = request.getRequestDispatcher("/index.html");
        rd.include(request,response);

       // out.println("<a href ='SavedServlet'>Click Here</a>");
        out.close();
    }
}
