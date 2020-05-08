import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Get1")
public class Get1 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String start = request.getParameter("start");
        String end = request.getParameter("end");
        if (start != null && end != null) {
            int intstart = Integer.parseInt(start);
            int intend = Integer.parseInt(end);
            String wynik = "";
            for (int i = intstart; i < intend; i++) {
                wynik += i;
            }
            response.getWriter().println(wynik);
        } else {
            response.getWriter().println("Brak");

        }
    }
}