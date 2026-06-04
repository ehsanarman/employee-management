package com.iqbal.employee_management.controller;
import jakarta.validation.Valid;



import com.iqbal.employee_management.entity.Employee;
import com.iqbal.employee_management.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @RequestMapping("/employees")
    public class EmployeeController {

        @Autowired
        private EmployeeService service;

        @PostMapping
        public Employee addEmployee(@Valid @RequestBody Employee employee) {
            return service.addEmployee(employee);
        }

        @GetMapping
        public List<Employee> getAllEmployees() {
            return service.getAllEmployees();
        }

        @GetMapping("/{id}")
        public Employee getEmployeeById(@PathVariable Long id) {

            return service.getEmployeeById(id);
        }
        @PutMapping("/{id}")
        public Employee updateEmployee(@PathVariable Long id,
                                       @Valid @RequestBody Employee employee) {
            return service.updateEmployee(id, employee);
        }

        @GetMapping("/search/{name}")
        public List<Employee> searchByName(@PathVariable String name) {
            return service.searchByName(name);
        }


        @DeleteMapping("/{id}")
        public String deleteEmployee(@PathVariable Long id) {
            service.deleteEmployee(id);
            return "Employee Deleted Successfully";
        }

        @GetMapping("/department/{department}")
        public List<Employee> searchByDepartment(@PathVariable String department) {
            return service.searchByDepartment(department);
        }

        @GetMapping("/page")
        public Page<Employee> getEmployeesPage(
                @RequestParam int page,
                @RequestParam int size) {

            return service.getEmployeesPage(page, size);
        }

        @GetMapping("/sort")
        public List<Employee> sortEmployees(@RequestParam String field) {
            return service.sortEmployees(field);
        }


    }

