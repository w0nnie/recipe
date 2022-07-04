package toy.recipe.domain.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
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



    @GetMapping("/member")
    public ResponseEntity<CommonDto<List<member>>> findAll() {

        return new ResponseEntity<>(new CommonDto<>(HttpStatus.OK.value(), memberRepository.findAll()),HttpStatus.OK);
    }

    @GetMapping("/member/{id}") //http://localhost:8080/api/member/admin
    public ResponseEntity<CommonDto<member>> findById(@PathVariable String id){
        member member = memberRepository.findById(id);

        if(member == null){
            return ResponseEntity.notFound().build(); // TODO: 2022/07/04  
        } else {
            return new ResponseEntity<>(new CommonDto<>(HttpStatus.OK.value(), member),HttpStatus.OK);
        }

    }

    @GetMapping("/member/{id}/{password}") //http://localhost:8080/api/member/admin/1
    public ResponseEntity<CommonDto<member>> findById(@PathVariable String id, @PathVariable int password){

        member member = memberRepository.findByIdAndPassword(id,password);
        if(member == null){
            return ResponseEntity.notFound().build();
        } else {
            return new ResponseEntity<>(new CommonDto<>(HttpStatus.OK.value(), member),HttpStatus.OK);
        }
    }

    @PostMapping("/member") //http://localhost:8080/api/member
    // application/json
    public ResponseEntity<CommonDto<String>> save(@RequestBody member member){
        memberRepository.save(member);

        return new ResponseEntity<>(new CommonDto<>(HttpStatus.CREATED.value(), "ok"),HttpStatus.OK);
    }

    @PutMapping("/member/{id}") // TODO: 2022/07/04  
    public ResponseEntity<CommonDto<String>> update(@PathVariable String id, @PathVariable int password){

        System.out.println("여기?");

        member member = memberRepository.findById(id);

        System.out.println("여기?" + member);

        if(member == null){
            System.out.println("여기는 타냐?");
            return ResponseEntity.notFound().build();
        } else {
            member.setId(id);
            member.setPassword(password);
            System.out.println("여기"+member.getId() + "비번" + member.getPassword());
            memberRepository.save(member);
            return new ResponseEntity<>(new CommonDto<>(HttpStatus.CREATED.value(), "ok"),HttpStatus.OK);
        }
    }
}
