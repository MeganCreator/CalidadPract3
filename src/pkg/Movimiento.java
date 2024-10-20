package pkg;

public class Movimiento {
	// REINTEGRO 'D' (debe), INGRESO 'H' (haber), 
	public enum Tipo {D, H}
	
	private Double importe;
	private Tipo signo;
	private String detalle;
	
	public Movimiento(Double i, Tipo s) {
		this.importe = i;
		this.signo = s;
	}
	
	public Movimiento(Double i, Tipo s, String d) {
		this.importe = i;
		this.signo = s;
		this.detalle = d;
	}

	public Double getImporte() {
		return importe;
	}

	public void setImporte(Double importe) {
		this.importe = importe;
	}

	public Tipo getSigno() {
		return signo;
	}

	public void setSigno(Tipo signo) {
		this.signo = signo;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
}
