public class Animal
{
	private String name;
	private double height;
	private int weight;
	private String favFood;
	private double speed;
	private String sound;
	public Flys flyingType;

	public void setName(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void setHeight(double height)
	{
		this.height = height;
	}

	public double getHeight()
	{
		return height;
	}

	public void setWeight(int weight)
	{
		if(weight > 0)
			this.weight = weight;
		else
			System.out.println("Weight must be bigger than 0");
	}

	public void setFavFood(String favFood)
	{
		this.favFood = favFood;

	}

	public String getFavFood()
	{
		return favFood;
	}

	public void setSpeed(double speed)
	{
		this.speed = speed;
	}

	public double getSpeed()
	{
		return speed;
	}

	public void setSound(String sound)
	{
		this.sound = sound;
	}

	public String getSound()
	{
		return sound;
	}

	/* Yanlis kullanim
	* Alt siniflar arasinda farklilik gosteren seylerle ust sinifi ayirmak istiyoruz
	
	public void fly()
	{
		System.out.println("I'm flying");
	}
	*/

	public String tryToFly()
	{
		return flyingType.fly();
	}

	// flyingType degiskenini dinamik olarak degistirmek icin kullanilabilir
	public void setFlyingAbility(Flys newFlyType)
	{
		this.flyingType = newFlyType;
	} 

}	
	
