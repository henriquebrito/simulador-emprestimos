package br.com.santander.emprestimo.service;

import java.util.List;

import br.com.santander.emprestimo.model.Cliente;

public interface ClienteService {
	
	Cliente salvar(Cliente cliente);

	List<Cliente> buscarTodos();
	
	Cliente buscarPorId(Integer id);
	
	void excluirCliente(Integer id);
}
