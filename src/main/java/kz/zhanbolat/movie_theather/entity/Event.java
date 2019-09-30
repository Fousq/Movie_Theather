package kz.zhanbolat.movie_theather.entity;

import java.util.Date;

/**
 * Event contains only basic information, like name, base price for tickets, rating (high, mid, low).
 * Event can be presented on several dates and several times within each day.
 * For each dateTime an Event will be presented only in single Auditorium.
 */
public class Event implements Entity {
    private String name;
    private int ticketPrice;
    private EventRating rating;
    private Date dateTime;

    public Event() {
        super();
    }

    public Event(String name, int ticketPrice, EventRating rating) {
        this.name = name;
        this.ticketPrice = ticketPrice;
        this.rating = rating;
    }

    public Event(String name, int ticketPrice, EventRating rating, Date dateTime) {
        this.name = name;
        this.ticketPrice = ticketPrice;
        this.rating = rating;
        this.dateTime = dateTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public EventRating getRating() {
        return rating;
    }

    public void setRating(EventRating rating) {
        this.rating = rating;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "Event{" +
                "name='" + name + '\'' +
                ", ticketPrice=" + ticketPrice +
                ", rating=" + rating +
                ", dateTime=" + dateTime +
                '}';
    }
}
