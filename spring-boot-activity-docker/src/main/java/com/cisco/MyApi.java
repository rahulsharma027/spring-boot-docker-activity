package com.cisco;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myapi")
public class MyApi {
	
	private String message = "Hello World";
	
	@GetMapping
	public ResponseEntity<Object> getProperty(){
		return ResponseEntity.ok(message);
	}
}