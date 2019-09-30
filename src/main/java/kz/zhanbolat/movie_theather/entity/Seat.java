package kz.zhanbolat.movie_theather.entity;

import java.util.StringJoiner;

public class Seat implements Entity {
    private String id;
    private int price;

    public Seat(String id, int price) {
        this.id = id;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Seat.class.getSimpleName() + "[", "]")
                .add("id='" + id + "'")
                .add("price=" + price)
                .toString();
    }
}
