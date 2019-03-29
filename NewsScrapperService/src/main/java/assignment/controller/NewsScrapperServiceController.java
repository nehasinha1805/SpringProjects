package assignment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/newsscrapper")
public class NewsScrapperServiceController {

	/**
	 * get all available authors
	 */
	@GetMapping("/authors")
	public void getAuthors() {

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
	public void getArticleByArticleNameAndDescr(@RequestParam("articlename") String articlename, @RequestParam("descr") String descr) {

	}
}
