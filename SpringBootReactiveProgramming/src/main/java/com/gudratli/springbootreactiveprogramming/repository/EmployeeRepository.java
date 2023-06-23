package com.gudratli.springbootreactiveprogramming.repository;

import com.gudratli.springbootreactiveprogramming.entity.Employee;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface EmployeeRepository extends ReactiveMongoRepository<Employee, String>
{
}
