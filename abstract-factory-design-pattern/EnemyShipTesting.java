public class EnemyShipTesting{
	
	public static void main(String[] args)
	{
		// EnemyShipBuilding sinifi yeni EnemyShip nesneleri icin istekleri karsilar
		// orderTheShip metodu kullanilarak istenilen nesne belirtilir ve metod
		// istegi uygun factory e gonderir
		
		EnemyShipBuilding makeUFOs new = UFOEnemyShipBuilding();
		
		EnemyShip theGrunt = makeUFOs.orderTheShip("UFO");
		System.out.println(theGrunt + "\n");

		EnemyShip theGrunt = makeUFOs.orderTheShip("UFO BOSS");
		System.out.println(theGrunt + "\n");
	}
}	

