package practice;

import java.math.BigDecimal;
import java.net.URLEncoder;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlAnchor;
import com.gargoylesoftware.htmlunit.html.HtmlElement;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

@SpringBootApplication
public class WebScrapperToolApplication {

	//@Autowired
	private static ObjectMapper objectMapper = new ObjectMapper();
	
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
			/*String searchUrl = "https://newyork.craigslist.org/search/sss?sort=rel&query=" + URLEncoder.encode(searchQuery, "UTF-8");
			HtmlPage page = client.getPage(searchUrl);
			
			List<HtmlElement> items = page.getByXPath("//li[@class='result-row']");
			for(HtmlElement htmlItem : items) {
				HtmlAnchor itemAnchor = htmlItem.getFirstByXPath(".//p[@class='result-info']/a");
				HtmlElement spanPrice = htmlItem.getFirstByXPath(".//a/span[@class='result-price']");
				
				String itemName = itemAnchor.asText();
				String itemUrl = itemAnchor.getHrefAttribute();
				
				// It is possible that an item doesn't have any price
				String itemPrice = spanPrice == null ? "$0.0":spanPrice.asText();
				
				//System.out.println(String.format("Name: %s, Price: %s, Url: %s", itemName, itemPrice, itemUrl));
				Item item = new Item();
				item.setTitle(itemAnchor.asText());
				item.setPrice(new BigDecimal(itemPrice.replace("$", "")));
				item.setUrl(itemAnchor.getHrefAttribute());
				
				String jsonString = objectMapper.writeValueAsString(item);
				System.out.println(jsonString);*/
				
				//for hindu archive
				String url = "https://www.thehindu.com/archive";
				HtmlPage page = client.getPage(url);
				System.out.println(page.asXml());
			//}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			client.close();
		}
	}

}
