package com.gudratli.springbootreactiveprogramming.controller;

import com.gudratli.springbootreactiveprogramming.entity.Employee;
import com.gudratli.springbootreactiveprogramming.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.LocalDate;

@RestController
@RequiredArgsConstructor
@RequestMapping("/employee")
public class EmployeeController
{
    private final EmployeeRepository employeeRepository;

    @GetMapping("/{id}")
    public Mono<Employee> getById (@PathVariable String id)
    {
        return employeeRepository.findById(id);
    }

    @GetMapping
    public Flux<Employee> getAll ()
    {
        return employeeRepository.findAll();
    }

    @PostMapping
    public Mono<Employee> add (@RequestBody Employee employee)
    {
        employee.setBirthDate(LocalDate.now());
        return employeeRepository.save(employee);
    }
}
