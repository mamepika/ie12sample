package co.ie12.Ie12SampleMovie.service;

import java.math.BigDecimal;

/**
 * 上映料金計算インタフェース
 */
public interface PriceCalculator {

    BigDecimal calculatePrice();
}
