package yulei.family.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName HomeController
 * @Description
 * @Author
 * @Date 2019/11/9 0009 16:31
 * @Version V1.0
 **/
@Controller
public class HomeController {
    @RequestMapping(value = "/")
    public String homePage() {
        return "login.html";
    }
}