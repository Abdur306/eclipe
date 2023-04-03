package PracticesDp;

public class ComputerFactory {

	public static void main(String[] args) {
		CmpShop my=new CmpShop();
		my.SetFactory(new RahCmp());
		System.out.println(my.sell());

	}
}
class CmpShop{
	CmpFactory cmpfactory;
	public void SetFactory(CmpFactory cmpfactory) {
		this.cmpfactory=cmpfactory;
	}
	public Computer sell() {
		
		return cmpfactory.manufacture();
	}
}
abstract class CmpFactory{
	public abstract Computer manufacture();
}
class AbuCmp extends CmpFactory{
	@Override
	public Computer manufacture() {
	
		return new Computer.Setcomp().Setbrand("Dell").Setram(6).Setrom(256).make();
	}
}
class RahCmp extends CmpFactory{
	@Override
	public Computer manufacture() {
	
		return new Computer.Setcomp().Setbrand("Dell").Setram(6).Setrom(256).make();
	}
}

class Computer{
	String brand;
	int ram;
	int rom;
	public String toString() {
		return "The Computer is :"+"brand: "+brand+" ram:"+ram+" rom: "+rom;
	}
	public Computer(Setcomp sc) {
		brand=sc.brand;
		ram=sc.ram;
		rom=sc.rom;
	}
	static class Setcomp{
		String brand;
		int ram;
		int rom;
		public Setcomp Setbrand(String brand) {
			this.brand=brand;
			return this;
		}
		public Setcomp Setram(int ram) {
			this.ram=ram;
			return this;
		}
		public Setcomp Setrom(int ram) {
			this.ram=ram;
			return this;
		}
		public Computer make() {
			return new Computer(this);
		}
	}
}
