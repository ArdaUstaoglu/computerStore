package computerStore;

public class Processor {
	public String name;
	public int numberofcores; 
	public int numberofthreads;
	public double maxturbofrequency;
	public double processorbasefrequency;
	
	public void printMod() {
		System.out.println(this.name+"Çekirdek sayýsý :"+this.numberofcores);
		System.out.println(this.name+"Maks Turbo Frekansý :"+this.maxturbofrequency+" GHz");
		System.out.println(this.name+"Ýþ Parçacýðý Sayýsý :"+this.numberofthreads);
		System.out.println(this.name+"Ýþlemci Temel Frekansý :"+this.processorbasefrequency+" GHz");
	}
}
