package pg;

public class Teste {

	public static void main(String[] args) {
		CalculaPagamento calcula = new CalculaPagamento();
		Funcionario funcionario = new Funcionario();
		
		funcionario.horasTrabalhadas = 40;
		funcionario.numDependentes = 1;
		funcionario.salarioHora = 10;
		
		System.out.println("Salário bruto: R$" + calcula.calcSalarioBruto(funcionario));
		System.out.println("Desconto INSS: R$" + calcula.calcDescontoINSS(funcionario));
		System.out.println("Imposto de renda: R$" + calcula.calcIR(funcionario));
		System.out.println("Salário líquido: R$" + calcula.calcSalarioLiquido(funcionario));
	}
}
