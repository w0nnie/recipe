package toy.recipe.domain.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import toy.recipe.domain.member.member;
import toy.recipe.domain.member.memberRepository;
import toy.recipe.domain.recipe.recipe;
import toy.recipe.domain.recipe.recipeRepository;

import java.util.List;

@RestController
@RequestMapping("/api")
public class restController {


    @Autowired
    private memberRepository memberRepository;

    @Autowired
    private recipeRepository recipeRepository;



    @GetMapping("/member")
    public ResponseEntity<CommonResponse<List<member>>> findAllMember() {

        return new ResponseEntity<>(new CommonResponse<>(HttpStatus.OK.value(), memberRepository.findAll()),HttpStatus.OK);
    }

    @GetMapping("/member/{id}") //http://localhost:8080/api/member/admin
    public ResponseEntity<? extends CommonDto> findById(@PathVariable String id){
        member member = memberRepository.findById(id);

        if(member == null){
            return ResponseEntity.status(HttpStatus.OK).body(new ErrorResponse(HttpStatus.OK.value(), "일치하는 회원정보가 없습니다."));
        } else {
            return new ResponseEntity<>(new CommonResponse<>(HttpStatus.OK.value(), member),HttpStatus.OK);
        }

    }

    @GetMapping("/member/{id}/{password}") //http://localhost:8080/api/member/admin/1
    public ResponseEntity<? extends CommonDto> findById(@PathVariable String id, @PathVariable int password){

        member member = memberRepository.findByIdAndPassword(id,password);
        if(member == null){
            return ResponseEntity.status(HttpStatus.OK).body(new ErrorResponse(HttpStatus.OK.value(), "로그인 실패"));
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

    @PatchMapping("/member/{id}/{password}")
    public ResponseEntity<? extends CommonDto> update(@PathVariable String id, @PathVariable int password){

        member member = memberRepository.findById(id);

        if(member == null){
            return ResponseEntity.status(HttpStatus.OK).body(new ErrorResponse(HttpStatus.OK.value(), "회원정보 업데이트 실패"));
        } else {
            member.setId(id);
            member.setPassword(password);
            memberRepository.save(member);
            return new ResponseEntity<>(new CommonResponse<>(HttpStatus.CREATED.value(), "Success"),HttpStatus.CREATED);
        }
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @GetMapping("/recipe") //http://localhost:8080/api/recipe
    public ResponseEntity<CommonResponse<List<recipe>>> findAllRecipe() {

        return new ResponseEntity<>(new CommonResponse<>(HttpStatus.OK.value(), recipeRepository.findAll()),HttpStatus.OK);
    }

    @GetMapping("/recipe/{rcpName}") //http://localhost:8080/api/recipe/rcpName
    public ResponseEntity<? extends CommonDto> findByRcpName(@PathVariable String rcpName){
        recipe recipe = recipeRepository.findByRcpName(rcpName);

        if(recipe == null){
            return ResponseEntity.status(HttpStatus.OK).body(new ErrorResponse(HttpStatus.OK.value(), "일치하는 레시피 정보가 없습니다."));
        } else {
            return new ResponseEntity<>(new CommonResponse<>(HttpStatus.OK.value(), recipe),HttpStatus.OK);
        }

    }

    @GetMapping("/recipe/type/{RcpPat}/{InfoEng}") //http://localhost:8080/api/recipe/type/반찬/300
    public ResponseEntity<? extends CommonDto> findByRcpPatAndInfoEngLessThanEqual(@PathVariable String RcpPat, @PathVariable Float InfoEng){
        List<recipe> recipeList = recipeRepository.findByRcpPatAndInfoEngLessThanEqual(RcpPat, InfoEng);

        if(recipeList.isEmpty()){
            return ResponseEntity.status(HttpStatus.OK).body(new ErrorResponse(HttpStatus.OK.value(), "일치하는 레시피 정보가 없습니다."));
        } else {
            return new ResponseEntity<>(new CommonResponse<>(HttpStatus.OK.value(), recipeList),HttpStatus.OK);
        }
    }

    @GetMapping("/recipe/way/{rcpWay}/{infoEng}") //http://localhost:8080/api/recipe/way/끊이기/300
    public ResponseEntity<? extends CommonDto> findByRcpWayAndInfoEngLessThanEqual(@PathVariable String rcpWay, @PathVariable Float infoEng){
        List<recipe> recipeList = recipeRepository.findByRcpWayAndInfoEngLessThanEqual(rcpWay, infoEng);

        if(recipeList.isEmpty()){
            return ResponseEntity.status(HttpStatus.OK).body(new ErrorResponse(HttpStatus.OK.value(), "일치하는 레시피 정보가 없습니다."));
        } else {
            return new ResponseEntity<>(new CommonResponse<>(HttpStatus.OK.value(), recipeList),HttpStatus.OK);
        }
    }

    @GetMapping("/recipe/{rcpWay}/{rcpPat}/{infoEng}") //http://localhost:8080/api/recipe/끊이기/밥/300
    public ResponseEntity<? extends CommonDto> findByRcpWayAndRcpPatAndInfoEngLessThanEqual(@PathVariable String rcpWay, @PathVariable String rcpPat, @PathVariable Float infoEng){
        List<recipe> recipeList = recipeRepository.findByRcpWayAndRcpPatAndInfoEngLessThanEqual(rcpWay, rcpPat, infoEng);

        if(recipeList.isEmpty()){
            return ResponseEntity.status(HttpStatus.OK).body(new ErrorResponse(HttpStatus.OK.value(), "일치하는 레시피 정보가 없습니다."));
        } else {
            return new ResponseEntity<>(new CommonResponse<>(HttpStatus.OK.value(), recipeList),HttpStatus.OK);
        }
    }

    @GetMapping("/recipe/kcal/{infoEng}") //http://localhost:8080/api/recipe/kcal/300
    public ResponseEntity<? extends CommonDto> findByInfoEngLessThanEqual(@PathVariable Float infoEng){
        List<recipe> recipeList = recipeRepository.findByInfoEngLessThanEqual(infoEng);

        if(recipeList.isEmpty()){
            return ResponseEntity.status(HttpStatus.OK).body(new ErrorResponse(HttpStatus.OK.value(), "일치하는 레시피 정보가 없습니다."));
        } else {
            return new ResponseEntity<>(new CommonResponse<>(HttpStatus.OK.value(), recipeList),HttpStatus.OK);
        }
    }

    @GetMapping("/recipe/ingredient/{rcpPartsDtls}") //http://localhost:8080/api/recipe/ingredient/돼지고기
    public ResponseEntity<? extends CommonDto> findByRcpPartsDtlsContaining(@PathVariable String rcpPartsDtls){
        List<recipe> recipeList = recipeRepository.findByRcpPartsDtlsContaining(rcpPartsDtls);

        if(recipeList.isEmpty()){
            return ResponseEntity.status(HttpStatus.OK).body(new ErrorResponse(HttpStatus.OK.value(), "일치하는 레시피 정보가 없습니다."));
        } else {
            return new ResponseEntity<>(new CommonResponse<>(HttpStatus.OK.value(), recipeList),HttpStatus.OK);
        }
    }

    @GetMapping("/recipe/ingredient/{rcpPartsDtls}/{rcpPartsDtls2}") //http://localhost:8080/api/recipe/ingredient/돼지고기/배추
    public ResponseEntity<? extends CommonDto> findByRcpPartsDtlsContaining(@PathVariable String rcpPartsDtls, @PathVariable String rcpPartsDtls2){
        List<recipe> recipeList = recipeRepository.findByRcpPartsDtlsContainingAndRcpPartsDtlsContaining(rcpPartsDtls, rcpPartsDtls2);

        if(recipeList.isEmpty()){
            return ResponseEntity.status(HttpStatus.OK).body(new ErrorResponse(HttpStatus.OK.value(), "일치하는 레시피 정보가 없습니다."));
        } else {
            return new ResponseEntity<>(new CommonResponse<>(HttpStatus.OK.value(), recipeList),HttpStatus.OK);
        }
    }

    @GetMapping("/recipe/ingredient/{rcpPartsDtls}/{rcpPartsDtls2}//{rcpPartsDtls3}") //http://localhost:8080/api/recipe/ingredient/돼지고기/배추/밥
    public ResponseEntity<? extends CommonDto> findByRcpPartsDtlsContainingAndRcpPartsDtlsContainingAndRcpPartsDtlsContaining(@PathVariable String rcpPartsDtls, @PathVariable String rcpPartsDtls2, @PathVariable String rcpPartsDtls3){
        List<recipe> recipeList = recipeRepository.findByRcpPartsDtlsContainingAndRcpPartsDtlsContainingAndRcpPartsDtlsContaining(rcpPartsDtls, rcpPartsDtls2, rcpPartsDtls3);

        if(recipeList.isEmpty()){
            return ResponseEntity.status(HttpStatus.OK).body(new ErrorResponse(HttpStatus.OK.value(), "일치하는 레시피 정보가 없습니다."));
        } else {
            return new ResponseEntity<>(new CommonResponse<>(HttpStatus.OK.value(), recipeList),HttpStatus.OK);
        }
    }

    @GetMapping("/recipe/ingredient/{rcpPartsDtls}/{rcpPartsDtls2}/{rcpPartsDtls3}/{rcpPartsDtls4}") //http://localhost:8080/api/recipe/ingredient/돼지고기/배추/밥/고추
    public ResponseEntity<? extends CommonDto> findByRcpPartsDtlsContainingAndRcpPartsDtlsContainingAndRcpPartsDtlsContainingAndRcpPartsDtlsContaining(@PathVariable String rcpPartsDtls, @PathVariable String rcpPartsDtls2, @PathVariable String rcpPartsDtls3, @PathVariable String rcpPartsDtls4){
        List<recipe> recipeList = recipeRepository.findByRcpPartsDtlsContainingAndRcpPartsDtlsContainingAndRcpPartsDtlsContainingAndRcpPartsDtlsContaining(rcpPartsDtls, rcpPartsDtls2, rcpPartsDtls3, rcpPartsDtls4);

        if(recipeList.isEmpty()){
            return ResponseEntity.status(HttpStatus.OK).body(new ErrorResponse(HttpStatus.OK.value(), "일치하는 레시피 정보가 없습니다."));
        } else {
            return new ResponseEntity<>(new CommonResponse<>(HttpStatus.OK.value(), recipeList),HttpStatus.OK);
        }
    }
}
