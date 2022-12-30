package Aula11;

public abstract class Pessoa {
	private String name;
	private int idade;
	private String sexo;
	
	public void fazerAniversario() {
		this.idade++;
	}
	
	
	@Override
	public String toString() {
		return "Pessoa [name=" + name + ", idade=" + idade + ", sexo=" + sexo + "]";
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	
}
