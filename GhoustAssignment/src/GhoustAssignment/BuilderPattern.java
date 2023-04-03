package GhoustAssignment;

public class BuilderPattern {
public static void main(String[] args) {
	Home manzil=new Home();
	manzil.setswiggy(new RahmanSwiggy());
	System.out.println(manzil.deliverhome());
}
}
class Home{
	Swiggy sy;
	public void setswiggy(Swiggy sy) {
		this.sy=sy;
	}
	public Food deliverhome() {
		return sy.doswiggy();
	}
}
abstract class Swiggy{
	public abstract Food doswiggy();
}
class AbuSwiggy extends Swiggy{
	@Override
	public Food doswiggy() {
		
		return new Food.FoodMaker().setitem_no(1).setpacking("Mutton").setcost(150).setaddress("washermanpet").build();
	}
}
class RahmanSwiggy extends Swiggy{
	@Override
	public Food doswiggy() {
		// TODO Auto-generated method stub
		return  new Food.FoodMaker().setitem_no(2).setpacking("fried rice").setcost(120).setaddress("ayanavaram").build();
	}
}

class Food{
	int item_no;
	String packing;
	int cost;
	String address;
	
	public Food(FoodMaker fm1) {
		item_no=fm1.item_no;
		packing=fm1.packing;
		cost=fm1.cost;
		address=fm1.address;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "food item is: "+" \n"+"item_no: "+item_no +" \n"+"packing: " +packing +" \n"+"cost: "+cost +" \n"+"address: "+address;
	}
	
	static class FoodMaker{
		int item_no;
		String packing;
		int cost;
		String address;
		
		public FoodMaker setitem_no(int item_no) {
			this.item_no=item_no;
			return this;
		}
		public FoodMaker setpacking(String packing) {
			this.packing=packing;
			return this;
		}
		public FoodMaker setcost(int cost) {
			this.cost=cost;
			return this;
		}
		public FoodMaker setaddress(String address ) {
			this.address=address;
			return this;
		}
		public Food build() {
			return new Food(this);
		}
	}
}
