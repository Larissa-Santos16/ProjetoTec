package org.aula.service;


import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;


@Service
public class ApiCep {
    private WebClient webClient;

    public ApiCep(){
        this.webClient = WebClient.create();
    }
    public String requesicaoCEP(String cep) {
        String url = "https://viacep.com.br/ws/" + cep + "/json/";
        return webClient.get().uri(url).retrieve().bodyToMono(String.class).block();
    }
}