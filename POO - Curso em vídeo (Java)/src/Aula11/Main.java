package Aula11;

public class Main {

	public static void main(String[] args) {
		Visitante v1 = new Visitante();
		v1.setName("Juvenal");
		v1.setIdade(22);
		v1.setSexo("M");
		System.out.println(v1.toString());
		System.out.println("\n-------------------");
		Aluno a1 = new Aluno();
		a1.setName("Cláudio");
		a1.setMatricula(1111);
		a1.setCurso("Informática");
		a1.setIdade(16);
		a1.setSexo("M");
		a1.pagarMensalidade();
		System.out.println(a1.toString());
		
		System.out.println("\n------------------");
		Bolsista b1 = new Bolsista();
		b1.setMatricula(1112);
		b1.setName("Jubileu");
		b1.setBolsa(12.5f);
		b1.setSexo("M");
		b1.pagarMensalidade();
		
		
	}

}
