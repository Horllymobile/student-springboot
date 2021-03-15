package com.horllymobile.Students.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return  args -> {

           Student olamide =  new Student(
                            "Olamide",
                            "olamide@gmail.com",
                            LocalDate.of(1998, MARCH, 15)
                            );
           Student jane = new Student(
                   "Jane",
                   "jane@gmail.com",
                   LocalDate.of(1996, MARCH, 15)
           );

           studentRepository.saveAll(
                   List.of(olamide, jane)
           );

        };
    }

}
