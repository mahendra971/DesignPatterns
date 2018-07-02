package factorymethod;

public class WebsiteFactory {
	
	public static Website constructWebsite(String siteType) {
		
		switch(siteType) {
		case "blog" : {
			return new Blog();
		}
		
		case "shop" :{
			return new Shop();
		}
		default : {
			return null;
		}
		}
	}

}
