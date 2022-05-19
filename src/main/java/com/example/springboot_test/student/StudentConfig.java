package com.example.springboot_test.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return  args -> {
            Student boting = new Student(
                    "BoTing",
                    "BoTing@gmail.com",
                    LocalDate.of(1911, Month.JANUARY,16)
            );

            Student alex = new Student(
                    "Alex",
                    "Alex@gmail.com",
                    LocalDate.of(1985, Month.FEBRUARY,28)
            );
            repository.saveAll(
                    List.of(boting,alex)
            );
        };
    }
}
