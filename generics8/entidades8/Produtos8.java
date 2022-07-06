package entidades8;

import java.util.Objects;

public class Produtos8{
	
	
	private String nome8;
	private Double preco8;
	
	public Produtos8(String nome8, Double preco8) {
		this.nome8 = nome8;
		this.preco8 = preco8;
	}

	public String getNome8() {
		return nome8;
	}

	public void setNome8(String nome8) {
		this.nome8 = nome8;
	}

	public Double getPreco8() {
		return preco8;
	}

	public void setPreco8(Double preco8) {
		this.preco8 = preco8;
	}

	
	//HASH CODE
	@Override
	public int hashCode() {
		return Objects.hash(nome8, preco8);
	}

	//EQUALS
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produtos8 other = (Produtos8) obj;
		return Objects.equals(nome8, other.nome8) && Objects.equals(preco8, other.preco8);
	}

	
}



