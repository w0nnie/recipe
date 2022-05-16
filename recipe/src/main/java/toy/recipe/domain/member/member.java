package toy.recipe.domain.member;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class member {

    @Id
    private String id;

    private int password;

    public String getId() {
        return id;
    }

    public int getPassword() {
        return password;
    }
}
