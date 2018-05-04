// Subjectteki degisiklikleri izleyen Observerlari temsil eden sinif

public class StockObserver implements Observer
{
	private double ibmPrice;
	private double aaplPrice;
	private double googPrice;

	// Observer sayisini tutan statik degisken
	private static int observerIDTracker = 0;

	// Observer IDsi
	private int observerID;

	// Observerin bagli oldugu Subject
	private Subject stockGrabber;
	
	public StockObserver(Subject stockGrabber)
	{
		// Subject metodlarina erisebilmek icin referans tutulur
		this.stockGrabber = stockGrabber;

		// Observer IDsini ata
		observerID = ++observerIDTracker;
		
		// Mesaji yaz
		System.out.println("New Observer " + this.observerID);

		// Observeri Subjecte kaydet
		stockGrabber.register(this);
	}

	public void update(double ibmPrice, double aaplPrice, double googPrice)
	{
		this.ibmPrice = ibmPrice;
		this.aaplPrice = aaplPrice;
		this.googPrice = googPrice;
		
		printThePrices();
	}

	public void printThePrices()
	{
		System.out.println(observerID + "\nIBM: " + ibmPrice + "\nAAPL: " +
			aaplPrice + "\ngoogPrice " + googPrice + "\n");
	}
}
		
	
	
	
