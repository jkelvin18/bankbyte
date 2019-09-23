
public class TesteTributaveis {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(111, 11);
		cc.deposita(100);

		SeguroDeVida seguro = new SeguroDeVida();

		CalculadorImposto calc = new CalculadorImposto();
		calc.registra(cc);
		calc.registra(seguro);

		System.out.print(calc.getTotalImposto());

	}

}
