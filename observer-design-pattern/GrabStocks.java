public class GrabStocks
{
	public static void main(String[] args)
	{
		// Subject nesnesini olustur
		// Bu nesne Observerlarin eklenmesi, silinmesi
		// guncellenmesi gibi islemler ile ilgilenecek
		StockGrabber stockGrabber = new StockGrabber();
		
		StockObserver observer1 = new StockObserver(stockGrabber);
		stockGrabber.setIBMPrice(185.12);
		stockGrabber.setAAPLPrice(315.47);
		stockGrabber.setGOOGPrice(435.94);

		StockObserver observer2 = new StockObserver(stockGrabber);
		stockGrabber.setIBMPrice(185.12);
                stockGrabber.setAAPLPrice(315.47);
                stockGrabber.setGOOGPrice(435.94);

		// Fiyatlari guncelle
		stockGrabber.setIBMPrice(175.72);
                stockGrabber.setAAPLPrice(415.87);
                stockGrabber.setGOOGPrice(455.93);

		// observer2'yi sil
		stockGrabber.unregister(observer2);
	}
}

