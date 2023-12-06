package com.ann.annsistem.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class HealthController {
	
	@GetMapping(value = "/") 
	  public ResponseEntity<String> healthCheck() { 
	    return ResponseEntity. ok ().build(); 
	  } 
}
