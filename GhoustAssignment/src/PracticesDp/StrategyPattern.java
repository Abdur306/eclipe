package PracticesDp;

public class StrategyPattern {

	public static void main(String[] args) {
		Dog tigger=new Dog();
		Item item=new Stick();
		tigger.play(item);

	}
}
class Dog{
	public void play(Item item) {
		item.execute();
	}
}
abstract class Item{
	public abstract void execute();
}
class Stick extends Item{
	@Override
	public void execute() {
	System.out.println("Stick na dog play");		
	}
}
class Stone extends Item{
	@Override
	public void execute() {
	System.out.println("Stone na ill bite");	
	}
}
