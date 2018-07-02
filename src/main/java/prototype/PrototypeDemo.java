package prototype;

public class PrototypeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Registry rg = new Registry();
		
		Movie mv1 = (Movie) rg.createItem("Movie");
		
		mv1.setTitle("Cloned Harry");
		System.out.println(mv1);
		System.out.println("Title "+mv1.getTitle() + "Duration "+mv1.getDuration() );
        Movie mv2 = (Movie) rg.createItem("Movie");
		
		mv2.setTitle("Cloned Harry");
		System.out.println(mv2);
		
		System.out.println("Title "+mv2.getTitle() + "Duration "+mv2.getDuration() );

	}

}
