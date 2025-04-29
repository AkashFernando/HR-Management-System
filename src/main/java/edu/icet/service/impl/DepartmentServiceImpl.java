package edu.icet.service.impl;

import edu.icet.dto.Department;
import edu.icet.entity.DepartmentEntity;
import edu.icet.entity.EmployeeEntity;
import edu.icet.repository.DepartmentRepository;
import edu.icet.repository.EmployeeRepository;
import edu.icet.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {
    final DepartmentRepository repository;
    final ModelMapper mapper;


    @Override
    public void addDepartment(Department department) {
        repository.save(mapper.map(department, DepartmentEntity.class));
    }

    @Override
    public List<Department> getAll() {
        List<Department> departmentList = new ArrayList<>();
        List<DepartmentEntity> all = repository.findAll();

        all.forEach(DepartmentEntity -> {
            departmentList.add(mapper.map(DepartmentEntity, Department.class));
        });
        return departmentList;
    }

    @Override
    public void deleteDepartment(Integer departmentID) {
        repository.deleteById(departmentID);
    }

    @Override
    public void updateDepartment(Department department) {
        repository.save((mapper.map(department,DepartmentEntity.class)));
    }

    @Override
    public Department searchById(Integer departmentID) {
        return mapper.map(repository.findById(departmentID),Department.class);
    }

    @Override
    public List<Department> searchByName(String departmentName) {
        List<DepartmentEntity> byName =repository.findBydepartmentName(departmentName);
        List<Department> departmentList =new ArrayList<>();

        byName.forEach(DepartmentEntity->{
            departmentList.add(mapper.map(DepartmentEntity,Department.class));
        });
        return departmentList;
    }
}
