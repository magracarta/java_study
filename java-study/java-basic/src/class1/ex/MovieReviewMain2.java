package class1.ex;

public class MovieReviewMain2 {
    public static void main(String[] args) {
        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.reveiw = "인생은 무한 루프";

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃 타임";
        aboutTime.reveiw = "인생 시간 영화";

        MovieReview[] reviews  = {inception, aboutTime};


        for (MovieReview review : reviews) {
            System.out.println("영화제목: "+review.title+" , 리뷰: " + review.reveiw);

        }
        
    }
}
