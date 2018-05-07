// Abstract Factory paterni ile sadece gemileri degil
// ayni zamanda geminin tum parcalarinida olustururuz

// Burada bir nesnenin EnemyShip olabilmesi icin gerekli
// olan kısımlar tanımlanır

public interface EnemyShipFactory{
	
	public ESWeapon addESGun();
	public ESEngine addESEngine();
}

