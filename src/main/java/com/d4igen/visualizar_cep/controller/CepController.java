package com.d4igen.visualizar_cep.controller;

import com.d4igen.visualizar_cep.dto.EnderecoDTO;
import com.d4igen.visualizar_cep.service.CepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cep")
public class CepController {
    @Autowired
    private CepService cepService;
    @GetMapping("/{cep}")
    public EnderecoDTO buscarCep(@PathVariable String cep) {
        return cepService.buscarCEP(cep);
    }
}
