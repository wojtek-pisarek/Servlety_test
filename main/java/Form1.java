import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/post1")
public class Form1 extends HttpServlet {
    // http://localhost:8080/post1
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("GET post1");
        super.getServletContext().getRequestDispatcher("/form1.html")
                .forward(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("POST post1");
        String username = request.getParameter("username");
        String lastname = request.getParameter("lastname");
        response.getWriter().println("Witaj, " + username + " " + lastname);
    }
}