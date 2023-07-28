package com.bagher.spring.controller;

import com.bagher.spring.service.AService;
import com.bagher.spring.service.dto.ADTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class AController {

	@Autowired
	AService aService;

	@GetMapping("/a/all")
	public ResponseEntity<List<ADTO>> getAllA() {
		return new ResponseEntity<>(aService.findAll(),HttpStatus.OK);
	}
}
