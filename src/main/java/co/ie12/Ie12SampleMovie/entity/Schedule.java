package co.ie12.Ie12SampleMovie.entity;

import lombok.Data;
import org.seasar.doma.Entity;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Id;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Data
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer scheduleId;

    private Integer movieId;

    private String title;

    private String director;

    private LocalDate showDay;

    private LocalTime startTime;

    private LocalTime endTime;

    private Integer theaterId;


}
