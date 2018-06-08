package com.yvestest.firstlearnspring.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.yvestest.firstlearnspring.model.firstlearnspringModel;
import com.yvestest.firstlearnspring.repository.FirstlearnspringRepository;

@RestController
@RequestMapping("/api")
public class firstlearnspringController {
	
	@Autowired
	FirstlearnspringRepository firstlearnspringRepository;
	
	// Get All firstlearnspringModel
		@GetMapping("/firstlearnspringModel")
		public @ResponseBody List<firstlearnspringModel> getAllNotes(){ 		//return ค่าแบบ Json list = type
			return firstlearnspringRepository.findAll();
		}
		
	    // Create a new firstlearnspringModel
		@PostMapping("/firstlearnspringModel")
		public firstlearnspringModel createNote(@Valid @RequestBody firstlearnspringModel firstlearnspringModel) {
			return firstlearnspringRepository.save(firstlearnspringModel);
		}
		
		
}
