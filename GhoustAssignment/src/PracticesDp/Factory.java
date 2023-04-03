package PracticesDp;

import PracticesDp.Cake.CakeMaker;

public class Factory {

	public static void main(String[] args) {
		
    CakeShop myshow=new CakeShop();
    myshow.setCakeFactory(new AbuFactory());
    System.out.println(myshow.sellCake());
	}
}
class CakeShop{
	CakeFactory cakeFactory;
	public void setCakeFactory(CakeFactory cakeFactory) {
		this.cakeFactory=cakeFactory;
	}
	public Cake sellCake() {
		return cakeFactory.makeCake();
	}
}
abstract class CakeFactory{
	public abstract Cake makeCake();
}
class AbuFactory extends CakeFactory{
	@Override
	public Cake makeCake() {
	
		return new Cake.CakeMaker().setFavour("Blkcream").setShape("round").setWieght(5).build();
	}
}
class Cake{
	int wieght;
	String shape;
	String favour;
	public String toString() {
		return "The cake is ready\n"+"favour: "+favour+"\n"+"shape: "+shape+"\n"+"wieght: "+wieght+"\n";
	}
	public Cake(CakeMaker cm) {
		wieght=cm.wiegth;
		shape=cm.shape;
		favour=cm.favour;
	}
	static class CakeMaker {
		int wiegth;
		String shape;
		String favour;
	
	public CakeMaker setWieght(int wieght) {
		this.wiegth=wieght;
		return this;
	}
	public CakeMaker setShape(String shape) {
		this.shape=shape;
		return this;
	}
	public CakeMaker setFavour(String favour) {
		this.favour=favour;
		return this;
	}
	public Cake build() {
		return new Cake(this);
	
	}
	}
	
}
