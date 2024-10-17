package com.spring.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.demo.entity.Course;

@Service
public class courseServiceImpl implements courseService {
	
	List<Course> courseList;
	
	

	public courseServiceImpl() {
		courseList = new ArrayList<>();
		courseList.add(new Course(1,"java","spring boot"));
		courseList.add(new Course(2,"dart","widget bases application"));
	}


	@Override
	public List<Course> getCourses() {
		return courseList;
	}


	@Override
	public Course getCourse(int courseId) {
		
		for (Course course : courseList) {
	        if (course.getId() == courseId) { // Assuming Course class has a getId() method
	            return course;
	        }
	    }
		return null;  //if not id found
	}


	@Override
	public Course addCourse(Course course) {
		courseList.add(course);
		return course;
	}


	@Override
	public Course deleteCourse(int courseId) {
		for (Course course : courseList) {
	        if (course.getId() == courseId) { // Assuming Course class has a getId() method
	        	courseList.remove(courseId);
	            return course;
	        }
	    }
		return null;
	}



}
