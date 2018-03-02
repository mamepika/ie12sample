package co.ie12.Ie12SampleMovie.service;

import co.ie12.Ie12SampleMovie.entity.Schedule;

/**
 * 料金計算のファクトリークラス
 */
public class PriceCalculatorFactory {

    public static PriceCalculator create(Schedule schedule){

        if(schedule.isMoviesDay()){
            return  new MoviesDayPriceCalculator();
        }
        return  new DefaultPriceCalculator();
    }

}
