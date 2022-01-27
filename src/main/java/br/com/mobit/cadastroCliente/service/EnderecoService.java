package br.com.mobit.cadastroCliente.service;

import br.com.mobit.cadastroCliente.model.domain.Endereco;
import br.com.mobit.cadastroCliente.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    public Endereco criar(final Endereco endereco) {
        return enderecoRepository.save(endereco);
    }

    public Endereco obter(final Long id) {
        return enderecoRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Endereço não localizado."));
    }

    public Endereco atualizar(final Endereco endereco) {
        return enderecoRepository.save(endereco);
    }

    public void deletar(final Long id) {
        enderecoRepository.deleteById(id);
    }
}
