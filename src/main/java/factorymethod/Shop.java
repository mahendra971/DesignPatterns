package factorymethod;

public class Shop extends Website {

	@Override
	protected void createWebsite() {
		// TODO Auto-generated method stub
		pages.add(new Cartpage());
		pages.add(new ItemPage());
		pages.add(new ContactPage());

	}

}
