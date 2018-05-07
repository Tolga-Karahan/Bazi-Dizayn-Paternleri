public abstract class EnemyShipBuilding{
	
	// EnemyShip nesnelerinin uretilmesi icin bir siparis mekanizmasi saglar
	// EnemyShip nesneleri bir silah(weapon), bir motor(engine) ve isme sahiptir
	

	// Silah ve motor icin kullanilan spesifik parcalar bu metoda gecirilen
	// String e baglidir

	protected abstract EnemyShip makeEnemyShip(String typeOfShip);

	// Bu metod cagirildiginda yeni bir EnemyShip uretilir
	// Spesifik parcalar gecirilen String e baglidir 
	
	public EnemyShip orderTheShip(String typeOfShip)
	{
		EnemyShip theEnemyShip = makeEnemyShip(typeOfShip);

		theEnemyShip.makeShip();
		theEnemyShip.displayEnemyShip();
		theEnemyShip.followHeroShip();
		theEnemyShip.enemyShipShoots();
	
		return theEnemyShip;
	}

}	

	
