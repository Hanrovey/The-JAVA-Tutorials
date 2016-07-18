package Test2;

public class Shop extends Dog{

	private String name;
   private double counts; // Annual salary
   
   public Shop(String name) {
	   this.name = name;
   }
   
	@Override
	public double computeCount() {
	    System.out.println("Computing salary pay for " + name);
		return counts/12;
	}
	
	public static void main(String[] args) {
		Shop shop = new Shop("商店1");
		shop.computeCount();
	}
	
}
