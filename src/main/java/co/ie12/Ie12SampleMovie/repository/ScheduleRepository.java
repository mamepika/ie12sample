package co.ie12.Ie12SampleMovie.repository;

import co.ie12.Ie12SampleMovie.entity.Schedule;
import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import java.time.LocalDate;
import java.util.List;

@Dao
@ConfigAutowireable
public interface ScheduleRepository {

    @Select
    List<Schedule> findByShowDay(LocalDate date);


    @Select
    List<Schedule> findAll();

    @Select
    Schedule findById(Integer id);
}
