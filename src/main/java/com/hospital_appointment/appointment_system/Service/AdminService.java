package com.hospital_appointment.appointment_system.Service;

import com.hospital_appointment.appointment_system.Model.Admin;
import com.hospital_appointment.appointment_system.Repo.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {
    @Autowired
    private AdminRepo adminRepo;
    public List<Admin> getAllAdmins(){
        return this.adminRepo.findAll();
    }
    public void addAdmins(Admin admin){
        this.adminRepo.save(admin);
    }
    public Admin getAdminById(int admin_id){
        return this.adminRepo.findById(admin_id).orElse(new Admin());
    }
    public void deleteAdminById(int admin_id){
        this.adminRepo.deleteById(admin_id);
    }
//    public Admin getFeedBack(int admin_id){
//        return this.adminRepo.findById(admin_id).get();
//
//    }


}
