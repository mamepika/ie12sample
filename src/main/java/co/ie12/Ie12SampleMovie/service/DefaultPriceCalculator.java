package co.ie12.Ie12SampleMovie.service;

import java.math.BigDecimal;

/**
 * どの区分にも該当しない上映のデフォルト料金計算
 */
public class DefaultPriceCalculator implements PriceCalculator {
    @Override
    public BigDecimal calculatePrice() {
        return new BigDecimal(1000);
    }
}
