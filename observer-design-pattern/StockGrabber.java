import java.util.ArrayList;

// Subject arayuzunu kullanarak tum Observerlari gunceller

public class StockGrabber implements Subject
{
	private ArrayList<Observer> observers;
	private double ibmPrice;
	private double aaplPrice;
	private double googPrice;

	public StockGrabber()
	{	
		// Tum Observerlari tutacak bir ArrayList olusturur
		observers = new ArrayList<Observer>();
	}

	public void register(Observer newObserver)
	{
		// ArrayList e yeni bir Observer ekler
		observers.add(newObserver);
	}

	public void unregister(Observer deleteObserver)
	{
		// Silinecek Observerin indeksini al
		int observerIndex = observers.indexOf(deleteObserver);

		// Mesaji yazdir
		System.out.println("Observer " + observerIndex + " is deleted");
		
		// Observeri ArrayListten sil
		observers.remove(observerIndex);
	}

	public void notifyObserver()
	{
		// Tum Observerlari gez ve fiyat degisiklikleri bildir
		for(Observer observer : observers)
			observer.update(ibmPrice, aaplPrice, googPrice);
	}

	// Teker teker fiyat degisiklikleri ve Observerlara yeni fiyatin bildirilmesi
	
	public void setIBMPrice(double newIBMPrice)
	{
		this.ibmPrice = newIBMPrice;
		notifyObserver();
	}

	public void setAAPLPrice(double newAAPLPrice)
	{
		this.aaplPrice = newAAPLPrice;
		notifyObserver();
	}

	public void setGOOGPrice(double newGOOGPrice)
	{
		this.googPrice = newGOOGPrice;
		notifyObserver();
	}
}
