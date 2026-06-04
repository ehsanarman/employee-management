package com.iqbal.employee_management.repository;

import com.iqbal.employee_management.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
    public interface EmployeeRepository extends JpaRepository<Employee, Long> {


        List<Employee> findByName(String name);

    List<Employee> findByDepartment(String department);
    }

