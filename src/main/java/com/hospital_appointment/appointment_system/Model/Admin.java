package com.hospital_appointment.appointment_system.Model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Admin")
@Getter
@Setter
@ToString
public class Admin {
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    int admin_id;
    String admin_username;
    String admin_password;
    @OneToMany(targetEntity = Doctor.class,mappedBy = "admin",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JsonManagedReference(value = "admin_id")
    private List<Doctor> doctorList;

}
