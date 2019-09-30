package kz.zhanbolat.movie_theather.service;

import com.sun.org.apache.xalan.internal.lib.ExsltDatetime;
import kz.zhanbolat.movie_theather.entity.Event;
import kz.zhanbolat.movie_theather.entity.Ticket;
import kz.zhanbolat.movie_theather.entity.User;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

/**
 * Manages tickets, prices, bookings.
 * Main functions: getTicketsPrice(event, dateTime, user, seats) -
 * returns total price for buying all tickets for specified event on specific date and time
 * for specified seats;
 * bookTicket(tickets) - Ticket should contain information about event,
 * air dateTime, seat, and user. The user could be registered or not.
 * If user is registered, then booking information is stored for that user (in the tickets collection).
 * Purchased tickets for particular event should be stored;
 * getPurchasedTicketsForEvent(event, dateTime) - get all purchased tickets for event for specific date and Time.
 *
 */
public class BookingService {

    public BigInteger getTicketsPrice(Event event, Date dateTime,
                                      User user, int seats) {
        return null;
    }

    public void bookTicket(List<Ticket> tickets) {

    }

    public List<Ticket> getPurchasedTicketsForEvent(Event event, Date dateTime) {
        return null;
    }
}
