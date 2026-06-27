package com.d4igen.visualizar_cep.service;

import com.d4igen.visualizar_cep.dto.EnderecoDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class CepService {
    private List<String> historico = new ArrayList<>();
    private static final String VIA_CEP_URL = "https://viacep.com.br/ws/{cep}/json/";

    public EnderecoDTO buscarCEP(String cep) {
        RestTemplate restTemplate = new RestTemplate();
        historico.add(cep);
        return restTemplate.getForObject(VIA_CEP_URL, EnderecoDTO.class, cep);
    }
    public List getHistorico() {
        return historico;
    }
}
