package Test.Http.Request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

/**
 * @author FIRCC
 * @version 1.0
 * @date 2020/2/4 0004 下午 02:29
 */

@WebServlet("/Http/RequestParameter")
public class RequestParameter extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String, String[]> parameterMap = req.getParameterMap();
        Set<String> keys = parameterMap.keySet();
        for(String s : keys){
            System.out.println("------");
            System.out.println(s);
            String[] values = parameterMap.get(s);
            for(String v : values)
                System.out.println(v);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
