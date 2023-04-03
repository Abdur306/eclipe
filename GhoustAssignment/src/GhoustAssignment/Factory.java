package GhoustAssignment;

public class Factory {
public static void main(String[] args) {
	CompShop mine=new CompShop();
	mine.setfactory(new jamComputerFactory());
	System.out.println(mine.sellComp());
	
}
}
class CompShop{
	ComputerFactory cf;
	public void setfactory(ComputerFactory cf) {
		this.cf=cf;
	}
	public Computer sellComp() {
		return cf.doComp();
	}
	
}
abstract class ComputerFactory{
	public abstract Computer doComp();
}
class AbuComputerFactory extends ComputerFactory{
	
@Override
public Computer doComp() {

	return new Computer.MakeComputer().setprice(25000).setbrand("lenovo").setram("250.6").build();
}
}
class jamComputerFactory extends ComputerFactory{
	@Override
	public Computer doComp() {
		// TODO Auto-generated method stub
		return new Computer.MakeComputer().setprice(45000).setbrand("toshiba").setram("230.6").build();
	}
}
class Computer{
	int price;
	String ram;
	String brand;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "the computer is "+price+" "+ram+" "+brand;
	}
	public Computer(MakeComputer mc) {
		price=mc.price;
		ram=mc.ram;
		brand=mc.brand;
		
	}
	static class MakeComputer{
		int price;
		String ram;
		String brand;
		public MakeComputer setprice(int price) {
			this.price=price;
			return this;
		}
		public MakeComputer setram(String ram) {
			this.ram=ram;
			return this;
		}
		public MakeComputer setbrand(String brand) {
			this.brand=brand;
			return this;
		}
		public Computer build() {
			
			return new Computer(this);
		}
	}
	
}
