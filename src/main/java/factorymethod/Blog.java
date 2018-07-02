package factorymethod;

public class Blog extends Website {

	@Override
	protected void createWebsite() {
		// TODO Auto-generated method stub
		
		pages.add(new About());
		pages.add(new CommentPage());
		pages.add(new Postpage());
		
		

	}

}
