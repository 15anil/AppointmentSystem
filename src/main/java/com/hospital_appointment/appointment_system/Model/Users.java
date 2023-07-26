package com.hospital_appointment.appointment_system.Model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Users")

public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long user_id;
    private String user_name;
    private String email;
    private String contactInfo;
    private String password;
    @OneToMany(targetEntity = Appointment.class,mappedBy = "users",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
//    @JoinColumn(name = "appointment_fk",referencedColumnName = "appointment_id")
    @JsonManagedReference(value = "appointment_id")
    private List<Appointment> appointments;
    @OneToMany(targetEntity = Feedback.class,mappedBy = "users",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JsonManagedReference(value = "feedback_id")
    private List<Feedback> feedbacks;
}
