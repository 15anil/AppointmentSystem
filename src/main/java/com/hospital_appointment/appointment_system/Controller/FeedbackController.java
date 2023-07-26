package com.hospital_appointment.appointment_system.Controller;

import com.hospital_appointment.appointment_system.Model.Feedback;
import com.hospital_appointment.appointment_system.Repo.FeedbackRepo;
import com.hospital_appointment.appointment_system.Service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Feedback")
public class FeedbackController {
    @Autowired
    private FeedbackService feedbackService;
    @GetMapping("/getAllFeedBack")
    public List<Feedback> getAllFeedBack(){
        return this.feedbackService.getAllFeedBack();
    }
    @PostMapping("/addFeedback")
    public void addFeedback(Feedback feedback){
        this.feedbackService.addFeedback(feedback);
    }
    @GetMapping("/getFeedbackById/{feedback_id}")
    public Feedback getFeedbackById(@PathVariable("feedback_id") int feedback_id){
        return this.feedbackService.getFeedBackById(feedback_id);
    }
    @DeleteMapping("/deleteFeedbackByID/{feedback_id}")
    public void deleteFeedBackById(@PathVariable("feedback_id") int feedback_id){
        this.feedbackService.deleteFeedbackById(feedback_id);
    }
    public Feedback updateFeedback(@PathVariable("feedback_id") int feedback_id, @RequestBody Feedback updatedFeedback){
        Feedback feedback = this.feedbackService.getFeedBackById(feedback_id);
        if (feedback!=null){
            updatedFeedback.setFeedback_id(feedback.getFeedback_id());
            return this.feedbackService.updateFeedBack(updatedFeedback);
        }
        return null;
    }

}
