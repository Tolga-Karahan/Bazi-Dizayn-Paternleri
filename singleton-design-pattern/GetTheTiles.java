import java.util.LinkedList;

public class GetTheTiles implements Runnable{

	public void run(){

		Singleton newInstance = Singleton.getInstance();

		// Nesne icin benzersiz bir id al
		System.out.println("1st Instance ID: " + System.identityHashCode(newInstance));

		// Listede tutulan harfleri goster
		System.out.println(newInstance.getLetterList());

		// 7 tane harf al
		LinkedList<String> playerOneTiles = newInstance.getTiles(7);

		System.out.println("Player 1: " + playerOneTiles);

		System.out.println("Got Tiles");
	}
}