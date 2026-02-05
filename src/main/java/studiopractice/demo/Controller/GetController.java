package studiopractice.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import studiopractice.demo.model.MovieVO;
import studiopractice.demo.repository.MovieRepository;

import java.util.Comparator;
import java.util.List;

@RestController
public class GetController {
    @Autowired
    private MovieRepository movieRepository;

    @RequestMapping("/MovieList")
    public List<MovieVO> getMovieList(
            @RequestParam(required = false) String gerne,
            @RequestParam(required = false) Integer is_open) {
        List<MovieVO> movievo;
        if(gerne == null && is_open == null){
            movievo = movieRepository.findByIsDelete(0);
        }
        else if(gerne == null && is_open != null){
            movievo = movieRepository.findByIsOpen(is_open,0);
        }
        else if(gerne != null && is_open == null){
            movievo = movieRepository.findByGenre(gerne,0);
        }
        else{
            movievo = movieRepository.findByGenreAndIsOpen(gerne, is_open,0);
        }
        movievo.sort(Comparator.comparing(MovieVO::getOpenDate));
        return movievo;
    }
}
