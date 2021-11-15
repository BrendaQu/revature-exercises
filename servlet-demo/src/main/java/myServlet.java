import javax.servlet.Servlet;
import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class myServlet implements Servlet {
    ServletConfig config = null;


    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        this.config = servletConfig;
        System.out.println("Servlet is initialized");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("servicing...");
        servletResponse.setContentType("text/html");
        PrintWriter pw = servletResponse.getWriter();
        pw.print("<html><body>");
        pw.print("<h1>Welcome to servlet</h1>");
        pw.print("</body></html>");

    }

    @Override
    public void destroy() {
        System.out.println("Servlet is destroyed");
    }

    @Override
    public String getServletInfo() {
        return "this servlet created by admin";
    }

    @Override
    public ServletConfig getServletConfig() {
        return this.config;
    }


}
