package assignment.dto;

import java.net.URL;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Article {

	private Source source;
	private String author;
	private String title;
	private String description;
	private URL url;
	private URL urlToImage;
	private LocalDateTime publishedAt;
	private String content;
}
