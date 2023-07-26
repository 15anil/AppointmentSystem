package com.hospital_appointment.appointment_system.Repo;

import com.hospital_appointment.appointment_system.Model.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackRepo extends JpaRepository<Feedback, Integer> {

}
