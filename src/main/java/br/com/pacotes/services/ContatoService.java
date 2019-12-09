package br.com.pacotes.services;

import br.com.pacotes.services.Impl.SalvaContatoPessoa;
import br.com.pacotes.models.Endereco;
import br.com.pacotes.models.Pessoa;
import org.springframework.stereotype.Service;

@Service
public class ContatoService implements SalvaContatoPessoa {

    private PessoaService pessoaService = new PessoaService();

    private EnderecoService enderecoService = new EnderecoService();


    @Override
    public void SalvaContatoPessoa(Pessoa pessoa, Endereco endereco) {
        Pessoa pessoas = pessoaService.getPessoa(null);
        Endereco enderecos = enderecoService.getEndereco(endereco.getRua());
    }
}

