import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet", urlPatterns = "/Calculate")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String Product = request.getParameter("Product");
        float Price = Float.parseFloat(request.getParameter("Price"));
        float Discount = Float.parseFloat(request.getParameter("Discount"));
        double result = Price - Price * Discount * 0.01;
        PrintWriter writer = response.getWriter();
        writer.println("<html><head>\n" +
                "    <title>$Title$</title>\n" +
                "    <style type=\"text/css\">\n" +
                "        #content {\n" +
                "            width: 450px;\n" +
                "            margin: 0 auto;\n" +
                "            padding: 0px 20px 20px;\n" +
                "            background: white;\n" +
                "            border: 2px solid navy;\n" +
                "        }\n" +
                "\n" +
                "        h2 {\n" +
                "            color: navy;\n" +
                "        }\n" +
                "\n" +
                "        label {\n" +
                "            width: 10em;\n" +
                "            padding-right: 1em;\n" +
                "            float: left;\n" +
                "        }\n" +
                "\n" +
                "        br {\n" +
                "            clear: left;\n" +
                "        }\n" +
                "    </style>\n" +
                "</head><div id=\"content\">\n" +
                "\n" +
                "\n" +
                "    <h2> Product Discount Calculator </h2>\n" +
                "        <label>Product</label>\n" +
                "        <div id=\"Product\">\n"+
                "            " + Product + "</br>" +
                "            <label>List Price</label>\n" +
                "            " + Price + "</br>" +
                "            <label>Discount Percent</label>\n" +
                "            " + Discount + "</br>" +
                "            <label>Result;</label>\n" +
                "           " + result + "</br>" +
                "        </div>\n" +
                "    </form>\n" +
                "\n" +
                "\n" +
                "</div>");
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
