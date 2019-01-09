package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceLayer {

	@Autowired
	private ProfessorInt pi;
	
	public Optional<Professor> getProfessor(Integer id) {
		return pi.findById(id);
	}
	public Professor addProfessor(String name,String description) {
		Professor pf = new Professor(name,description);
		return pi.save(pf);
	}
}
