package org.aula.Controllers;

import org.aula.Cep;
import org.springframework.ui.ModelMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.aula.service.ApiCep;


@Controller
public class CepController {

    @GetMapping("/cep")
    public String cep(ModelMap model){
        model.addAttribute("cep", new Cep());
        return "ViaCEP";
    }
    @PostMapping("/cep")
    public String cep(@ModelAttribute Cep cep, ModelMap model){
        String request = ApiCep.requesicaoCEP(cep.getCep());
        model.addAttribute("request", request);
        return "ViaCEP";
    }
}
