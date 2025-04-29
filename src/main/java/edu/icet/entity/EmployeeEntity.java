package edu.icet.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "employee")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 10)
    private String id;
    @Column(length = 30)
    private  String name;
    @Column(length = 15)
    private String department;
    @Column(length = 30)
    private String email;
    @Column(length = 12)
    private LocalDate addmissionDate;

}
