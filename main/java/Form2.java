import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/post2")
public class Form2 extends HttpServlet {
    List<String> BAD_WORDS = List.of(
            "cholera",
            "dupa"
    );
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String inputText = request.getParameter("texttocheck");
        boolean doNotCheckBadWords = Boolean.parseBoolean(request.getParameter("donotcheckbadwords"));
        if(!doNotCheckBadWords) {
            inputText = censorWords(inputText, BAD_WORDS);
        }
        response.getWriter().println(inputText);
    }
    private String censorWords(String inputText, List<String> bad_words) {
        for (String bad_word : bad_words) {
            if(inputText.contains(bad_word)) {
                inputText = inputText.replaceAll("\\b"+bad_word+"\\b", "*".repeat(bad_word.length()));
            }
        }
        return inputText;
    }
}
