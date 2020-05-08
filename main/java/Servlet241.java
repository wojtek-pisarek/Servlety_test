import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

@WebServlet("/servlet241")
public class Servlet241 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Random random = new Random();
        int id = random.nextInt(8);
        response.getWriter().println(link(id));
    }

    private static String link(int id) {
        return String.format("<a href=\"/servlet242?id=%s\">Produkt o id = %s</a>", id, id);
    }
}