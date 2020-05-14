package sample.helloworld.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HelloWorldController {

	@RequestMapping("/")
	public String sayHello() {
		return "Hi Welcome to Spring Boot Test!!!";
	}

}
