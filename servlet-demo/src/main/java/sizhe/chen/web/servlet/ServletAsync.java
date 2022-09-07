package sizhe.chen.web.servlet;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 异步servlet
 *
 * @Author chensizhe
 * @Date 2022/9/4 12:53 PM
 */
@WebServlet(urlPatterns = "/my/async-servlet",asyncSupported = true)
public class ServletAsync extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        AsyncContext context = req.startAsync();

        context.start(() -> {
            try {
                resp.getWriter().write("hello world");
                context.complete();

            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}
