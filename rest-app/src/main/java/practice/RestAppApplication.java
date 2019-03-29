package practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "practice")
public class RestAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestAppApplication.class, args);
	}

}
