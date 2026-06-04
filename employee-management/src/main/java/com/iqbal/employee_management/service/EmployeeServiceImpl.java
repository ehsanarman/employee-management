package com.iqbal.employee_management.service;



import com.iqbal.employee_management.entity.Employee;
import com.iqbal.employee_management.exception.ResourceNotFoundException;
import com.iqbal.employee_management.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

    @Service
    public class EmployeeServiceImpl implements EmployeeService {

        @Autowired
        private EmployeeRepository repository;

        @Override
        public Employee addEmployee(Employee employee) {
            return repository.save(employee);
        }

        @Override
        public List<Employee> getAllEmployees() {
            return repository.findAll();
        }

        @Override
        public Employee getEmployeeById(Long id) {
            return repository.findById(id)
                    .orElseThrow(() -> new ResourceNotFoundException("Employee not found with id " + id));
        }
        @Override
        public void deleteEmployee(Long id) {
            repository.deleteById(id);
        }

        @Override


        public Employee updateEmployee(Long id, Employee employeeDetails) {
            Employee employee = repository.findById(id).orElseThrow();

            employee.setName(employeeDetails.getName());
            employee.setEmail(employeeDetails.getEmail());
            employee.setDepartment(employeeDetails.getDepartment());
            employee.setSalary(employeeDetails.getSalary());

            return repository.save(employee);
        }

        @Override
        public List<Employee> searchByName(String name) {
            return repository.findByName(name);
        }

        @Override
        public List<Employee> searchByDepartment(String department) {
            return repository.findByDepartment(department);
        }


        @Override
        public Page<Employee> getEmployeesPage(int page, int size) {
            Pageable pageable = PageRequest.of(page, size);
            return repository.findAll(pageable);
        }



        @Override
        public List<Employee> sortEmployees(String field) {
            return repository.findAll(
                    org.springframework.data.domain.Sort.by(
                            org.springframework.data.domain.Sort.Direction.ASC,
                            field
                    )
            );
        }

    }

