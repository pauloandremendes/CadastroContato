package br.com.mobit.cadastroCliente.controller;

import br.com.mobit.cadastroCliente.model.domain.Endereco;
import br.com.mobit.cadastroCliente.model.dto.EnderecoDTO;
import br.com.mobit.cadastroCliente.service.EnderecoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/enderecos")
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping
    public EnderecoDTO criar(@RequestBody final EnderecoDTO dto) {
        final Endereco endereco = modelMapper.map(dto, Endereco.class);
        final Endereco enderecoSalvo = enderecoService.criar(endereco);
        return modelMapper.map(enderecoSalvo, EnderecoDTO.class);
    }

    @GetMapping
    public EnderecoDTO obter(@PathVariable final Long id) {
        final Endereco endereco = enderecoService.obter(id);
        return modelMapper.map(endereco, EnderecoDTO.class);
    }

    @PutMapping
    public EnderecoDTO atualizar(@RequestBody final EnderecoDTO dto) {
        final Endereco endereco = modelMapper.map(dto, Endereco.class);
        final Endereco enderecoAtualizado = enderecoService.atualizar(endereco);
        return modelMapper.map(enderecoAtualizado, EnderecoDTO.class);
    }

    @DeleteMapping
    public void deletar(@PathVariable Long id) {
        enderecoService.deletar(id);
    }
}
