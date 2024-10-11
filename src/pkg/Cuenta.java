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
	
	public void setSaldo(double s) {
		this.saldo = s;
	}
	
	public void ingresar(double d) {
		saldo += d;
		
	}

	public void retirar(double d) {
		
		/*if((saldo - d) < -500) {
			System.out.println("Fondos insuficientes (saldo " + saldo + "€) "
					+ "en la cuenta " + numero + " para el reintegro de " + d + "€∫" );
		}else {saldo -= d;}*/
		
		saldo -= d;
		
	}
	

}
