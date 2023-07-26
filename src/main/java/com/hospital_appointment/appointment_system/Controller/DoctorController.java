package com.hospital_appointment.appointment_system.Controller;

import com.hospital_appointment.appointment_system.Model.Doctor;
import com.hospital_appointment.appointment_system.Model.Feedback;
import com.hospital_appointment.appointment_system.Service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/DoctorHospital")
public class DoctorController {
    @Autowired
    private DoctorService doctorService;
    @GetMapping("/getAllDoctors")
    public List<Doctor> getAllDoctors(){
        return this.doctorService.getAllDoctors();
    }
    @PostMapping("/addAllDoctors")
    public void addAllDoctors(Doctor doctor){
        this.doctorService.addAllDoctors(doctor);
    }
    @GetMapping("/getDoctorById/{doctor_id}")
    public Doctor getDoctorById(@PathVariable("doctor_id") int doctor_id){
        return this.doctorService.getDoctorById(doctor_id);
    }
    @DeleteMapping("/deleteDoctorById/{doctor_id}")
    public void deleteDoctorById(@PathVariable("doctor_id") int doctor_id){
        this.doctorService.deleteDoctorById(doctor_id);
    }
    @GetMapping("/getDoctorByArea/{area}")
    public List<Doctor> getDoctorByArea(@PathVariable("area") String area){
        return this.doctorService.getDoctorByArea(area);
    }
//    public List<Feedback> getFeedbackById(@PathVariable("feedback_id") int feedback_id){
//        return this.doctorService.getFeedBackById(feedback_id);
//    }


}
