package Aula13;

public class Main {

	public static void main(String[] args) {
		Cachorro c = new Cachorro();
		c.reagir("Olá"); //Abanar e latir
		c.reagir("Vai apanhar"); // Rosnar
		c.reagir(11, 45); // abanar
		c.reagir(21, 00); //Ignorar
		c.reagir(true); // abanar
		c.reagir(false); //rosnar e latir
		c.reagir(2, 12.5f); // Latir
		c.reagir(17, 4.5f); // rosnar
	}

}
