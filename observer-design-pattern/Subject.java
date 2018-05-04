// Observerların eklenmesi, silinmesi, guncellenmesi gibi
// islemleri yerine getiren arayuz

public interface Subject
{
	public void register(Observer o);
	public void unregister(Observer o);
	public void notifyObserver();
}


