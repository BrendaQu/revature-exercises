import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Registration extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<head>"
                + "<title>Registration Complete</title>\n" +
                "<meta charset='utf-8'>\n" +
                "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n" +
                "<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">"+
                "</head");

        String name = request.getParameter("user_name");
        String email = request.getParameter("user_email");
        String id = request.getParameter("user_id");
        String pass = request.getParameter("user_password");
        String country = request.getParameter("user_country");
        String gender = request.getParameter("user_gender");
        String lang[] = request.getParameterValues("user_language");
        String about = request.getParameter("user_about");

        //array to string
        String lang_str = String.join(", ", lang);

      //  out.println("Hello " + name + ", my email is " + email + ", my id:  " + id + ", pass: " + pass + ", country: " + country + ", gender: " + gender + ", language  " + lang + ", about: " + about);

        out.println("<body>" +
                "<h1 style='text-align: center;'>Welcome to Register Servlet</h1>" +
                    "<table class='table table-bordered table-hover' style='width: 50%; margin: auto;'> " +
                        "<tr> " +
                            "<th > Name </th>" +
                            "<td >" + name + "</td>" +
                        "</tr>" +
                        "<tr> " +
                            "<th> Email </th>" +
                            "<td>" + email + "</td>" +
                        "</tr>" +
                        "<tr> " +
                            "<th> User Id </th>" +
                            "<td>" + id + "</td>" +
                        "</tr>" +
                        "<tr> " +
                            "<th> Password </th>" +
                            "<td>" + pass + "</td>" +
                        "</tr>" +
                        "<tr> " +
                            "<th> Country </th>" +
                            "<td>" + country + "</td>" +
                        "</tr>" +
                        "<tr> " +
                            "<th> Gender </th>" +
                            "<td>" + gender + "</td>" +
                        "</tr>" +
                        "<tr> " +
                            "<th> Language </th>" +
                            "<td>" + lang_str + "</td>" +
                        "</tr>" +
                        "<tr> " +
                            "<th> About </th>" +
                            "<td>" + about + "</td>" +
                        "</tr>" +
                    "</table>" +
                "    <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n" +
                        "    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n" +
                        "    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>" +
                    "</body>");

    }

}

