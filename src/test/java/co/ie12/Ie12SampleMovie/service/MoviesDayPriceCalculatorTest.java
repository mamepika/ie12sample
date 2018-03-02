package co.ie12.Ie12SampleMovie.service;

import org.junit.Test;

import java.math.BigDecimal;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;


public class MoviesDayPriceCalculatorTest {


    @Test
    public void 映画の日の上映料金が1000円であること(){
        MoviesDayPriceCalculator priceCalculator = new MoviesDayPriceCalculator();
        assertThat(priceCalculator.calculatePrice(),is(new BigDecimal(1000)));
    }
}
