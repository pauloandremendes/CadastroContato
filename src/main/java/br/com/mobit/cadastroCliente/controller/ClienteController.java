package br.com.mobit.cadastroCliente.controller;

import br.com.mobit.cadastroCliente.model.domain.Cliente;
import br.com.mobit.cadastroCliente.model.dto.ClienteDTO;
import br.com.mobit.cadastroCliente.service.ClienteService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping
    public ClienteDTO criar(@RequestBody final ClienteDTO dto) {
        final Cliente cliente = modelMapper.map(dto, Cliente.class);
        final Cliente clienteSalvo = clienteService.criar(cliente);
        return modelMapper.map(clienteSalvo, ClienteDTO.class);
    }

    @GetMapping(path = "/{id}")
    public ClienteDTO obter(@PathVariable final Long id) {
        final Cliente cliente = clienteService.obter(id);
        return modelMapper.map(cliente, ClienteDTO.class);
    }

    @PutMapping
    public ClienteDTO atualizar(@RequestBody final ClienteDTO dto) {
        final Cliente cliente = modelMapper.map(dto, Cliente.class);
        final Cliente clienteAtualizado = clienteService.atualizar(cliente);
        return modelMapper.map(clienteAtualizado, ClienteDTO.class);
    }

    @DeleteMapping(path = "/{id}")
    public void deletar(@PathVariable final Long id) {
        clienteService.deletar(id);
    }
}
