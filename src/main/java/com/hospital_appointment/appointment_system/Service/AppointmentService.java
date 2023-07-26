package com.hospital_appointment.appointment_system.Service;

import com.hospital_appointment.appointment_system.Model.Appointment;
import com.hospital_appointment.appointment_system.Repo.AppointmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {
    @Autowired
    private AppointmentRepo appointmentRepo;
    //get all appointments
    public List<Appointment> getAllAppointments(){
        return this.appointmentRepo.findAll();
    }
    //add an appointment
    public void addAppointment(Appointment appointment){
        this.appointmentRepo.save(appointment);
    }
    //find appointment by id
    public Appointment getAppointmentById(long appointment_id){
        return this.appointmentRepo.findById(appointment_id).get();
    }
    //delete by appointment_id
    public void deleteAppointmentById(long appointment_id){
        this.appointmentRepo.deleteById(appointment_id);
    }
}
