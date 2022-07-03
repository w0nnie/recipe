package toy.recipe.domain.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import toy.recipe.domain.member.member;
import toy.recipe.domain.member.memberRepository;
import toy.recipe.domain.recipe.recipeRepository;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class restController {


    @Autowired
    private memberRepository memberRepository;

    @Autowired
    private recipeRepository recipeRepository;



    @GetMapping("/user")
    public List<member> findAll() {

        return memberRepository.findAll();
    }

    @GetMapping("/user/{id}") //http://localhost:8080/api/user/admin
    public member findById(@PathVariable String id){
        member member;
        member = memberRepository.findById(id);

        return member;
    }

    @GetMapping("/user/{id}/{password}") //http://localhost:8080/api/user/admin/1
    public ResponseEntity findById(@PathVariable String id, @PathVariable int password){

        member member = memberRepository.findByIdAndPassword(id,password);
        if(member == null){
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(member);
        }
    }
}
