package Test.Http;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

/**
 * @author FIRCC
 * @version 1.0
 * @date 2020/2/2 0002 下午 10:27
 */

@WebServlet("/Http/RequestBody")
public class RequestBody extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BufferedReader br = req.getReader();

        String line = null;
        while((line = br.readLine()) != null){
            System.out.println(line);
        }
    }
}
