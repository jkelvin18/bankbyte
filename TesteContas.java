
public class TesteContas {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(1111, 11);
		cc.deposita(100);

		ContaPoupanca cp = new ContaPoupanca(2222, 22);
		cp.deposita(100);

		cc.transfere(10.0, cp);
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());

	}

}
