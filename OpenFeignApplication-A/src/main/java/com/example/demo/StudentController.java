package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/app1")
@Controller
public class StudentController {
	
	@Autowired
	private RestClientService restClientService;
	
	@RequestMapping(value="/student/save", method = RequestMethod.GET)
	@ResponseBody
	 public Student save() {
        Student student = new Student();
        student.setId(1L);
        student.setName("Ritesh Jha");
        student.setEmail("rjha@gmail.com");
        return restClientService.save(student);
    }

}
