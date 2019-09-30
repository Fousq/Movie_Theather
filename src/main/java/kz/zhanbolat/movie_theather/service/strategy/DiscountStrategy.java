package kz.zhanbolat.movie_theather.service.strategy;

import java.math.BigDecimal;

public abstract class DiscountStrategy {
    public abstract BigDecimal calculateDiscount(int price);
}
