package toy.recipe.domain.home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homeController {
    @GetMapping("hello")
    public String hello(Model model){
        return "hello";
    }
}
