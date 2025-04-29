package edu.icet.repository;

import edu.icet.entity.DepartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<DepartmentEntity,Integer> {
    List<DepartmentEntity> findBydepartmentName(String departmentName);
}
