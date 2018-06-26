package Builder;

public class BuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LunchOrder.Builder builder = new LunchOrder.Builder();
		
		builder.bread("FreshPan bread").condiments("Peanuts").meat("chicken").dressing("cabbage");
		
		LunchOrder order = builder.buidLunch();
		
		order.lunchDetails();

	}

}
