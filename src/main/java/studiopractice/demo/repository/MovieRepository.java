package studiopractice.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import studiopractice.demo.model.MovieVO;

public interface MovieRepository extends JpaRepository<MovieVO, Long> {
}
