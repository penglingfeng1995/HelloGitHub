package com.znsd.plf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.znsd.plf.entity.ClassBean;
import com.znsd.plf.entity.Student;

@RestController
public class TestController {

	@RequestMapping("test")
	public String test(Student stu,ClassBean cla) {
		System.out.println(cla);
		System.out.println(stu);
		System.out.println("ls");
		return "true";
	}
	
	@RequestMapping("test1")
	public Student test1() {
		Student stu=new Student(1,"zs");
		System.out.println("TestController.test1()"+stu);
		return stu;
	}
}
