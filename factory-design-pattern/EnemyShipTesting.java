import java.util.Scanner;

public class EnemyShipTesting
{
	public static void main(String[] args)
	{
		// Factory nesnesini olustur
		EnemyShipFactory shipFactory = new EnemyShipFactory();
		
		// EnemyShip nesnesi
		EnemyShip theEnemy = null;

		Scanner input = new Scanner(System.in);

		System.out.println("What type of ship? (U / R / B)");

		if(input.hasNextLine())
		{
			String typeOfShip = input.nextLine();
			
			theEnemy = shipFactory.makeEnemyShip(typeOfShip);

			if(theEnemy != null)
				doStuffEnemy(theEnemy);
			else System.out.println("Please enter U, R, or B next time");
		}

		/*
		// Yanlis kullanim

		EnemyShip theEnemy = null;
		
		// Bu sekilde dinamik olmaz
		
		EnemyShip ufoShip = new UFOEnemyShip();
		
		doStuffEnemy(ufoShip);
		
		System.out.print("\n");
		
		// -----------------------------------------
		
		// Bu sekilde dinamik olur fakat iyi bir pratik degil
		// Daha buyuk projelerde yeni bir ekleme yapildiginde
		// if/else ile karar verilen her yeri degistirmek gerekir
		
		Scanner userInput = new Scanner(System.in);
		
		String enemyShipOption = "";
		
		System.out.print("What type of ship? (U or R)");
		
		if (userInput.hasNextLine()){
			
			enemyShipOption = userInput.nextLine();
			
		}
		
		if (enemyShipOption == "U"){
			
			theEnemy = new UFOEnemyShip();

			
		} else 
		
		if (enemyShipOption == "R"){
			
			theEnemy = new RocketEnemyShip();
			
		} else {
			
			theEnemy = new BigUFOEnemyShip();
			
		}
		
		doStuffEnemy(theEnemy);
		
		// --------------------------------------------
		*/
		
	}

	// Ust sinifin metodlarini yurutur
	public static void doStuffEnemy(EnemyShip anEnemyShip)
	{
		anEnemyShip.displayEnemyShip();
		
		anEnemyShip.followHeroShip();
		
		anEnemyShip.enemyShipShoots();
	}
}			
