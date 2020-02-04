package io.github.truong.myspringcrud.repository;

import io.github.truong.myspringcrud.entity.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
