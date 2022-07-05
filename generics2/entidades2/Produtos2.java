package entidades2;

//a classe Produtos2 implementa a classe  Comparable<Produtos2>

public class Produtos2 implements Comparable<Produtos2> {

	private String name;
	private Double price;

	public Produtos2(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return name + ", " + String.format("%.2f", price);
	}
	
	//comparar o preco de um porduto onde esta para o outro produto do argumento
	@Override
	public int compareTo(Produtos2 other) {
		return price.compareTo(other.getPrice());
	}
}