package practice.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import practice.bean.StudentRegistration;
import practice.bean.StudentRegistrationReply;

@RestController
public class StudentRegistrationController {

	@PostMapping("/register/student")
	public StudentRegistrationReply registerStudent(@RequestBody StudentRegistration studentRegistration) {
		StudentRegistrationReply studentRegistrationReply = new StudentRegistrationReply();
		studentRegistrationReply.setName(studentRegistration.getName());
		studentRegistrationReply.setAge(studentRegistration.getAge());
		studentRegistrationReply.setRegistrationNumber("12345");
		studentRegistrationReply.setRegistrationStatus("Success!");
		return studentRegistrationReply;
	}
}
