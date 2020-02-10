package Test.Http;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * @author FIRCC
 * @version 1.0
 * @date 2020/2/1 0001 下午 08:54
 */

@WebServlet("/Http/RequestHeader")
public class RequestHeader extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Enumeration<String> headerNames = req.getHeaderNames();
        while(headerNames.hasMoreElements()){
            String name = headerNames.nextElement();
            String value = req.getHeader(name);
            System.out.println(name+" : "+value);
        }
    }
}
