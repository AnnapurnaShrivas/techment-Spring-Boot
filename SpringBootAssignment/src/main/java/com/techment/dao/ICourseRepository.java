package com.techment.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techment.model.Course;

public interface ICourseRepository extends JpaRepository<Course, Integer>{

}
