/*

	Bu sinif bir Animal ve ya alt siniflarindan birini alir ve bir kopyasini uretir.
Kopya nesne bellekte farkli bir yerde tutulur. CloneFactory kopyalanan nesnenin ne
olduguna dair bir bilgiye sahip degildir. Sadece arguman olarak alinan nesnenin bir
Animal oldugunu bilir.

*/

public class CloneFactory{

	public Animal getClone(Animal animalSample) {

		// Polimorfizm sayesinde ilgili alt sinifin makeCopy metodu cagirilir.

		return animalSample.makeCopy();

	}
}