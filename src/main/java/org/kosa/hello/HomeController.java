package org.kosa.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.ServletRequest;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String index(ServletRequest request) {
		
		return "Hello World!" + request.getLocalPort();
		
	}

}
