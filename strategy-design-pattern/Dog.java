public class Dog extends Animal{
	
	public void digHole(){
		
		System.out.println("Dug a hole");
		
	}
	
	public Dog(){
		
		super();
		
		setSound("Bark");
		
		// flyingType polimorfik olarak setleniyor
		
		flyingType = new CantFly();
		
	}
	
	/* Kotu kullanim
	*  fly metodu override edilebilir fakat alt siniflar arasinda farkli olan 
	*  seyleri soyutlamak istiyoruz
	public void fly(){
		
		System.out.println("I can't fly");
		
	}
	*/
	
}
