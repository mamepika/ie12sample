package co.ie12.Ie12SampleMovie.repository;

import co.ie12.Ie12SampleMovie.entity.Movie;
import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import java.util.List;

@Dao
@ConfigAutowireable
public interface MovieRepository {

    @Select
     List<Movie> findAll();


    Movie findById();
}
