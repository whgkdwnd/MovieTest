package studiopractice.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import studiopractice.demo.model.MovieVO;
import studiopractice.demo.repository.MovieRepository;

@RestController
public class PutController {
    @Autowired
    private MovieRepository movieRepository;
    @PutMapping("/{id}/delete")
    public void deleteMovie(@PathVariable("id") long id){
        MovieVO save = movieRepository.findById(id).orElseThrow();
        save.setIsDelete(1);
        movieRepository.save(save);
    }

}
