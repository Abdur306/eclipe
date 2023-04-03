package PracticesDp;

public class Factory1 {

	public static void main(String[] args) {
		CakeShop2 myshow=new CakeShop2();
		myshow.setCakefactory(new AbdurFactory());
		System.out.println(myshow.sellCake());

	}
}
class CakeShop2{
	CakeFactory cakefactory;
	public void setCakefactory(CakeFactory cakefactory) {
		this.cakefactory=cakefactory;
	}
	public Cake sellCake() {
		return cakefactory.makeCake();
	}
}
abstract class CakeFactory2{
	public abstract Cake makeCake();
}
class AbdurFactory extends CakeFactory{
	@Override
	public Cake makeCake() {
	
		return new Cake.CakeMaker().setWieght(5).setFavour("vanila").setShape("circle").build();
	}
}
class Cake2{
	int weight;
	String favour;
	String shape;
	
	public String toString() {
		return "the cake ="+" weight: "+weight+" favour:"+favour+" shape:"+shape;
	}
	public Cake2(CakeMaker cm) {
       this.weight=cm.weight;
         this.favour=cm.favour;
         this.shape=cm.shape;
	}
	static class CakeMaker{
		int weight;
		String favour;
		String shape;
		
		public CakeMaker setWeight(int weight) {
			this.weight=weight;
			return this;
		}
		public CakeMaker setFavour(String favour) {
			this.favour=favour;
			return this;
		}
		public CakeMaker setShape(String shape) {
			this.shape=shape;
			return this;
		}
		public Cake2 build() {
			return new Cake2(this);
		}
	}
}
