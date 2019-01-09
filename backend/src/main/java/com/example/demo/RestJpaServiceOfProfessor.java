package com.example.demo;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.validation.Valid;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;


@RestController
public class RestJpaServiceOfProfessor {

	@Autowired
	private ServiceLayer sl;
	
	@RequestMapping(value="/getdataobjectofprofessor/{id}",method=RequestMethod.GET)
	
	public Optional<Professor> getProf(@PathVariable("id") Integer id) {
		return sl.getProfessor(id);
	}
	
	@PostMapping(value="/addprofessor")
	
	public Professor setProf(Professor professor) {
		return sl.addProfessor(professor.getName(),professor.getDescription());
	}
}
