package dao;

import java.util.List;

import teste.Cliente;

public interface IClienteDAO {
	
	public List<Cliente> listarClientes();
	
	public List<Cliente> listarClientesAtivos();
	
}