package co.ie12.Ie12SampleMovie.service;

import co.ie12.Ie12SampleMovie.entity.Schedule;

import java.math.BigDecimal;

/**
 * 上映料金計算サービスクラス
 */
public class CalculatePriceService {

    private PriceCalculator priceCalculator;

    /**
     * コンストラクタ
     * @param schedule 上映スケジュール
     */
    public CalculatePriceService(Schedule schedule){
        priceCalculator =  PriceCalculatorFactory.create(schedule);
    }

    public BigDecimal calculatePrice(){
        return priceCalculator.calculatePrice();
    }
}
