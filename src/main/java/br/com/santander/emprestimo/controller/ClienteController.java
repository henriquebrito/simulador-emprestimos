package br.com.santander.emprestimo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.santander.emprestimo.model.Cliente;
import br.com.santander.emprestimo.model.dto.ClienteInputDto;
import br.com.santander.emprestimo.repository.ClienteRepository;

@RestController
@RequestMapping("clientes")
public class ClienteController {

	private ClienteRepository clienteRepository;

	@Autowired
	public ClienteController(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Cliente salvar(@RequestBody ClienteInputDto clienteDto) {
		Cliente cliente = clienteDto.converte();
		return clienteRepository.save(cliente);
	}
	
	@GetMapping("/{id}")
	public Cliente buscarPorId(@PathVariable Integer id) {
		return clienteRepository.getOne(id);
	}
	
	@GetMapping
	public Cliente buscarPorNome(String nome) {
		return clienteRepository.findByNome(nome);
	}
}
