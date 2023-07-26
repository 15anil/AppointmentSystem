package com.hospital_appointment.appointment_system.Service;

import com.hospital_appointment.appointment_system.Model.Doctor;
import com.hospital_appointment.appointment_system.Model.Feedback;
import com.hospital_appointment.appointment_system.Repo.DoctorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.print.Doc;
import java.util.List;

@Service
public class DoctorService {
    @Autowired
    private DoctorRepo doctorRepo;

    public List<Doctor> getAllDoctors(){
        return this.doctorRepo.findAll();
    }
    public void addAllDoctors(Doctor doctor){
        this.doctorRepo.save(doctor);
    }
    public Doctor getDoctorById(int doctor_id){
        return this.doctorRepo.findById(doctor_id).get();
    }
    public void deleteDoctorById(int doctor_id){
        this.doctorRepo.deleteById(doctor_id);
    }
    public List<Doctor> getDoctorByArea(String area){
        return this.doctorRepo.getDoctorByArea(area);
    }
//    public List<Feedback> getFeedBackById(int feedback_id){
//        return this.doctorRepo.getAllFeedbackById(feedback_id);
//    }

}
