package com.hospital_appointment.appointment_system.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jdk.dynalink.linker.LinkerServices;
import lombok.*;

import java.io.StringReader;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Doctor")
@Getter
@Setter
@ToString
public class Doctor {
    @Id
    int doctor_id;
    String doctor_name;
    String speciality;
    String qualifications;
    String availability;
    String area;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "admin_id")
    @JsonBackReference(value = "admin_id")
    private Admin admin;
    @OneToMany(targetEntity = Feedback.class,mappedBy = "doctor",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JsonManagedReference(value = "doctor_id")
    private List<Feedback> feedbacks;


}
