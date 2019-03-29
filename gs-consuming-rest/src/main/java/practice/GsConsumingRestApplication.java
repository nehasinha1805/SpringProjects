package practice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import practice.model.Quote;

@SpringBootApplication
public class GsConsumingRestApplication {

	private static final Logger log = LoggerFactory.getLogger(GsConsumingRestApplication.class);
			
	public static void main(String[] args) {
		SpringApplication.run(GsConsumingRestApplication.class, args);
		RestTemplate restTemplate = new RestTemplate();
		Quote quote = restTemplate.getForObject("https://gturnquist-quoters.cfapps.io/api/random", Quote.class);
		//System.out.println(quote.toString());
		log.info(quote.toString());
	}

}
