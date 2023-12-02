package _03_tea_maker;

public class TeaMakerRunner {
	public static void main(String arg[]) {
		TeaBag tea = new TeaBag("Earl Grey");
		Kettle kettle = new Kettle();
		Cup cup = new Cup();
		tea.getFlavor();
		kettle.boil();
		cup.makeTea(tea,kettle.getWater());
		
	}
}
