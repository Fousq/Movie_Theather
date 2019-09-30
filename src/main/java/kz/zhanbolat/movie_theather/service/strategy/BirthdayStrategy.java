package kz.zhanbolat.movie_theather.service.strategy;

import java.math.BigDecimal;

public class BirthdayStrategy extends DiscountStrategy {
    private static final double DISCOUND = 0.05;

    @Override
    public BigDecimal calculateDiscount(int price) {
        return BigDecimal.valueOf(price * DISCOUND);
    }
}
