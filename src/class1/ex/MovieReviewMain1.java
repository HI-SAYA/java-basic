package class1.ex;

public class MovieReviewMain1 {
    public static void main(String[] args) {
        MovieReview interstellar = new MovieReview();
        interstellar.title = "인터스텔라";
        interstellar.review = "단연 최고의 sf movie";

        MovieReview contact = new MovieReview();
        contact.title = "콘택트";
        contact.review = "내 첫 인생영화";

        System.out.println("영화 제목: " + interstellar.title + ", 리뷰: " + interstellar.review);
        System.out.println("영화 제목: " + contact.title + ", 리뷰: " + contact.review);
    }
}
