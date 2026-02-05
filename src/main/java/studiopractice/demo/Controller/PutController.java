package studiopractice.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import studiopractice.demo.model.MovieVO;
import studiopractice.demo.model.MovieVOForEdit;
import studiopractice.demo.repository.MovieRepository;

import java.util.Objects;

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

    @PutMapping("/{id}/edit")
    public void editMovie(@PathVariable("id") long id, @RequestBody MovieVOForEdit movie){
        MovieVO save = movieRepository.findById(id).orElseThrow();
        if(!Objects.equals(movie.getGenre(), "")){save.setGenre(movie.getGenre());}
        if(!Objects.equals(movie.getName(), "")){save.setName(movie.getName());}
        if(movie.getIsOpen() != 0){save.setIsOpen(movie.getIsOpen());}
        if(movie.getOpenDate() != 0){save.setOpenDate(movie.getOpenDate());}
        if(movie.getEndDate() != 0){save.setEndDate(movie.getEndDate());}
        movieRepository.save(save);
    }
}
