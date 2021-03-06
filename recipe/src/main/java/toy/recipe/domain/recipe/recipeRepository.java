package toy.recipe.domain.recipe;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import toy.recipe.domain.member.member;

import java.util.List;

@Repository
public interface recipeRepository extends JpaRepository<recipe, Long>, JpaSpecificationExecutor<recipe>  {


    List<recipe> findAll();

    recipe findByRcpName(String name);

//    @Query(nativeQuery = true,
//            value = "SELECT *\n" +
//                    "FROM recipe\n" +
//                    "WHERE RCP_NM = ?1\n" +
//                    "ORDER BY RCP_SEQ")
//    recipe findByRcpName(String name);

    List<recipe> findByRcpPatAndInfoEngLessThanEqual(String type, Float kcal);

//    @Query(nativeQuery = true,
//            value = "SELECT *\n" +
//                    "FROM recipe\n"+
//                    "WHERE RCP_PAT2 = ?1\n" +
//                    "AND INFO_ENG <= ?2\n" +
//                    "ORDER BY RCP_SEQ")
//    List<recipe> findByRcpPatAndInfoEngLessThanEqual(String type, Float kcal, Pageable pageable);

    List<recipe> findByRcpWayAndInfoEngLessThanEqual(String way, Float kcal);

//    @Query(nativeQuery = true,
//            value = "SELECT *\n" +
//                    "FROM recipe\n"+
//                    "WHERE RCP_WAY2 = ?1\n" +
//                    "AND INFO_ENG <= ?2\n" +
//                    "ORDER BY RCP_SEQ")
//    List<recipe> findByRcpWayAndInfoEngLessThanEqual(String way, Float kcal, Pageable pageable);

    List<recipe> findByRcpWayAndRcpPatAndInfoEngLessThanEqual(String way, String type, Float kcal);

//    @Query(nativeQuery = true,
//            value = "SELECT *\n" +
//                    "FROM recipe\n"+
//                    "WHERE RCP_WAY2 = ?1\n" +
//                    "AND RCP_PAT2 = ?2\n" +
//                    "AND INFO_ENG <= ?3\n" +
//                    "ORDER BY RCP_SEQ")
//    List<recipe> findByRcpWayAndRcpPatAndInfoEngLessThanEqual(String way, String type, Float kcal, Pageable pageable);

    List<recipe> findByInfoEngLessThanEqual(Float kcal);

//    @Query(nativeQuery = true,
//            value = "SELECT *\n" +
//                    "FROM recipe\n" +
//                    "WHERE INFO_ENG <= ?1\n" +
//                    "ORDER BY RCP_SEQ")
//    List<recipe> findByInfoEngLessThanEqual(Float kcal, Pageable pageable);

    List<recipe> findByRcpPartsDtlsContaining(String value);

//    @Query(nativeQuery = true,
//            value = "SELECT *\n" +
//                    "FROM recipe\n" +
//                    "WHERE RCP_PARTS_DTLS LIKE %?1%\n" +
//                    "ORDER BY RCP_SEQ")
//    List<recipe> findByRcpPartsDtlsContaining(String value, Pageable pageable);

    List<recipe> findByRcpPartsDtlsContainingAndRcpPartsDtlsContaining(String value, String value2);

//    @Query(nativeQuery = true,
//            value = "SELECT *\n" +
//                    "FROM recipe\n" +
//                    "WHERE RCP_PARTS_DTLS LIKE %?1%\n" +
//                    "AND RCP_PARTS_DTLS LIKE %?2%\n" +
//                    "ORDER BY RCP_SEQ")
//    List<recipe> findByIngredients(String value1, String value2, Pageable pageable);

    List<recipe> findByRcpPartsDtlsContainingAndRcpPartsDtlsContainingAndRcpPartsDtlsContaining(String value1, String value2, String value3);

//    @Query(nativeQuery = true,
//            value = "SELECT *\n" +
//                    "FROM recipe\n" +
//                    "WHERE RCP_PARTS_DTLS LIKE %?1%\n" +
//                    "AND RCP_PARTS_DTLS LIKE %?2%\n" +
//                    "AND RCP_PARTS_DTLS LIKE %?3%\n" +
//                    "ORDER BY RCP_SEQ")
//    List<recipe> findByIngredient3(String value1, String value2, String value3, Pageable pageable);

    List<recipe> findByRcpPartsDtlsContainingAndRcpPartsDtlsContainingAndRcpPartsDtlsContainingAndRcpPartsDtlsContaining(String value1, String value2, String value3, String value4);


}
