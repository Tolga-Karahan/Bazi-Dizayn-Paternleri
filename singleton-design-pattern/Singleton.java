import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Singleton{

	private static Singleton firstInstance = null;

	String[] scrabbleLetters = {"a", "a", "a", "a", "a", "a", "a", "a", "a",
			"b", "b", "c", "c", "d", "d", "d", "d", "e", "e", "e", "e", "e", 
			"e", "e", "e", "e", "e", "e", "e", "f", "f", "g", "g", "g", "h", 
			"h", "i", "i", "i", "i", "i", "i", "i", "i", "i", "j", "k", "l", 
			"l", "l", "l", "m", "m", "n", "n", "n", "n", "n", "n", "o", "o", 
			"o", "o", "o", "o", "o", "o", "p", "p", "q", "r", "r", "r", "r", 
			"r", "r", "s", "s", "s", "s", "t", "t", "t", "t", "t", "t", "u", 
			"u", "u", "u", "v", "v", "w", "w", "x", "y", "y", "z"};

	private LinkedList<String> letterList = new LinkedList<String>
		(Arrays.asList(scrabbleLetters));

	// Ilk thread i yavaslatmak icin kullanilir
	static boolean firstThread = true;

	// Kullanicilarin baska nesneler uretmesini engellemek icin private yapildi
	// Sadece Singleton sinifi tek bir nesne uretebilir
	private Singleton() { }

	// Birden fazla thread kullanimi nedeniyle Singleton sinifindan birden fazla
	// nesne uretilebilir. Bunun onunce gecmek icin metoda synchronized keywordu
	// ekleyebiliriz fakat bu ciddi bir yavaslamaya neden olur. Dolayisiyla tum
	// metod yerine sadece gerekli kod bloguna synchronized koyulur
	public static Singleton getInstance() {

		if(firstInstance == null){

			// Bu kisim deneysel amaclarla yazilmistir
			if(firstThread){

				firstThread = false;

				try{
					Thread.currentThread();
					Thread.sleep(1000);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
			}

			synchronized(Singleton.class){

				if(firstInstance == null){

					firstInstance = new Singleton();
					Collections.shuffle(firstInstance.letterList);

				}

			}

		}

		return firstInstance;
	}

	public LinkedList<String> getLetterList(){
		return firstInstance.letterList;
	}

	public LinkedList<String> getTiles(int howManyTiles){

		LinkedList<String> tilesToSend = new LinkedList<String>();

		for(int i = 0; i < howManyTiles; i++){
			tilesToSend.add(firstInstance.letterList.remove(0));
		}

		return tilesToSend;	
	}
}