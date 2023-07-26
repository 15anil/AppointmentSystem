package com.hospital_appointment.appointment_system.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Feedback")
@Getter
@Setter
@ToString
public class Feedback {
    @Id
    private int feedback_id;
    private int rating;
    private String review;
    private String message;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "doctor_id")
    @JsonBackReference(value = "doctor_id")
    private Doctor doctor;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    @JsonBackReference(value = "feedback_id")
    private Users users;

}
