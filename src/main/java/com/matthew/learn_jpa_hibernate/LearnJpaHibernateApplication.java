package com.matthew.learn_jpa_hibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnJpaHibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnJpaHibernateApplication.class, args);
	}

}
// insert into course (id, name, author)
// values(1, 'Learn AWS', 'matthew');


// select * from course