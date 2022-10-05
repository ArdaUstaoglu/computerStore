package computerStore;

public class Main {

	public static void main(String[] args) {
		GraphicCard gk1 = new GraphicCard();
		gk1.name = "Nvidia rtx 3060";
		gk1.memory = 16;
		gk1.bit = 256;
		gk1.hdmi = true;
		gk1.brand = "Casper";
		gk1.vga = true;

		GraphicCard gk2 = new GraphicCard();
		gk2.name = "GeForce gtx 1050";
		gk2.memory = 32;
		gk2.bit = 384;
		gk2.hdmi = true;
		gk2.brand = "MacBook";
		gk2.vga = true;

		Processor i1 = new Processor();
		i1.numberofcores=10;
		i1.maxturbofrequency=4.50;
		i1.numberofthreads=20;
		i1.processorbasefrequency=3.70;
		i1.name="Intel® Core™ i9-10900X X-serisi ";
		
		gk1.printInfo();
		gk1.printHdmi();
		gk2.printInfo();
		gk2.printHdmi();
		i1.printMod();
	}

}
