package toy.recipe.domain.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class memberController {



    @Autowired(required=false)
    private memberRepository memberRepository;

    @GetMapping("/join")
    public String join(Model model){
        return "pages/join";
    }

    @PostMapping("/login")
    public String login(member member,Model model){
        model.addAttribute("id",member.getId());

        member = memberRepository.findById(member.getId());
        if(member ==null){
            return "pages/error";
        }
            return "pages/main";
    }

    @PostMapping("/join")
    public String join(member member){
        memberRepository.save(member);
        return "pages/home";
    }

}
