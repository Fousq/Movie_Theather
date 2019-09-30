package kz.zhanbolat.movie_theather.service;

import kz.zhanbolat.movie_theather.entity.Event;
import kz.zhanbolat.movie_theather.entity.User;
import kz.zhanbolat.movie_theather.service.strategy.DiscountStrategy;

import java.util.Date;

/**
 * Counts different discounts for purchased tickets.
 * Main functions: getDiscount(user, event, dateTime, numberOfTickets) -
 * returns total discount (from 0 to 100) that can be applied to the user buying specified number of tickets
 * for specific event and air dateTime;
 * DiscountStrategy - single class with logic for calculating discount
 *             Birthday strategy - give 5% if user has birthday within 5 days of air date
 *                Every 10th ticket - give 50% for every 10th ticket purchased by user.
 *                  This strategy can also be applied for not-registered users if 10 or more tickets are bought
 * All discount strategies should be injected as list into the DiscountService.
 * The getDiscount method will execute each strategy to get max available discount.
 * Discounts should not add up. So, if one strategy returns 20% and another 30%,
 * final discount would be 30%.
 * Requirements: Define DiscountService with all strategies as separate beans in separate XML configuration.
 */
public class DiscountService {
    private DiscountStrategy strategy;

    public DiscountService(DiscountStrategy strategy) {
        this.strategy = strategy;
    }

    public int getDiscount(User user, Event event, Date date,
                           int ticketsNumber) {
        return -1;
    }
}
