package assignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import assignment.dto.ResponseData;

@RestController
@RequestMapping("/newsscrapper")
public class NewsScrapperServiceController {

	@Autowired
	private RestTemplate restTemplate;

	
	@GetMapping
	public String getAllLatestNews() {
		String str = restTemplate.getForObject(
				"https://newsapi.org/v2/top-headlines?sources=the-hindu&apiKey=ad62e2c085574f9b9c0cb152c191c226",
				String.class);
		// System.out.println(str);
		// return new ResponseEntity<>(str, HttpStatus.OK);
		return str;
	}

	/**
	 * get all available authors
	 */
	@GetMapping("/authors")
	public void getAuthors() {

		ResponseData responseData = restTemplate.getForObject(
				"https://newsapi.org/v2/top-headlines?sources=the-hindu&apiKey=ad62e2c085574f9b9c0cb152c191c226",
				ResponseData.class);
		
		
	}

	/**
	 * get article by authorname
	 * 
	 * @param authorName
	 */
	@GetMapping("/{authorname}")
	public void getArticleByAuthor(@RequestParam("authorname") String authorName) {

	}

	@GetMapping("/{articlename}/{descr}")
	public void getArticleByArticleNameAndDescr(@RequestParam("articlename") String articlename,
			@RequestParam("descr") String descr) {

	}
}
