// Gorevi sadece nesneleri uretmek olan factory sinif
// Nesnelerin olusturulmasi kapsullendiginden degisiklikler
// tek bir yerde yapilir

public class EnemyShipFactory
{
	// statik metodda olabilir
	
	public EnemyShip makeEnemyShip(String newShipType)
	{
		EnemyShip newShip = null;

		if(newShipType.equals("U")){
			return new UFOEnemyShip();
		} else
		
		if(newShipType.equals("R")){
			return new RocketEnemyShip();
		} else

		if(newShipType.equals("B")){
			return new BigUFOEnemyShip();
		} else return null; 
	}
}	