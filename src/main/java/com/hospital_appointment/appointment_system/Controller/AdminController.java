package com.hospital_appointment.appointment_system.Controller;

import com.hospital_appointment.appointment_system.Model.Admin;
import com.hospital_appointment.appointment_system.Model.Doctor;
import com.hospital_appointment.appointment_system.Repo.AdminRepo;
import com.hospital_appointment.appointment_system.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/AdminHospital")
public class AdminController {
    @Autowired
    private AdminService adminService;
    @GetMapping("/getAllAdmins")
    public List<Admin> getAllAdmins(){
        return this.adminService.getAllAdmins();
    }
    @PostMapping("/addAllAdmins")
    public void addAllAdmins(@RequestBody Admin admin){
        this.adminService.addAdmins(admin);
    }
    @GetMapping("/getAdminById/{admin_id}")
    public Admin getAdminById(@PathVariable("admin_id") int admin_id){
        return this.adminService.getAdminById(admin_id);
    }
    @DeleteMapping("/deleteAdminById/{admin_id}")
    public void deleteAdminById(@PathVariable("admin_id") int admin_id){
        this.adminService.deleteAdminById(admin_id);
    }



}
