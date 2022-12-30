package Aula12;

public class Main {
	public static void main(String[] args) {
		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		Canguru canguru =  new Canguru();
		Cachorro cachorro = new Cachorro();
		Cobra cobra = new Cobra();
		Tartaruga tartaruga = new Tartaruga();
		GoldFish gold = new GoldFish();
		Arara arara = new Arara();
		
		canguru.locomover();
		cachorro.locomover();
		cachorro.emitirSom();
		canguru.emitirSom();
		
		
		
	}

}
