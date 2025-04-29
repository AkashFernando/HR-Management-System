package edu.icet.service;

import edu.icet.dto.Department;

import java.util.List;

public interface DepartmentService {
    void addDepartment(Department department);

    List<Department> getAll();

    void deleteDepartment(Integer departmentID);

    Department searchById(Integer departmentID);

    List<Department> searchByName(String departmentName);

    void updateDepartment(Department department);
}
