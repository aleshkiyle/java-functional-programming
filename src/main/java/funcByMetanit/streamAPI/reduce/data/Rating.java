package funcByMetanit.streamAPI.reduce.data;

import java.util.ArrayList;
import java.util.List;

public class Rating {

    private double points;
    private List<Review> reviews = new ArrayList<>();

    public void add(Review review) {
        reviews.add(review);
        computeRating();
    }

    private double computeRating() {
        double totalPoints =
                reviews.stream()
                        .map(Review::points)
                        .reduce(0, Integer::sum);
        this.points = totalPoints / reviews.size();
        return this.points;
    }

    public static Rating average(Rating rating1, Rating rating2) {
        Rating combined = new Rating();
        combined.reviews = new ArrayList<>(rating1.reviews);
        combined.reviews.addAll(rating2.reviews);
        return combined;
    }

    public double getPoints() {
        return points;
    }

    public List<Review> getReviews() {
        return reviews;
    }
}
