package com.in28minutes.springboot.learnjpaandhibernate.course.jpa;

import org.springframework.stereotype.Repository;

import com.in28minutes.springboot.learnjpaandhibernate.course.Course;

import jakarta.persistence.EntityManager;

@Repository
public class CourseJpaRepository {
	private EntityManager entityManager;
	
	public void insert(Course course) {
		
	}

}
