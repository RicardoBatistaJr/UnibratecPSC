package teste;

import javax.persistence.Entity;
import javax.persistence.Id;

import Interfaces.InterfaceEntidade;

@Entity
public class Cliente implements InterfaceEntidade {
	
	@Id
	int CPF;
	String nome;
	String email;
	
	public int getCPF() {
		return CPF;
	}
	public void setCPF(int cPF) {
		CPF = cPF;
	}
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
	public Object getPK() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}