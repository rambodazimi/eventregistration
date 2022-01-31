package mcgill.ecse321.EventRegistrationBackend;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.RestController;	//added!
import org.springframework.web.bind.annotation.RequestMapping;	//added!

@RestController
@SpringBootApplication
public class EventRegistrationBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventRegistrationBackendApplication.class, args);
	}

	//added!
	@RequestMapping("/")
	public String greething(){
		return "Hello world!";
	}

}
