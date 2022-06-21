package toy.recipe.domain.recipe;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import toy.recipe.domain.member.member;

import java.util.List;

@Repository
public interface recipeRepository extends JpaRepository<recipe, Long> {


    List<recipe> findAll();

    recipe findByRcpName(String name);

    List<recipe> findByRcpPatAndInfoEngLessThanEqual(String type, Float kcal, Pageable pageable);

    List<recipe> findByRcpWayAndInfoEngLessThanEqual(String way, Float kcal, Pageable pageable);

    List<recipe> findByRcpWayAndRcpPatAndInfoEngLessThanEqual(String way, String type, Float kcal, Pageable pageable);

    List<recipe> findByInfoEngLessThanEqual(Float kcal, Pageable pageable);

    List<recipe> findByRcpPartsDtlsContaining(String value, Pageable pageable);

    @Query(nativeQuery = true,
            value = "SELECT *\n" +
                    "FROM recipe\n" +
                    "WHERE RCP_PARTS_DTLS LIKE %?1%\n" +
                    "AND RCP_PARTS_DTLS LIKE %?2%\n" +
                    "ORDER BY RCP_SEQ")
    List<recipe> findByIngredients(String value1, String value2, Pageable pageable);

    @Query(nativeQuery = true,
            value = "SELECT *\n" +
                    "FROM recipe\n" +
                    "WHERE RCP_PARTS_DTLS LIKE %?1%\n" +
                    "AND RCP_PARTS_DTLS LIKE %?2%\n" +
                    "AND RCP_PARTS_DTLS LIKE %?3%\n" +
                    "ORDER BY RCP_SEQ")
    List<recipe> findByIngredient3(String value1, String value2, String value3, Pageable pageable);
}
