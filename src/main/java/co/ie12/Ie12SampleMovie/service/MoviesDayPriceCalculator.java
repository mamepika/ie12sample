package co.ie12.Ie12SampleMovie.service;

import java.math.BigDecimal;

/**
 * 映画の日用の料金計算
 */
public class MoviesDayPriceCalculator implements  PriceCalculator {

    @Override
    public BigDecimal calculatePrice() {
        return new BigDecimal(1000);
    }
}
