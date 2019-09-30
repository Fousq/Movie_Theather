package kz.zhanbolat.movie_theather.entity;

import java.util.Date;
import java.util.StringJoiner;

public class Ticket implements Entity {
    private Event event;
    private Date airDateTime;
    private Seat seat;
    private User user;

    public Ticket(Event event, Date airDateTime, Seat seat, User user) {
        this.event = event;
        this.airDateTime = airDateTime;
        this.seat = seat;
        this.user = user;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Date getAirDateTime() {
        return airDateTime;
    }

    public void setAirDateTime(Date airDateTime) {
        this.airDateTime = airDateTime;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Ticket.class.getSimpleName() + "[", "]")
                .add("event=" + event)
                .add("airDateTime=" + airDateTime)
                .add("seat=" + seat)
                .add("user=" + user)
                .toString();
    }
}
