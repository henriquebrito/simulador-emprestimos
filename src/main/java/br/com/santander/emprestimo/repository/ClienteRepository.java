package br.com.santander.emprestimo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.santander.emprestimo.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

	Cliente findByNome(String nome);
	

}
