package co.ie12.Ie12SampleMovie.web;

import co.ie12.Ie12SampleMovie.entity.Movie;
import co.ie12.Ie12SampleMovie.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/movies")
@ComponentScan("repository")
public class MovieController {

    @Autowired
    MovieRepository movieRepository;


    @GetMapping
    public String list(Model model){
        List<Movie>  movies = movieRepository.findAll();

        model.addAttribute("movies",movies);
        return "movies/list";
    }

}
