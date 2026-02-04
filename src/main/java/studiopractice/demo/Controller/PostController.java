package studiopractice.demo.Controller;

import org.springframework.web.bind.annotation.*;
import studiopractice.demo.model.MovieVO;

@RestController
public class PostController {
    //영화 등록
    @PostMapping("/AddMovie")
    public MovieVO postMapping(@RequestBody MovieVO movieVO){
        MovieVO movieV0 = form.toEntity();
    }

}
