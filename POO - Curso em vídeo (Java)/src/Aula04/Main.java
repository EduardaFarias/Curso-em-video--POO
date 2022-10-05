package Aula04;
public class Main {

	public static void main(String[] args) {
	Caneta c1 = new Caneta("NIC", "Amarela", 0.4f);
	c1.status();
	System.out.println("A minha caneta tem modelo: " + c1.getModelo());
	Caneta c2 = new Caneta("KKK", "Laranja", 0.6f);
	c2.status();
	}

}
