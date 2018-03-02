package co.ie12.Ie12SampleMovie.service;

import java.math.BigDecimal;

/**
 * レイトショーの上映料金計算クラス
 */
public class LateShowPriceCalculator implements  PriceCalculator{

    @Override
    public BigDecimal calculatePrice() {
        return new BigDecimal(1000);
    }
}
