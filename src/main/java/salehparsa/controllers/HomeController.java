package salehparsa.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by saleh on 9/2/16.
 */
@Controller
public class HomeController {
    /**
     * The Following code defines a Spring Web MVC controller and defines an action that handles HTTP GET requests for the root URL of the project “/“.
     * When someone opens http://localhost:8080/ form a Web browser, the above action will be called.
     * It returns the “index” view and this means to render a Thymeleaf template “index.html” located in the file src/main/resources/templates/index.html.
     */
    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
