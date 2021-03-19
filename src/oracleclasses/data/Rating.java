/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oracleclasses.data;

/**
 *
 * @author uzer
 */
public enum Rating {
    //black \u2605 white \u2606
    NOT_RATED("\u2606\u2606\u2606\u2606\u2606"),
    ONE_RATED("\u2605\u2606\u2606\u2606\u2606"),
    TWO_RATED("\u2605\u2605\u2606\u2606\u2606"),
    THREE_RATED("\u2605\u2605\u2605\u2606\u2606"),
    FOUR_RATED("\u2605\u2605\u2605\u2605\u2606"),
    FIVE_RATED("\u2606\u2606\u2606\u2606\u2606");

    private final String stars;

    private Rating(String stars) {
        this.stars = stars;
    }

    public String getStars() {
        return stars;
    }

}
