package pg;

public class CalculaPagamento {
	
	public double calcSalarioBruto(Funcionario funcionario) {
		return funcionario.getHorasTrabalhadas() * funcionario.getSalarioHora() + (50 * funcionario.getNumDependentes());
	}
	
	public double calcDescontoINSS(Funcionario funcionario) {
		if (calcSalarioBruto(funcionario) <= 1000) {
			return calcSalarioBruto(funcionario) * 8.5/100;
		} else {
			return calcSalarioBruto(funcionario) * 9/100;
		}
	}
	
	public double calcIR(Funcionario funcionario) {
		if (calcSalarioBruto(funcionario) <= 500) {
			return 0;
		} else if (calcSalarioBruto(funcionario) > 500 && calcSalarioBruto(funcionario) <= 1000){
			return calcSalarioBruto(funcionario) * 5/100;
		} else {
			return calcSalarioBruto(funcionario) * 7/100;
		}
	}
	
	public double calcSalarioLiquido(Funcionario funcionario) {
		return calcSalarioBruto(funcionario) - calcDescontoINSS(funcionario) - calcIR(funcionario);
	}
}
