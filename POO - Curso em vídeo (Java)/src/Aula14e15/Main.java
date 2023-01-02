package Aula14e15;

public class Main {

	public static void main(String[] args) {
		Video[] v = new Video[3];
		v[0] = new Video("Aula 1 de POO");
		v[1] = new Video("Aula 12 de PHP");
		v[2] = new Video("Aula 10 de HTML5");
		
		Gafanhoto[] g = new Gafanhoto[2];
		g[0] = new Gafanhoto("Jubileu", 22, "M", "Juba");
		g[1] = new Gafanhoto("Creuza", 12, "F", "Creuzita");
		
		/*
		 * System.out.println("Vídeos\n-----------------");
		 * System.out.println(v[0].toString()); 
		 * System.out.println(v[1].toString());
		 * System.out.println(v[2].toString());
		 * System.out.println("\nGafanhotos\n-----------------");
		 * System.out.println(g[0].toString());
		 *  System.out.println(g[1].toString());
		 * 
		 * System.out.println(vis1.toString());
		 * System.out.println("-------------------"); 
		 * Visualizacao(g[0], v[1]); System.out.println(vis2.toString());
		 */
		/*
		 * Visualizacao(g[1], v[0]); System.out.println(g[0].toString());
		 * System.out.println(""); System.out.println(v[0].toString());
		 */
		
		Visualizacao vis1 = new Visualizacao(g[0], v[0]);
		Visualizacao vis2 = new Visualizacao(g[0], v[1]);
		System.out.println(vis1.toString());
		 

	}

}
