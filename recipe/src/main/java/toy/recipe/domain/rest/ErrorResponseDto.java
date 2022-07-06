package toy.recipe.domain.rest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResponseDto extends CommonDto {

    private int statusCode;
    private  String errorMessage;
}
