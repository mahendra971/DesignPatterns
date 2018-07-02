package factorymethod;

import java.util.List;
import java.util.ArrayList;

public abstract class Website {

	protected List<Page> pages = new ArrayList<Page>();
	
	public List<Page> getPages() {
		return pages;
	}

	Website(){
		this.createWebsite();
	}
	
	protected abstract void createWebsite();
	
	
}
