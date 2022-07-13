package toy.recipe.domain.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class memberController {



    @Autowired
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
    public RedirectView login(@RequestParam String id,@RequestParam String password, Model model){
        member member;
        RedirectView error = new RedirectView("/errors",true);
        RedirectView recipe = new RedirectView("/recipe/main", true);
        member = memberRepository.findByIdAndPassword(id, password);
        if(member == null){
            return error;
        }
            return recipe;
    }

    @PostMapping("/idCheck")
    @ResponseBody
    public int idCheck(@RequestParam String id){

        member member  = memberRepository.findById(id);
        int cnt;
        if(member == null){
            cnt = 0;
        }else {
            cnt = 1;
        }
        return cnt;
    }

    @PostMapping("/join")
    public String join(member member){
        memberRepository.save(member);
        return "pages/home";
    }
}
