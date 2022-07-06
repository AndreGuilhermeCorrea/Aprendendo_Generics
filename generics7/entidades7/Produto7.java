package entidades7;

import java.util.Objects;

public class Produto7 implements Comparable<Produto7>{

	private String nome7;
	private Double preco7;

	public Produto7(String nome7, Double preco7) {
	this.nome7 = nome7;
	this.preco7 = preco7;
	}

	public String getNome7() {
		return nome7;
	}

	public void setNome7(String name) {
		this.nome7 = name;
	}

	public Double getPreco7() {
		return preco7;
	}

	public void setPreco7(Double preco7) {
		this.preco7 = preco7;
			
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome7, preco7);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto7 other = (Produto7) obj;
		return Objects.equals(nome7, other.nome7) && Objects.equals(preco7, other.preco7);
	}

	@Override
	public String toString() {
		return "Produto7 [nome7=" + nome7 + ", preco7=" + preco7 + "]";
	}

	//método para comparar o nome de um produto com outro
	@Override
	public int compareTo(Produto7 other) {

		return nome7.toUpperCase().compareTo(other.getNome7().toUpperCase());
	}
	
	
	
}
