package com.spring.demo.service;

import java.util.List;

import com.spring.demo.entity.Course;

public interface courseService {
	
	public List<Course> getCourses();
	public Course getCourse(int courseId);
	public Course addCourse(Course course);
	public Course deleteCourse(int courseId);
	
}
