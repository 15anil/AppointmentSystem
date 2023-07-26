package com.hospital_appointment.appointment_system.Repo;

import com.hospital_appointment.appointment_system.Model.Appointment;
import org.hibernate.boot.model.internal.JPAIndexHolder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepo extends JpaRepository<Appointment,Long> {

}
