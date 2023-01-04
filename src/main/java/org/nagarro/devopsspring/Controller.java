package org.nagarro.devopsspring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@RequestMapping("/hii")
	public String msg() {
		return "Hello";
	}

}
