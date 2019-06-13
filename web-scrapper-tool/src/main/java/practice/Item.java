package practice;

import java.math.BigDecimal;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Item {

	private String title;
	private BigDecimal price;
	private String url;
	
}
