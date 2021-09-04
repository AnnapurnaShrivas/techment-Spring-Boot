package com.techment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techment.dao.ICourseRepository;
import com.techment.model.Course;

@Service
public class CourseService {
@Autowired
private ICourseRepository repo;
public List<Course> listAll() {
return repo.findAll();
}
public void save(Course course) {
repo.save(course);
}
public Course get(int id) {
return repo.findById(id).get();
}
public void delete(Integer id) {
repo.deleteById(id);
}
}
