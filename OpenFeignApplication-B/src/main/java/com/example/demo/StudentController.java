package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/app2")
@Controller
public class StudentController {
	
	
	@RequestMapping(value = "/student/save", method = RequestMethod.POST)
	@ResponseBody
	
	 public Student save(@RequestBody Student student) {
		System.out.println("Name: "+student.getName() +"\n" +  
	                          "MailId: "+student.getEmail()+"\n");
		student.setEmail("Modified "+student.getEmail());
        return student;
    }

}
