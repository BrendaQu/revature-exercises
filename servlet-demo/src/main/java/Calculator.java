import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Calculator extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<head>"
                + "<title>Calculator Result Servlet</title>\n" +
                "<meta charset='utf-8'>\n" +
                "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n" +
                "<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">"+
                "</head");
        out.println("<body > " +
                "<h1 class=\"row justify-content-center\">Calculator</h1>");

        String s_f_num =  request.getParameter("first_num");
        String s_s_num = request.getParameter("second_num");
        String op = request.getParameter("operation");

        float f_num = Integer.parseInt(s_f_num);
        float s_num = Integer.parseInt(s_s_num);
        float result = 0;
        if(op.equals("+")){
            result = f_num + s_num;
        } else if (op.equals("-")) {
            result = f_num - s_num;
        } else if (op.equals("*")){
            result = f_num * s_num;
        } else if (op.equals("/")) {
            result = f_num / s_num;
        } else {
            out.println("Not a valid operation" + result);
        }

        //"<h4 class=\"row justify-content-center\" style='font-weight: normal;'>" + f_num + " " + op + " " + s_num + " = " + result + "</h4>"
        out.println("  <form class=\"row justify-content-center\" action=\"calculator\" method=\"post\">\n" +
                "      <table>\n" +
                "          <tr>\n" +
                "              <td>Enter First Number: </td>\n" +
                "              <td><input class=\"form-control\" type=\"text\" name=\"first_num\" value='" + s_f_num + "'> </td>\n" +
                "          </tr>\n" +
                "          <tr>\n" +
                "              <td>Enter Second Number: </td>\n" +
                "              <td><input class=\"form-control\" type=\"text\" name=\"second_num\" value='" + s_s_num +"'> </td>\n" +
                "          </tr>\n" +
                "          <tr>\n" +
                "              <td>Operation:  </td>\n" +
                "              <td>\n" +
                "                  <div class=\"custom-control custom-radio custom-control-inline\">\n" +
                "                      <input class=\"custom-control-input\" type=\"radio\" id=\"add\" name=\"operation\" value=\"+\">\n" +
                "                      <label class=\"custom-control-label\" for=\"add\">+</label>\n" +
                "                  </div>\n" +
                "                  <div class=\"custom-control custom-radio custom-control-inline\">\n" +
                "                      <input class=\"custom-control-input\" type=\"radio\" id=\"minus\" name=\"operation\" value=\"-\">\n" +
                "                      <label class=\"custom-control-label\" for=\"minus\">-</label>\n" +
                "                  </div>\n" +
                "                  <div class=\"custom-control custom-radio custom-control-inline\">\n" +
                "                      <input class=\"custom-control-input\" type=\"radio\" id=\"multiply\" name=\"operation\" value=\"*\">\n" +
                "                      <label class=\"custom-control-label\" for=\"multiply\">*</label>\n" +
                "                  </div>\n" +
                "                  <div class=\"custom-control custom-radio custom-control-inline\">\n" +
                "                      <input class=\"custom-control-input\" type=\"radio\" id=\"divide\" name=\"operation\" value=\"/\">\n" +
                "                      <label class=\"custom-control-label\" for=\"divide\">/</label>\n" +
                "                  </div>\n" +
                "              </td>\n" +
                "          </tr>\n" +
                "          <tr>\n" +
                "              <td>Enter Operation:  </td>\n" +
                "              <td colspan=\"2\"><input class=\"btn btn-primary btn-block\" type=\"submit\" value=\"Enter\"></td>\n" +
                "          </tr>\n" +
                "          <tr>\n" +
                "              <td>Answer: </td>\n" +
                "              <td><input class=\"form-control\" type=\"text\" name=\"result\" value='" +result +"'> </td>\n" +
                "          </tr>\n" +
                "      </table>\n" +
                "  </form>"+
                "    <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n" +
                "    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n" +
                "    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>" +
                "</body>");

    }
}
