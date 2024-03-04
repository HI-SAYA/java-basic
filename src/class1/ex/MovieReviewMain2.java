package class1.ex;

public class MovieReviewMain2 {
    public static void main(String[] args) {
        // 배열, foreach 사용
        MovieReview[] reviews = new MovieReview[2];

        MovieReview interstellar = new MovieReview();
        interstellar.title = "인터스텔라";
        interstellar.review = "단연 최고의 sf movie";
        reviews[0] = interstellar;

        MovieReview contact = new MovieReview();
        contact.title = "콘택트";
        contact.review = "내 첫 인생영화";
        reviews[1] = contact;

        for (MovieReview review: reviews) {
            System.out.println("영화 제목: " + review.title + ", 리뷰: " + review.review);
        }

        System.out.println("영화 제목: " + interstellar.title + ", 리뷰: " + interstellar.review);
        System.out.println("영화 제목: " + contact.title + ", 리뷰: " + contact.review);
    }
}
