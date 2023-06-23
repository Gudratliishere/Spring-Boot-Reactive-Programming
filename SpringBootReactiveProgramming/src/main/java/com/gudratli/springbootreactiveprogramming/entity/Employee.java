package com.gudratli.springbootreactiveprogramming.entity;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Document
public class Employee
{
    private String id;
    private String name;
    private String surname;
    private LocalDate birthDate;
}
