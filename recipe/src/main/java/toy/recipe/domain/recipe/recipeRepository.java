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

}
