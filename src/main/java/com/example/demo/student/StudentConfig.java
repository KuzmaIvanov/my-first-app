package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student kuzma = new Student(
                    "Kuzma",
                    "kuzmaivanov007@gmail.com",
                    LocalDate.of(2002, Month.FEBRUARY,12)
            );
            Student alex = new Student(
                    "Alex",
                    "alex.smith@gmail.com",
                    LocalDate.of(2000, Month.JUNE,19)
            );
            studentRepository.saveAll(
                    List.of(kuzma,alex)
            );
        };
    }
}
