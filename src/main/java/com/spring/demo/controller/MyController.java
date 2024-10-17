package com.spring.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.demo.entity.Course;
import com.spring.demo.service.courseService;



@RestController
public class MyController {
	
	@Autowired(required=false)
	private courseService cService;

	@GetMapping("/home")
	public String home() {
		return "This is my home page.hgfg";
	}
	
	@GetMapping("/courses")
	public List<Course> getCourses(){
		return this.cService.getCourses();
	}
	
	@GetMapping("/course/{Id}")
	public Course getCourse(@PathVariable int Id) {
		return this.cService.getCourse(Id);
	}
	
	@PostMapping("/addCourse")
	public Course addCourse(@RequestBody Course course) {
		return this.cService.addCourse(course);
	}
	
	@DeleteMapping("/deleteCourse/{courseId}")
	public Course deleteCourse(@PathVariable int courseId) {
		return this.cService.deleteCourse(courseId);
	}
	

}
