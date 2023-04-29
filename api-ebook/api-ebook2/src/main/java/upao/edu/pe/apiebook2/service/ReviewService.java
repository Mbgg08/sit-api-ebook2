package upao.edu.pe.apiebook2.service;

import upao.edu.pe.apiebook2.model.Review;

import java.util.List;

public interface ReviewService{
    Review createReview(String title, String comment, Integer rating, Long bookId, Long userId);
    Review updateReview(Long id, String title, String comment, Integer rating);
    void deleteReview(Long id);
    List<Review> getAllReviews();
    Review getReviewById(Long id);
}