package co.ie12.Ie12SampleMovie.service;

import co.ie12.Ie12SampleMovie.entity.Schedule;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;


import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CalculatePriceServiceTest {

    @Test
    public void 上映日が各月の1日の場合上映料金が1000円であること(){
        Schedule schedule = new Schedule();
        schedule.setShowDay(LocalDate.of(2018,3,1));
        CalculatePriceService priceService = new CalculatePriceService(schedule);
        assertThat(priceService.calculatePrice(),is(new BigDecimal(1000)));
    }

    @Test
    public void 上映日が1日でない場合上映料金が1800円であること(){
        Schedule schedule = new Schedule();
        schedule.setShowDay(LocalDate.of(2018,3,2));
        CalculatePriceService priceService = new CalculatePriceService(schedule);
        assertThat(priceService.calculatePrice(),is(new BigDecimal(1800)));
    }


}
