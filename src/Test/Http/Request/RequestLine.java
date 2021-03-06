package Test.Http.Request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author FIRCC
 * @version 1.0
 * @date 2020/2/1 0001 下午 08:47
 */

@WebServlet("/Http/RequestLine")
public class RequestLine extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String method = req.getMethod();
        System.out.println("请求方法："+method);
        String servletPath = req.getServletPath();
        System.out.println("虚拟目录："+servletPath);
        String requestURI = req.getRequestURI();
        StringBuffer requestURL = req.getRequestURL();
        System.out.println("URI:"+requestURI);
        System.out.println("URL:"+requestURL);
    }
}
