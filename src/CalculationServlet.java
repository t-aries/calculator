import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculationServlet", urlPatterns = {"/calculation"})
public class CalculationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float value1 = Float.parseFloat(request.getParameter("gt1"));
        float value2 = Float.parseFloat(request.getParameter("gt2"));
        char operato = request.getParameter("operator").charAt(0);
        float result;
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Result</h1>");
        try{
            result = Calculator.Calculate(value1,value2,operato);
            writer.println(value1 +" "+ operato +" "+ value2 + " = " + result);
        }
        catch (Exception e){
            writer.println("Erro:" + e.getMessage());
        };
        writer.println("</html>");
    }
}
