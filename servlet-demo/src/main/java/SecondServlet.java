import javax.servlet.GenericServlet;
import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class SecondServlet extends GenericServlet {

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Service called...");
        servletResponse.setContentType("text/html");
        PrintWriter pw = servletResponse.getWriter();
        pw.print("<html><body>");
        pw.print("<h1>Welcome to servlet - second</h1>");
        pw.print("</body></html>");
    }
}
