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
    public ResponseEntity<CommonResponse<List<member>>> findAll() {

        return new ResponseEntity<>(new CommonResponse<>(HttpStatus.OK.value(), memberRepository.findAll()),HttpStatus.OK);
    }

    @GetMapping("/member/{id}") //http://localhost:8080/api/member/admin
    public ResponseEntity<? extends CommonDto> findById(@PathVariable String id){
        member member = memberRepository.findById(id);

        if(member == null){
            return ResponseEntity.status(HttpStatus.OK).body(new ErrorResponseDto(HttpStatus.OK.value(), "일치하는 회원정보가 없습니다."));
        } else {
            return new ResponseEntity<>(new CommonResponse<>(HttpStatus.OK.value(), member),HttpStatus.OK);
        }

    }

    @GetMapping("/member/{id}/{password}") //http://localhost:8080/api/member/admin/1
    public ResponseEntity<? extends CommonDto> findById(@PathVariable String id, @PathVariable int password){

        member member = memberRepository.findByIdAndPassword(id,password);
        if(member == null){
            return ResponseEntity.status(HttpStatus.OK).body(new ErrorResponseDto(HttpStatus.OK.value(), "로그인 실패"));
        } else {
            return new ResponseEntity<>(new CommonResponse<>(HttpStatus.OK.value(), member),HttpStatus.OK);
        }
    }

    @PostMapping("/member") //http://localhost:8080/api/member
    // application/json
    public ResponseEntity<? extends CommonDto> save(@RequestBody member member){
        memberRepository.save(member);

        return new ResponseEntity<>(new CommonResponse<>(HttpStatus.CREATED.value(), "Success"),HttpStatus.OK);
    }

    @PatchMapping("/member/{id}/{password}") // TODO: 2022/07/04
    public ResponseEntity<? extends CommonDto> update(@PathVariable String id, @PathVariable int password){

        member member = memberRepository.findById(id);

        if(member == null){
            return ResponseEntity.status(HttpStatus.OK).body(new ErrorResponseDto(HttpStatus.OK.value(), "회원정보 업데이트 실패"));
        } else {
            member.setId(id);
            member.setPassword(password);
            memberRepository.save(member);
            return new ResponseEntity<>(new CommonResponse<>(HttpStatus.CREATED.value(), "Success"),HttpStatus.CREATED);
        }
    }
}
