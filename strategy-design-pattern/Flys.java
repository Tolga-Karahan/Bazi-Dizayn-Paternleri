// interface baska siniflar tarafindan da 
// iplement edilerek baska davranislar olusturulabilir.
// Ust sinif ve alt sinif bundan etkilenmez.

public interface Flys {
	
   String fly();
   
}

class ItFlys implements Flys{

	public String fly() {
		
		return "Flying High";
		
	}
	
}

class CantFly implements Flys{

	public String fly() {
		
		return "I can't fly";
		
	}
	
}
