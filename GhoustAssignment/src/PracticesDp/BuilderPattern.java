package PracticesDp;

public class BuilderPattern {

	public static void main(String[] args) {
		
  Food swiggy=new Food.Swiggy().SetDish("Pizza").SetPrice(300).SetAddress("Konditope").build();
  System.out.println(swiggy);
	}
}
class Food{
	String dish;
	int price;
	String address;
	
	public Food(Swiggy sgy) {
		dish=sgy.dish;
		price=sgy.price;
		address=sgy.address;
	}
	public String toString() {
		return dish+" "+price+" "+address;
	}
	static class Swiggy{
		String dish;
		int price;
		String address;
	public Swiggy SetDish(String dish) {
		this.dish=dish;
		return this;
	}
	public Swiggy SetPrice(int price) {
		this.price=price;
		return this;
	}
	public Swiggy SetAddress(String address) {
		this.address=address;
		return this;
	}
	public Food build() {
		return new Food(this);
	}
	}
	
}