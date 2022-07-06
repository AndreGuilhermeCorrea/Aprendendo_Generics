package modelos.entidade3;

public class Retangulo3 implements Forma3 {

	private Double largura;
	private Double altura;

	public Retangulo3(Double largura, Double altura) {
			super();
			this.largura = largura;
			this.altura = altura;
		}

	public Double getLargura() {
		return largura;
	}

	public void setLargura(Double largura) {
		this.largura = largura;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	@Override
	public double area() {
		return largura * altura;
	}
}