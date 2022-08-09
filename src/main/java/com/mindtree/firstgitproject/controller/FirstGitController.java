package com.mindtree.firstgitproject.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/firstgit")
public class FirstGitController {
	
	
	public ResponseEntity<String> displayMsg() {
		return new ResponseEntity<String>("Hello mindtree",HttpStatus.OK);
	}

}
