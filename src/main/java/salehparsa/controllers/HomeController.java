package salehparsa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import salehparsa.models.Post;
import salehparsa.services.PostService;

import java.util.List;
import java.util.stream.Collectors;

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
    @Autowired
    private PostService postService;
    @RequestMapping("/")
    public String index(Model model) {
        List<Post> latest5Posts = postService.findLatest5();
        model.addAttribute("latest5posts", latest5Posts);
        List<Post> latest3Posts = latest5Posts.stream()
                .limit(3).collect(Collectors.toList());
        model.addAttribute("latest3posts", latest3Posts);

        return "index";
    }
}
