package edu.icet.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {

    private Integer id;
    @NotBlank(message = "please add a name")
    private  String name;
    private String department;
    @Email(message = "Please provide a valid email")
    private String email;
    @PastOrPresent
    private LocalDate addmissionDate;

}
