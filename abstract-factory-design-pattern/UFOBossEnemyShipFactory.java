// Bu factory EnemyShipFactory arayuzunu kullanarak
// spesifik UFOEnemyShip nesnelerinin uretilmesini saglar

// Gemiye ait parcalar burada tanimlanir ve
// arayuz metodlari implement edilir

public class UFOBossEnemyShipFactory implements EnemyShipFactory{

	// Gemiye eklenecek silah nesnesini tanimlar

	public ESWeapon addESGun(){
		return new ESUFOBossGun();
	}

	// Gemiye eklenecek motor nesnesini tanimlar
	
	public ESEngine addESEngine(){
		return new ESUFOBossEngine();
	}
}	

	
