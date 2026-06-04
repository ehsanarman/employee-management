package com.iqbal.employee_management.service;

import com.iqbal.employee_management.entity.Employee;
import org.springframework.data.domain.Page;

import java.util.List;

public interface EmployeeService {

    Employee addEmployee(Employee employee);

    List<Employee> getAllEmployees();

    Employee getEmployeeById(Long id);

    void deleteEmployee(Long id);

    Employee updateEmployee(Long id, Employee employee);

    public List<Employee> searchByName(String name);

    List<Employee> searchByDepartment(String department);

    Page<Employee> getEmployeesPage(int page, int size);

    List<Employee> sortEmployees(String field);

}

