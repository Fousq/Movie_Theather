package kz.zhanbolat.movie_theather.service.strategy;

import java.math.BigDecimal;

public class QuantityStrategy extends DiscountStrategy {
    private static final int DISCOUNT_TICKET_QUANTITY = 10;
    private static final double DISCOUNT = 0.5;
    private int ticketQuantity;

    public QuantityStrategy(int ticketQuantity) {
        this.ticketQuantity = ticketQuantity;
    }

    public int getTicketQuantity() {
        return ticketQuantity;
    }

    public void setTicketQuantity(int ticketQuantity) {
        this.ticketQuantity = ticketQuantity;
    }

    @Override
    public BigDecimal calculateDiscount(int price) {
        if (DISCOUNT_TICKET_QUANTITY > ticketQuantity) {
            return BigDecimal.valueOf(price);
        }
        return BigDecimal.valueOf(price * DISCOUNT);
    }
}
