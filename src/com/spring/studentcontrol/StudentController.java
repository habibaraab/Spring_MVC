package com.spring.studentcontrol;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.model.Student;

//http://localhost:9090/spring-mvc/student
@Controller
@RequestMapping("student")
public class StudentController {

	
	//http://localhost:9090/spring-mvc/student/account
	
	@RequestMapping("/account")
	public String studentForm() {
		return "student-front/student-account";
	}
	
	//http://localhost:9090/spring-mvc/student/studentprocess
	@RequestMapping("/studentprocess")
	public String getDataStudent(@RequestParam("fname") String fname,@RequestParam("lname") String lname
								,@RequestParam("age") String age,Model model) {
		Student student = new Student();
		student.setfName(fname);
		student.setlName(lname);
		student.setAge(age);
		model.addAttribute("myStudent",student);
		return "student-front/showdatastudent";
	}
	
}
