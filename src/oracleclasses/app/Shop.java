package oracleclasses.app;

import java.math.BigDecimal;
import java.util.Locale;
import oracleclasses.data.Product;
import oracleclasses.data.ProductManager;
import oracleclasses.data.Rating;

public class Shop {

    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("okoth" instanceof String);
        ProductManager pM = new ProductManager(Locale.UK);
        Product p1 = pM.createProduct(101, "Tea", BigDecimal.valueOf(1.99), Rating.NOT_RATED);
        pM.printProductReport();
        p1 = pM.reviewProduct(p1, Rating.FOUR_RATED, "Nice hot cup of tea");
//        p1 = pM.reviewProduct(p1, Rating.TWO_RATED, "TWO hot cup of tea");
//        p1 = pM.reviewProduct(p1, Rating.THREE_RATED, "ddd hot cup of tea");
//        p1 = pM.reviewProduct(p1, Rating.FIVE_RATED, "Nideece hot cup of tea");
        pM.printProductReport();
//        Product p2 = pM.createProduct(102, "Coffee", BigDecimal.valueOf(1.99), Rating.FOUR_RATED);
//        Product p3 = pM.createProduct(103, "Cake", BigDecimal.valueOf(3.99), Rating.FIVE_RATED, LocalDate.now().plusDays(2));
//        Product p4 = pM.createProduct(104, "Cookie", BigDecimal.valueOf(3.99), Rating.TWO_RATED, LocalDate.now());
//        ///Product p5 = p3.applyRatting(Rating.THREE_RATED);
//        Product p6 = pM.createProduct(105, "Cholate", BigDecimal.valueOf(2.99), Rating.FIVE_RATED);
//        Product p7 = pM.createProduct(106, "Cholate", BigDecimal.valueOf(2.99), Rating.FIVE_RATED, LocalDate.now().plusDays(2));
////        System.out.println(p1.getId() + " " + p1.getName() + " " + p1.getPrice() + " " + p1.getDiscount() + " " + p1.getRating().getStars());
////        System.out.println(p2.getId() + " " + p2.getName() + " " + p2.getPrice() + " " + p2.getDiscount() + " " + p2.getRating().getStars());
////        System.out.println(p3.getId() + " " + p3.getName() + " " + p3.getPrice() + " " + p3.getDiscount() + " " + p3.getRating().getStars());
////        System.out.println(p4.getId() + " " + p4.getName() + " " + p4.getPrice() + " " + p4.getDiscount() + " " + p4.getRating().getStars());
////        System.out.println(p5.getId() + " " + p5.getName() + " " + p5.getPrice() + " " + p5.getDiscount() + " " + p5.getRating().getStars());
//        System.out.println(p1);
//        System.out.println(p2);
//        System.out.println(p3);
//        System.out.println(p4);
//        ///System.out.println(p5);
//        System.out.println(p6);
//        System.out.println(p7);
////        System.out.println(p6.equals(p7));
    }

}
