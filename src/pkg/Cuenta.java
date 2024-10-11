package pkg;

public class Cuenta {
	
	private double saldo;
	private String numero;
	
	public Cuenta(String numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void ingresar(double d) {
		saldo += d;
		
	}

	public void retirar(double d) {
		saldo -= d;
	}
	

}
