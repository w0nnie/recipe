package toy.recipe.domain.member;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface memberRepository extends JpaRepository<member, Long> {

    member findById(String id);
}
