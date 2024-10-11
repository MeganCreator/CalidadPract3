package pkg;

public class Cuenta {
	
	private double saldo;
	
	public Cuenta(double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void ingresar(double d) {
		saldo += d;
		
	}

}
