package com.matthew.learn_jpa_hibernate.course.springDataJpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matthew.learn_jpa_hibernate.course.Course;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long>{
    
}
