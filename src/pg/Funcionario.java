package pg;

public class Funcionario {

	// Atributos (privados)
	private int horasTrabalhadas;
	private int numDependentes;
	private double salarioHora;
	
	// Métodos GET acessam os atributos privados e sempre retornam um valor
	public int getHorasTrabalhadas() {
		return horasTrabalhadas;	// retorno do atributo
	}
	
	public int getNumDependentes() {
		return numDependentes;
	}
	
	public double getSalarioHora() {
		return salarioHora;
	}
	
	// Métodos SET modificam os valores de um atributo da classe de maneira protegida
	// Usamos void pois não há retorno, o atributo será somente modificado.
	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	
	public void setNumDependentes(int numDependentes) {
		this.numDependentes = numDependentes;
	}
	
	public void setSalarioHora(double salarioHora) {
		this.salarioHora = salarioHora;
	}
	
}
