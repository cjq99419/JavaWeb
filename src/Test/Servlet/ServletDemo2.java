package Test.Servlet;

import sun.net.www.content.text.Generic;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * @author FIRCC
 * @version 1.0
 * @date 2020/2/1 0001 下午 08:35
 */

//继承GenericServlet类，实现service方法
@WebServlet("/Servlet/demo2")
public class ServletDemo2 extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("继承GenericServlet类");
    }
}
