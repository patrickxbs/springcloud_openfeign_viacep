package com.patrick.openfeign.service;

import com.patrick.openfeign.client.ViaCepClient;
import com.patrick.openfeign.model.Endereco;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService {

    private final ViaCepClient viaCepClient;

    public EnderecoService(ViaCepClient viaCepClient) {
        this.viaCepClient = viaCepClient;
    }

    public Endereco buscarEnderecoPorCep(String cep) {
        return viaCepClient.obterEnderecoPorCep(cep);
    }
}
