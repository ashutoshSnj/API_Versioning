package com.build;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	
@GetMapping(version ="1.0")

public StudentDto1 getstudent1() {
	return new StudentDto1("Ashutosh", "pune Maharashtra");
}


@GetMapping(path = "/account/{id}", version = "1.1") 
public String getAccount() {
	return "check it ";
}


@PostMapping(version = "2.0")
public StudentDto2 getstudent2() {
	return new StudentDto2("Ashutosh Sanjay Shelke",11);
}

}

