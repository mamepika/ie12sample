package co.ie12.Ie12SampleMovie.entity;

import org.seasar.doma.*;

@Entity
@Table(name="movies")
/**
 * 映画を表すクラス
 */
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer movieId;

    private String title;

    private String director;

    private String runnningTime;


    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getRunnningTime() {
        return runnningTime;
    }

    public void setRunnningTime(String runnningTime) {
        this.runnningTime = runnningTime;
    }
}
