package br.com.santander.emprestimo.service;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.stereotype.Service;

import br.com.santander.emprestimo.model.Cliente;
import br.com.santander.emprestimo.repository.ClienteRepository;

@Service
public class ClienteImpl implements ClienteService{

	private final ClienteRepository clienteRepository;
	
	public ClienteImpl(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}
	
	@Override
	public Cliente salvar(Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}

	@Override
	public List<Cliente> buscarTodos() {
		return this.clienteRepository.findAll();
	}

	@Override
	public Cliente buscarPorId(Integer id) {
		return clienteRepository.findById(id)
				.orElseThrow(() -> new EntityNotFoundException("Não existe cliente com este id: "+id));
	}

	@Override
	public void excluirCliente(Integer id) {
		clienteRepository.deleteById(id);;
	}

}
