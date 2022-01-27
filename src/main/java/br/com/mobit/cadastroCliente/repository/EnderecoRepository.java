package br.com.mobit.cadastroCliente.repository;

import br.com.mobit.cadastroCliente.model.domain.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

}
