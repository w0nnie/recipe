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

    Page<recipe> findAll(Pageable pageable);

    List<recipe> findAll();

    @Query(nativeQuery = true,
            value = "SELECT RCP_NM\n" +
                    "FROM recipe"
    )
    List<recipeInterface> findName();

    @Query(nativeQuery = true,
            value = "SELECT *\n" +
                    "FROM recipe\n" +
                    "WHERE RCP_NM = ?1\n" +
                    "ORDER BY RCP_SEQ")
    recipe findByName(String name);

    @Query(nativeQuery = true,
            value = "SELECT *\n" +
                    "FROM recipe\n"+
                    "WHERE RCP_PAT2 = ?1\n" +
                    "AND INFO_ENG <= ?2\n" +
                    "ORDER BY RCP_SEQ")
    Page<recipe> findByTypeKcal(String type, Float kcal, Pageable pageable);

    @Query(nativeQuery = true,
            value = "SELECT *\n" +
                    "FROM recipe\n"+
                    "WHERE RCP_WAY2 = ?1\n" +
                    "AND INFO_ENG <= ?2\n" +
                    "ORDER BY RCP_SEQ")
    Page<recipe> findByWayKcal(String way, Float kcal, Pageable pageable);

    @Query(nativeQuery = true,
            value = "SELECT *\n" +
                    "FROM recipe\n"+
                    "WHERE RCP_WAY2 = ?1\n" +
                    "AND RCP_PAT2 = ?2\n" +
                    "AND INFO_ENG <= ?3\n" +
                    "ORDER BY RCP_SEQ")
    Page<recipe> findByWayTypeKcal(String way, String type, Float kcal, Pageable pageable);

    @Query(nativeQuery = true,
            value = "SELECT *\n" +
                    "FROM recipe\n"+
                    "WHERE INFO_ENG <= ?1\n" +
                    "ORDER BY RCP_SEQ")
    Page<recipe> findByKcal(Float kcal, Pageable pageable);
}
