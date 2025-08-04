package com.patrick.openfeign.client;

import com.patrick.openfeign.model.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "ibge-api", url = "viacep.com.br/ws")
public interface ViaCepClient {

    @RequestMapping(method = RequestMethod.GET, value = "/{cep}/json")
    Endereco obterEnderecoPorCep(@PathVariable String cep);
}
