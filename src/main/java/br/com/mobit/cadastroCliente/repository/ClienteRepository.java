package br.com.mobit.cadastroCliente.repository;

import br.com.mobit.cadastroCliente.model.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
