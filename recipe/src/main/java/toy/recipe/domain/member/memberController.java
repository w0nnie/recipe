package toy.recipe.domain.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class memberController {



    @Autowired(required=false)
    private memberRepository memberRepository;

    @GetMapping("/join")
    public String join(Model model){
        return "pages/join";
    }

    @GetMapping("/errors")
    public String error(Model model){
        return "pages/error";
    }

    @PostMapping("/login")
    public RedirectView login(member member, Model model){
        model.addAttribute("id",member.getId());
        RedirectView error = new RedirectView("/errors",true);
        RedirectView recipe = new RedirectView("/recipe", true);
        member = memberRepository.findById(member.getId());
        if(member == null){
            return error;
        }
            return recipe;
    }

    @PostMapping("/join")
    public String join(member member){
        memberRepository.save(member);
        return "pages/home";
    }

}
