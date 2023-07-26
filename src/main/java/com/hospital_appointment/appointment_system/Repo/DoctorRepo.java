package com.hospital_appointment.appointment_system.Repo;

import com.hospital_appointment.appointment_system.Model.Doctor;
import com.hospital_appointment.appointment_system.Model.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DoctorRepo extends JpaRepository<Doctor,Integer> {
    public List<Doctor> getDoctorByArea(String area);
//    public List<Feedback> getAllFeedbackById(int feedback_id);

}
