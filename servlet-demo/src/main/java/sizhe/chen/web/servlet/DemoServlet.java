package sizhe.chen.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet 实现类，  url 映射，
 * servlet组册参考{@link sizhe.chen.ServletBootStrap}
 *
 *
 * @Author chensizhe
 * @Date 2022/9/4 12:05 PM
 */
@WebServlet(urlPatterns = "/my/servlet")
public class DemoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("hello world");
    }
}
