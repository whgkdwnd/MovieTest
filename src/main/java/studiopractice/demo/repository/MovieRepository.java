package studiopractice.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import studiopractice.demo.model.MovieVO;

import java.util.List;

public interface MovieRepository extends JpaRepository<MovieVO, Long> {
    List<MovieVO> findByGenre(String genre, int isDelete);
    List<MovieVO> findByIsOpen(int isOpen, int isDelete);
    List<MovieVO> findByGenreAndIsOpen(String genre, int isOpen, int isDelete);
    List<MovieVO> findByIsDelete(int isDelete);
}
