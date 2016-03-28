import org.junit.Assert;
import org.springframework.web.servlet.ModelAndView;
import springapp.controller.HelloController;
import springapp.controller.IndexController;

import javax.servlet.ServletException;
import java.io.IOException;

/**
 * Created by Gvozd on 25.03.2016.
 */

public class ServletTest {

    @org.junit.Test
    public void tesingHello() throws ServletException, IOException {
        HelloController controller = new HelloController();
        ModelAndView modelAndView = controller.handleRequest(null, null);
        Assert.assertEquals("hello",modelAndView.getViewName());
    }

    @org.junit.Test
    public void tesingIndex() throws ServletException, IOException {
        IndexController controller = new IndexController();
        ModelAndView modelAndView = controller.handleRequest(null, null);
        Assert.assertEquals("index",modelAndView.getViewName());
    }
}
