package modelos.entidade3;

public class Circulo3 implements Forma3 {
	
	private Double raio;

	public Circulo3(Double raio) {
		super();
		this.raio = raio;
	}

	public Double getRaio() {
		return raio;
	}

	public void setRaio(Double raio) {
		this.raio = raio;
	}

	@Override
	public double area() {
		return Math.PI * raio * raio;
	}
}
