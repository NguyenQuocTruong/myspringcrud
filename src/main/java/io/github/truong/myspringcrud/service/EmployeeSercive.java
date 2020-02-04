package io.github.truong.myspringcrud.service;

import io.github.truong.myspringcrud.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeSercive {
    List<Employee> getAllEmployee();

    void saveEmployee(Employee employee);

    void deleteEmployee(Long id);

    Optional<Employee> findEmployeeById(Long id);

}
