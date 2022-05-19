package toy.recipe.domain.recipe;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;


@Controller
public class recipeController {

    @GetMapping("/recipe")
    public String recipe() throws IOException{

        recipeExplorer recipeExplorer = new recipeExplorer();
        System.out.println("여기" +recipeExplorer);
        return "pages/home";
    }
}
