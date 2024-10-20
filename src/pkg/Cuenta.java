package pkg;

import java.util.List;
import pkg.Movimiento.Tipo;

public class Cuenta {
	
	private double saldo;
	private String numero;
	private String titular;
	private List<Movimiento> movimientos;
	

	public Cuenta(String numero, double saldo, String titular, List<Movimiento> movimientos) {
		this.numero = numero;
		this.saldo = saldo;
		this.titular = titular;
		this.movimientos = movimientos;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double s) {
		this.saldo = s;
	}
	
	public List<Movimiento> getMovimientos(){
		return movimientos;
	}
	
	public String getNumero() {
		return numero;
	}

	public void ingresar(Double d) {
		saldo += d;
		movimientos.add(new Movimiento(d, Tipo.H));
		
	}

	public void retirar(Double d) {
		if (saldo - d >= -500) {
			saldo -= d;
			movimientos.add(new Movimiento(d, Tipo.D));
		}
	}
	
}
