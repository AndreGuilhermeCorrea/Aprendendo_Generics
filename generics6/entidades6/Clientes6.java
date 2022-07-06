package entidades6;

import java.util.Objects;

public class Clientes6 {

	private String nome;
	private String email;

	// construtor com argumentos
	public Clientes6(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}

	// gethers e sethers
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	// implementação padrao de hash code (email e nome)

	@Override
	public int hashCode() {
		return Objects.hash(email, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Clientes6 other = (Clientes6) obj;
		return Objects.equals(email, other.email) && Objects.equals(nome, other.nome);
	}





}
