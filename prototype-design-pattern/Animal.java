/* 
Arayuzun Cloneable arayuzunden miras almasini saglayarak Java'ya bu sinifa ait nesnelerin
kopyalabilecegini belirtiyoruz. Kopyalanan nesneler bellekte farkli yerlerde temsil edilir.
Yani derin kopyalama yapilir. Cloneable bir etiketleme arayuzudur.
*/

public interface Animal extends Cloneable{

	public Animal makeCopy();
}