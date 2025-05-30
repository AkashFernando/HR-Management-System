package edu.icet.controller;

import edu.icet.dto.Employee;
import edu.icet.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/employee")
@RequiredArgsConstructor
public class EmployeeController {
    final EmployeeService service;

    @PostMapping("/add")
    public void addEmployee(@RequestBody Employee employee) {

        service.addEmployee(employee);
    }

    @GetMapping("/getAll")
    public List<Employee> getAll() {
        return service.getAll();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEmployee(@PathVariable Integer id) {
        service.deleteEmployee(id);
    }

    @PutMapping("/update-employee")
    public void updateEmployee(@RequestBody Employee employee) {
        service.updateEmployee(employee);
    }

    @GetMapping("/search-by-id/{id}")
    public Employee searchById(@PathVariable Integer id) {

        return service.searchById(id);
    }

    @GetMapping("/search-by-name/{name}")
    public List<Employee> searchByName(@PathVariable String name) {

        return service.searchByName(name);
    }
}


