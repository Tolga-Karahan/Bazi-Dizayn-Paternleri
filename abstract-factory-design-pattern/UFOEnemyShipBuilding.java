// EnemyShip nesneleri uretimi icin nasil bir secenek sunulacagi
// belirlenirken degistirilmesi gereken tek sinif bu siniftir

public class UFOEnemyShipBuilding extends EnemyShipBuilding{

	protected EnemyShip makeEnemyShip(String typeOfShip)
	{
		EnemyShip theEnemyShip = null;
		
		// UFO isteginde bulunulmussa uygun dusen silah ve
		// motorlari bilen bir factory kullanilir
		
		if(typeOfShip.equals("UFO")){
			EnemyShipFactory shipPartsFactory = new UFOEnemyShipFactory();	
			theEnemyShip = new UFOEnemyShip(shipPartsFactory);
			theEnemyShip.setName("UFO Grunt Ship");
		} else
		
		// UFO BOSS isteginde bulunulmussa uygun dusen silah ve
		// motorlari bilen bir factory kullanilir

		if(typeOfShip.equals("UFO BOSS")){
			EnemyShipFactory shipPartsFactory = new UFOBossEnemyShipFactory();
			theEnemyShip = new UFOBossEnemyShip(shipPartsFactory);
			theEnemyShip.setName("UFO Boss Ship");
		}

		return theEnemyShip;
	}
}
