package GhoustAssignment;

public class TempPattern {

	public static void main(String[] args) {
	
	
Dominos myshop=new ChinaDominos();

		myshop.oderDomino();
		
	}
}
abstract class Dominos{
	protected  final void  makePizza() {
		System.out.println("do as per my formula");
	}
	protected final void pizzaShape() {
		System.out.println("should be round with small,large,medium size");
	}
	protected final void shopDecoration() {
		System.out.println("it contains mcdonald toy");
	}
	protected abstract void payment();
	protected abstract void delivery();
	public final void oderDomino() {
		payment();
		makePizza();
		pizzaShape();
		shopDecoration();
		delivery();
		
	}
}
class IndianDominos extends Dominos{
	@Override
	public void payment() {
		System.out.println("payment should be in ruppes!");
		
	}
	@Override
	public void delivery() {
		System.out.println("we will deliver with delivery riders");
		
	}
}
class ChinaDominos extends Dominos{
	
	@Override
	public void payment() {
	System.out.println("payment should be in Renminbi");		
	}
	@Override
	public void delivery() {
	System.out.println("we will deliver with drone");
		
	}
}
