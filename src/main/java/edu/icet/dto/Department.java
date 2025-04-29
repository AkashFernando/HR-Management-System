package edu.icet.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Department {

    private Integer departmentID;
    @NotBlank
    private String departmentName;
    private Integer count;
    @Email
    private String email;

}
