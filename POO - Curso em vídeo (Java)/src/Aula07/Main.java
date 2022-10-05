package Aula07;
//Ultra emoji combat, Objetos compostos em java
public class Main {

	public static void main(String[] args) {
		Lutador[] l = new Lutador[6];
		l[0] = new Lutador("Pretty boy", "França",31, 1.75f, 68,11, 2, 1);
		l[0].apresentar();
	}

}
