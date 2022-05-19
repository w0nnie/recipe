package toy.recipe.domain.recipe;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class recipeExplorer {
    public static void main(String args[]){

        String key = "7b0f637834474efcaae1";

        String result = "";

        try {

            URL url = new URL("http://openapi.foodsafetykorea.go.kr/api/" + key + "/COOKRCP01/json/1/1");

            BufferedReader bf;

            bf = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));

            result = bf.readLine();

            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject)jsonParser.parse(result);
            System.out.println("여기" + result);

        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}