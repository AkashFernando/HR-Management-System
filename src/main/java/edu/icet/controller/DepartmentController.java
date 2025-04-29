package edu.icet.controller;

import edu.icet.dto.Department;
import edu.icet.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin
@RequestMapping("/api/department")
@RequiredArgsConstructor
public class DepartmentController {
    final DepartmentService service;

    @PostMapping("/add")
    public void addDepartment(@RequestBody Department department) {

        service.addDepartment(department);
    }

    @GetMapping("/getAll")
    public List<Department> getAll() {
        return service.getAll();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteDepartment(@PathVariable("id") Integer departmentID) {
        service.deleteDepartment(departmentID);
    }

    @PutMapping("/update-department")
    public void updateDepartment(@RequestBody Department department) {
        service.updateDepartment(department);
    }

    @GetMapping("/search-by-id/{id}")
    public Department searchById(@PathVariable("id") Integer departmentID) {

        return service.searchById(departmentID);
    }

    @GetMapping("/search-by-name/{name}")
    public List<Department> searchByName(@PathVariable("name") String departmentName) {

        return service.searchByName(departmentName);
    }
}
