package br.com.pacotes.entitys;

import br.com.pacotes.enums.StatusFornecedorEnum;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "FORNECEDORES")
public class Fornecedores {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private Long id;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "CNPJ")
    private Long cnpj;
    @Column(name = "ENDERECO")
    private String endereco;
    @Column(name = "TELEFONE")
    private String telefone;
    @Column(name = "STATUS")
    private StatusFornecedorEnum statusFornecedorEnum;

    public Fornecedores(String nome, Long cnpj, String endereco, String telefone, StatusFornecedorEnum statusFornecedorEnum) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.telefone = telefone;
        this.statusFornecedorEnum = statusFornecedorEnum;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCnpj() {
        return cnpj;
    }

    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public StatusFornecedorEnum getStatusFornecedorEnum() {
        return statusFornecedorEnum;
    }

    public void setStatusFornecedorEnum(StatusFornecedorEnum statusFornecedorEnum) {
        this.statusFornecedorEnum = statusFornecedorEnum;
    }
}
