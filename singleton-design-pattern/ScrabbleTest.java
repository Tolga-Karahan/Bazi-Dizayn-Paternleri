import java.util.LinkedList;

public class ScrabbleTest{

	public static void main(String[] args){

		Singleton newInstance = Singleton.getInstance();

		// Nesne icin benzersiz bir id al
		System.out.println("1st Instance ID: " + System.identityHashCode(newInstance));

		// Listede tutulan harfleri goster
		System.out.println(newInstance.getLetterList());

		// 7 tane harf al
		LinkedList<String> playerOneTiles = newInstance.getTiles(7);

		System.out.println("Player 1: " + playerOneTiles);

		System.out.println(newInstance.getLetterList());

		// Yeni bir nesne uretmeyi deneyebiliriz, fakat ayni nesne geriye dondurulur
		Singleton anotherInstance = Singleton.getInstance();

		// Nesne icin benzersiz bir id al
		System.out.println("2st Instance ID: " + System.identityHashCode(anotherInstance));

		// Listede tutulan harfleri goster
		System.out.println(anotherInstance.getLetterList());

		// 7 tane harf al
		LinkedList<String> playerTwoTiles = anotherInstance.getTiles(7);

		System.out.println("Player 2: " + playerTwoTiles);

		System.out.println(anotherInstance.getLetterList());


	}
}