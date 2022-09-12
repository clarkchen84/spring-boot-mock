package sizhe.chen.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * HelloWorldController
 *
 * @Author chensizhe
 * @Date 2022/9/12 3:32 PM
 */
@Controller
public class HelloWorldController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String helloWorld(){
        return "index";
    }
    @RequestMapping(value = "/jsp", method = RequestMethod.GET)
    public String jsp(Model model, @CookieValue("JSESSIONID") String sessionid, @RequestHeader("Accept-Language")String acceptLanguage){
        model.addAttribute("sessionId", sessionid);
        model.addAttribute("acceptLanguage", acceptLanguage);
        return "jspxml";
    }

    @ModelAttribute("message")
    public String message(ModelAndView attribute){
        return "jsp hello";
    }
}
