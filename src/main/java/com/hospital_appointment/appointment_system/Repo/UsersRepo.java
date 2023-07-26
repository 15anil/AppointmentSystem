package com.hospital_appointment.appointment_system.Repo;

import com.hospital_appointment.appointment_system.Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepo extends JpaRepository<Users,Long> {

}
