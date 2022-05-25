package toy.recipe.domain.recipe;


import com.fasterxml.jackson.annotation.JsonAlias;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;


@Controller
public class recipeController {

    @Autowired
    recipeRepository recipeRepository;

    @GetMapping("/api")
    public String recipe() throws IOException{

        String key = "7b0f637834474efcaae1";

        String result = "";

        try {

            URL url = new URL("http://openapi.foodsafetykorea.go.kr/api/" + key + "/COOKRCP01/json/1/1000");

            BufferedReader bf;

            bf = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));

            result = bf.readLine();

            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject)jsonParser.parse(result);
            JSONObject COOKRCP01 = (JSONObject)jsonObject.get("COOKRCP01");
            String totalCount = (String)COOKRCP01.get("total_count");

            JSONObject subResult = (JSONObject)COOKRCP01.get("RESULT");
            JSONArray infoArr = (JSONArray) COOKRCP01.get("row");

            for(int i=0; i < infoArr.size(); i++){
                JSONObject tmp = (JSONObject) infoArr.get(i);
                recipe recipe = new recipe((String)tmp.get("RCP_SEQ"), (String)tmp.get("RCP_NM"), (String)tmp.get("RCP_WAY2"), (String)tmp.get("RCP_PAT2"), (String)tmp.get("INFO_WGT"),
                        (String)tmp.get("INFO_ENG"), (String)tmp.get("INFO_CAR"), (String)tmp.get("INFO_PRO"), (String)tmp.get("INFO_FAT"), (String)tmp.get("INFO_NA"),
                        (String)tmp.get("HASH_TAG"), (String)tmp.get("ATT_FILE_NO_MAIN"), (String)tmp.get("ATT_FILE_NO_MK"), (String)tmp.get("RCP_PARTS_DTLS"), (String)tmp.get("MANUAL01"),
                        (String)tmp.get("MANUAL_IMG01"), (String)tmp.get("MANUAL02"), (String)tmp.get("MANUAL_IMG02"), (String)tmp.get("MANUAL03"), (String)tmp.get("MANUAL_IMG03"),
                        (String)tmp.get("MANUAL04"), (String)tmp.get("MANUAL_IMG04"), (String)tmp.get("MANUAL05"), (String)tmp.get("MANUAL_IMG05"), (String)tmp.get("MANUAL06"),
                        (String)tmp.get("MANUAL_IMG06"), (String)tmp.get("MANUAL07"), (String)tmp.get("MANUAL_IMG07"), (String)tmp.get("MANUAL08"), (String)tmp.get("MANUAL_IMG08"),
                        (String)tmp.get("MANUAL09"), (String)tmp.get("MANUAL_IMG09"), (String)tmp.get("MANUAL10"), (String)tmp.get("MANUAL_IMG10"), (String)tmp.get("MANUAL11"),
                        (String)tmp.get("MANUAL_IMG11"), (String)tmp.get("MANUAL12"), (String)tmp.get("MANUAL_IMG12"), (String)tmp.get("MANUAL13"), (String)tmp.get("MANUAL_IMG13"),
                        (String)tmp.get("MANUAL14"), (String)tmp.get("MANUAL_IMG14"), (String)tmp.get("MANUAL15"), (String)tmp.get("MANUAL_IMG15"), (String)tmp.get("MANUAL16"),
                        (String)tmp.get("MANUAL_IMG16"), (String)tmp.get("MANUAL17"), (String)tmp.get("MANUAL_IMG17"), (String)tmp.get("MANUAL18"), (String)tmp.get("MANUAL_IMG18"),
                        (String)tmp.get("MANUAL19"), (String)tmp.get("MANUAL_IMG19"), (String)tmp.get("MANUAL20"), (String)tmp.get("MANUAL_IMG20"));
                recipeRepository.save(recipe);
            }



        }catch(Exception e) {
            e.printStackTrace();
        }

        return "pages/home";
    }

    @GetMapping("/recipe")
    public String list(Model model, @PageableDefault(size = 20) Pageable pageable){

        Page<recipe> recipe = null;
//        List<recipe> recipe1 = null;
        recipe = recipeRepository.findAll(pageable);
//        recipe1 =  recipeRepository.findAll();
        model.addAttribute("recipe",recipe);
//        model.addAttribute("recipe1",recipe1);

        return "pages/main";
    }
}
