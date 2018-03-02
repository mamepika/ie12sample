package co.ie12.Ie12SampleMovie.service;

import org.junit.Test;

import java.math.BigDecimal;


import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class DefaultPriceCalculatorTest {

    @Test
    public void デフォルトの上映料金が1800円であること(){
        DefaultPriceCalculator priceCalculator = new DefaultPriceCalculator();
        assertThat(priceCalculator.calculatePrice(),is(new BigDecimal(1800)));
    }
}
