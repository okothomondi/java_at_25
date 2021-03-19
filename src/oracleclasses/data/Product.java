package oracleclasses.data;

import java.math.BigDecimal;
import static java.math.RoundingMode.HALF_UP;
import java.time.LocalDate;
import java.util.Objects;
import static oracleclasses.data.Rating.*;

public abstract class Product implements Rateable<Product> {

    public static final BigDecimal DISCOUNT_RATE = BigDecimal.valueOf(0.1);
    private Integer id;
    private String name;
    private BigDecimal price;
    private Rating rating;

    Product(Integer id, String name, BigDecimal price, Rating rating) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    Product(Integer id, String name, BigDecimal price) {
        this(id, name, price, NOT_RATED);
    }

    Product() {
        this(0, "no name", BigDecimal.ZERO);
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public BigDecimal getDiscount() {
        return price.multiply(DISCOUNT_RATE).setScale(2, HALF_UP);
    }

    @Override
    public Rating getRating() {
        return rating;
    }

//    public abstract Product applyRating(Rating newRating);
    /*{
        return new Product(id, name, price, newRating);
    }*/
    public LocalDate getBestBefore() {
        return LocalDate.now();
    }

    @Override
    public String toString() {
        return id + " " + name + " " + price + " " + rating.getStars();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj != null && getClass() == obj.getClass()) {
//        if (obj instanceof Product) {
            final Product other = (Product) obj;
            return Objects.equals(this.id, other.id) && Objects.equals(this.name, other.name);
        }
        return false;
    }


}
