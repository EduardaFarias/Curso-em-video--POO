package Aula02;
public class Main {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.cor = "Azul";
		c1.ponta = 0.5f;
		c1.tampada = false;
		c1.carga = 10;
		c1.tampar();
		c1.Status();
		c1.rabiscar();
		
		Caneta c2 = new Caneta();
		c2.modelo = "Hostenet";
		c2.cor = "Preta";
		c2.destampar();
		c2.Status();
		c2.rabiscar();
	}

}
