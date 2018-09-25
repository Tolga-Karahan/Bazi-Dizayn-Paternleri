public class TestCloning{

	public static void main(String[] args){

		CloneFactory animalMaker = new CloneFactory();

		Sheep keko = new Sheep();

		// Keko'dan yeni bir kopya olusturur ve bellekte farkli bir yerde saklar

		Sheep clonedSheep = (Sheep) animalMaker.getClone(keko);

		// Nesneler birbirlerinin tam olarak kopyasidir fakat farklı referanslara sahiptirler

		System.out.println(keko);

		System.out.println(clonedSheep);

		System.out.println("Keko's hash code: " + System.identityHashCode(keko));

		System.out.println("Clone's hash code: " + System.identityHashCode(clonedSheep));


	}
}