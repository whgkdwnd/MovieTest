package studiopractice.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import studiopractice.demo.model.MovieVO;
import studiopractice.demo.repository.MovieRepository;

@RestController
public class PostController {
    @Autowired
    private MovieRepository movieRepository;
    //영화 등록
    @PostMapping("/AddMovie")
    public MovieVO postMapping(@RequestBody MovieVO movieVO){
        MovieVO saved = movieRepository.save(movieVO);
        return saved;
    }

}
