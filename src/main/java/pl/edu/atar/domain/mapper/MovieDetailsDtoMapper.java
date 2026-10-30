package pl.edu.atar.domain.mapper;

import org.springframework.stereotype.Component;
import pl.edu.atar.domain.dto.CreateMovieDto;
import pl.edu.atar.domain.dto.MovieDetailsDto;
import pl.edu.atar.domain.entity.Movie;

@Component
public class MovieDetailsDtoMapper implements Converter<MovieDetailsDto, Movie> {

    @Override
    public MovieDetailsDto convert(Movie from) {
        return new MovieDetailsDto.Builder()
                .title(from.getTitle())
                .videoId(from.getVideoId())
                .build();
    }
}
