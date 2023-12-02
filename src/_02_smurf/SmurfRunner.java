package _02_smurf;

public class SmurfRunner {
	public static void main(String arg[]) {
		Smurf handysmurf = new Smurf("Handy");
		Smurf papasmurf = new Smurf("Papa Smurf");
		Smurf smurfette = new Smurf("Smurfette");
		
		handysmurf.getName();
		handysmurf.eat();
		handysmurf.getHatColor("handy smurf");
		
		papasmurf.getHatColor("Papa Smurf");
		
		smurfette.isGirlOrBoy("Smurfette");
	}
}
