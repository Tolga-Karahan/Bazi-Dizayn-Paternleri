// Bu factory EnemyShipFactory arayuzunu kullanarak 
// spesifik UFOEnemyShip nesnelerinin uretilmesini saglar

// Gemiye ait tum parcalar burada tanimlanir ve 
// arayuz metodlari implement edilir

public class UFOEnemyShipFactory implements EnemyShipFactory{

	// Gemiye eklenecek silah nesnesini tanimlar
	
	public ESWeapon addESGun(){
		return new ESUFOGun();
	}

	// Gemiye eklenecek motor nesnesini tanimlar

	public ESEngine addESEngine(){
		return new ESUFOEngine();
	}
}


