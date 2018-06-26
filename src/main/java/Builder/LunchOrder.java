package Builder;

public class LunchOrder {
	
	private final String bread;	
	private final String condiments;
	private final String meat;
	private final String dressing;
	
	static class Builder{
		
		public Builder() {
			
		}
		
		private String bread;	
		private String condiments;
		private String meat;
		private String dressing;
		
		public Builder bread(String bread) {
			this.bread = bread;
			return this;	
			
		}
		
		public Builder meat(String meat) {
			this.meat = meat;
			return this;	
			
		}
		
		public Builder condiments(String condiments) {
			this.condiments = condiments;
			return this;	
			
		}
		
		public Builder dressing(String dressing) {
			this.dressing = dressing;
			return this;	
			
		}
		
		public LunchOrder buidLunch() {
			return new LunchOrder(this);
		}
		
		
		
	}
	
	private LunchOrder(Builder builder) {
		
		this.bread = builder.bread;
		this.meat = builder.meat;
		this.dressing = builder.dressing;
		this.condiments = builder.condiments;
		
	}
	
	public String getBread() {
		return bread;
	}
	public String getCondiments() {
		return condiments;
	}
	public String getMeat() {
		return meat;
	}
	public String getDressing() {
		return dressing;
	}
	
	public void lunchDetails()
	{
		System.out.println(bread);
		System.out.println(meat);
		System.out.println(condiments);
		System.out.println(dressing);
	}

}
