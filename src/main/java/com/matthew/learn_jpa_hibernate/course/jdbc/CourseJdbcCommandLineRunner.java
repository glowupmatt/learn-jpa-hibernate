package com.matthew.learn_jpa_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.matthew.learn_jpa_hibernate.course.Course;


@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {
    @Autowired
    private CourseJdbcRepository repository;
    
    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "Learn AWS Now!", "in28minutes"));
        repository.insert(new Course(2, "Learn AWS Nowfdsfdsa!", "in28minutes"));
        repository.insert(new Course(3, "Learn AWS Nowfdsfds!", "in28minutes"));
        
        repository.deleteById(1);

        System.out.println(repository.findById(2));
        System.out.println(repository.findById(3));
    }

}
