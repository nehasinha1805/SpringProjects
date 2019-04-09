package practice;

import java.net.URLEncoder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

@SpringBootApplication
public class WebScrapperToolApplication {

	public static void main(String[] args) {

		SpringApplication.run(WebScrapperToolApplication.class, args);
		scrappWeb();
	}

	public static void scrappWeb() {
		
		String searchQuery = "Iphone 6s";
		
		WebClient client = new WebClient();
		client.getOptions().setCssEnabled(false);
		client.getOptions().setJavaScriptEnabled(false);
		
		try {
			String searchUrl = "https://newyork.craigslist.org/search/sss?sort=rel&query=" + URLEncoder.encode(searchQuery, "UTF-8");
			HtmlPage page = client.getPage(searchUrl);
			System.out.println(page.asXml());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			client.close();
		}
	}

}
