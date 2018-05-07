public abstract EnemyShip{
	
	private String name;

	// Silah ve motoru temsil eden nesneler
 	// UFOEnemyShipFactory ve UFOBossEnemyShipFactory ye
	// yeni parcalar eklenerek kolayca degistirilebilir

	ESWeapon weapon;
	ESEngine engine;

	public String getName() { return name; }
	public void setName(String name) { this.name = name; }

	abstract void makeShip();

	pubic void followHeroShip(){
		
		System.out.println(getName() + " is following the hero at " + engine);
	}

	public void displayEnemyShip(){
		
		System.out.println(getName() + " is on the screen");
	}

	public void enemyShipShoots(){

		System.out.println(getName() + " attacks and does " + weapon);
	}

	public String toString(){

		return String.format("The %s has a top speed of %s and attack power of %s",
			name, engine, weapon);
	}
} 
