package com.hospital_appointment.appointment_system.Repo;

import com.hospital_appointment.appointment_system.Model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepo extends JpaRepository<Admin,Integer> {
//    Admin findByAdminUsernameAndAdminPassword(String admin_username,String admin_password);
}
