package br.com.mobit.cadastroCliente.model.domain;

import br.com.mobit.cadastroCliente.model.TipoEndereco;
import br.com.mobit.cadastroCliente.model.dto.ClienteDTO;
import br.com.mobit.cadastroCliente.model.dto.EnderecoDTO;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "endereco")
public class Endereco implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "cep")
    private String cep;

    @Column(name = "bairro")
    private String bairro;

    @Column(name = "cidade")
    private String cidade;

    @Column(name = "uf")
    private String uf;

    @Column(name = "logradouro")
    private String logradouro;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "tipoEndereco")
    private TipoEndereco tipoEndereco;

    @OneToOne(mappedBy = "endereco")
    private Cliente cliente;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public TipoEndereco getTipoEndereco() {
        return tipoEndereco;
    }

    public void setTipoEndereco(TipoEndereco tipoEndereco) {
        this.tipoEndereco = tipoEndereco;
    }
}
