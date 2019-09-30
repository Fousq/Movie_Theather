package kz.zhanbolat.movie_theather.entity;

import java.util.List;
import java.util.StringJoiner;

/**
 * Since auditorium information is usually static,
 * store it in some property file.
 * The information that needs to be stored is:
 * 1. name
 * 2. number of seats
 * 3. vip seats (comma-separated list of expensive seats)
 */
public class Auditorium implements Entity {
    private String name;
    private int seatsNumber;
    private List<Seat> vipSeats;

    public Auditorium(String name, int seatsNumber, List<Seat> vipSeats) {
        this.name = name;
        this.seatsNumber = seatsNumber;
        this.vipSeats = vipSeats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public void setSeatsNumber(int seatsNumber) {
        this.seatsNumber = seatsNumber;
    }

    public List<Seat> getVipSeats() {
        return vipSeats;
    }

    public void setVipSeats(List<Seat> vipSeats) {
        this.vipSeats = vipSeats;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Auditorium.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("seatsNumber=" + seatsNumber)
                .add("vipSeats=" + vipSeats)
                .toString();
    }
}
