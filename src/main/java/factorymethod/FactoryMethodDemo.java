package factorymethod;

public class FactoryMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Website blog = WebsiteFactory.constructWebsite("blog");
		
		System.out.println(blog.getPages());
		
Website shop = WebsiteFactory.constructWebsite("shop");
		
		System.out.println(shop.getPages());

	}

}
