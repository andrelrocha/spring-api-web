package rocha.andre.springapiweb.domain.Movie;

import org.springframework.stereotype.Component;

@Component
public class CreateMovieUseCase {
    private MovieRepository movieRepository;

    public CreateMovieUseCase(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Movie createMovie(CreateMovieDto data) {
        Movie newMovie = new Movie(data);

        return movieRepository.save(newMovie);
    }
}
