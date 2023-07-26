package com.hospital_appointment.appointment_system.Controller;

import com.hospital_appointment.appointment_system.Model.Appointment;
import com.hospital_appointment.appointment_system.Service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/AppointmentHospital")
public class AppointmentController {
    @Autowired
    private AppointmentService appointmentService;
    @GetMapping("/getAllAppointments")
    public List<Appointment> getAllAppointments(){
        return this.appointmentService.getAllAppointments();
    }
    @PostMapping("/addAppointment")
    public void addAllAppointments(@RequestBody Appointment appointment){
        this.appointmentService.addAppointment(appointment);
    }
    @GetMapping("/getAppointmentById/{appointment_id}")
    public Appointment findByAppointmentId(@PathVariable("appointment_id")long appointment_id){
        return this.appointmentService.getAppointmentById(appointment_id);
    }
    @DeleteMapping("/delete/{appointment_id}")
    public void deleteAppointmentById(@PathVariable("appointment_id")long appointment_id){
        this.appointmentService.deleteAppointmentById(appointment_id);
    }

}
