package com.hospital_appointment.appointment_system.Service;

import com.hospital_appointment.appointment_system.Model.Feedback;
import com.hospital_appointment.appointment_system.Repo.FeedbackRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service


public class FeedbackService {
    @Autowired
    private FeedbackRepo feedbackRepo;
    public void addFeedback(Feedback feedback){
        this.feedbackRepo.save(feedback);
    }
    public List<Feedback> getAllFeedBack(){
        return this.feedbackRepo.findAll();
    }
    public Feedback getFeedBackById(int feedback_id){
        return this.feedbackRepo.findById(feedback_id).get();
    }
    public Feedback updateFeedBack(Feedback updatedFeedback){
        Feedback existingFeedback = this.feedbackRepo.findById(updatedFeedback.getFeedback_id()).orElse(null);
        if (existingFeedback!=null){
            existingFeedback.setMessage(updatedFeedback.getMessage());
            existingFeedback.setRating(updatedFeedback.getRating());
            existingFeedback.setReview(updatedFeedback.getReview());
            this.feedbackRepo.save(existingFeedback);
        }
        return existingFeedback;
    }
    public void deleteFeedbackById(int feedback_id){
        this.feedbackRepo.deleteById(feedback_id);
    }

}
