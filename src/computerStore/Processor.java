package computerStore;

public class Processor {
	public String name;
	public int numberofcores; 
	public int numberofthreads;
	public double maxturbofrequency;
	public double processorbasefrequency;
	
	public void printMod() {
		System.out.println(this.name+"�ekirdek say�s� :"+this.numberofcores);
		System.out.println(this.name+"Maks Turbo Frekans� :"+this.maxturbofrequency+" GHz");
		System.out.println(this.name+"�� Par�ac��� Say�s� :"+this.numberofthreads);
		System.out.println(this.name+"��lemci Temel Frekans� :"+this.processorbasefrequency+" GHz");
	}
}
