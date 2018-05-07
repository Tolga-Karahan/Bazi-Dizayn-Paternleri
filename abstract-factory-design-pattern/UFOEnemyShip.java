public class UFOEnemyShip extends EnemyShip{

	EnemyShipFactory shipFactory;

	public UFOEnemyShip(EnemyShipFactory shipFactory){
		this.shipFactory = shipFactory;
	}

	// EnemyShipBuilding bu metodu cagirarak spesifik bir
	// UFOEnemyShip olusturur

	void makeShip(){

		System.out.println("Making enemy ship " + getName());

		// Gerekli olan spesifik silah ve motor shipFactory
		// icerisinde gecirilmisti. Bu spesifik parcalar
		// UFOEnemyShip e burada atanir

		weapon = shipFactory.getESGun();
		engine = shipFactory.getESEngine();
	}
}
