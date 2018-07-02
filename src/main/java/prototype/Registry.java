package prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
	
	private Map<String,Item> dataitems = new HashMap<String,Item>();
	
	Registry(){
		
		loadItems();
	}
	
	public Item createItem(String itemType) {
		
		Item item = null;
		try {
			
			item = (Item)(dataitems.get(itemType)).clone();
			
		}
		catch(CloneNotSupportedException ex) {
			ex.printStackTrace();
		}
		
		return item;
	}
	
	private void loadItems()
	{
		
		Movie mv = new Movie();
		
		mv.setTitle("Harry Porter");
		mv.setDuration("4hrs");
		mv.setPrice(22.5);
		mv.setUrl("www.movies.com");
		
		dataitems.put("Movie", mv);
		
Book bk = new Book();
		
	bk.setTitle("Harry Porter paper book");
		bk.setNumberOfPages(1000);
		bk.setPrice(229.5);
		bk.setUrl("www.moviebooks.com");
		
		dataitems.put("Bookj", bk);
		
		
	}
	

}
