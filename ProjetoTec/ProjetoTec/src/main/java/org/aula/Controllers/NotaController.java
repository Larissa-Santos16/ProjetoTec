package org.aula.Controllers;

import org.springframework.ui.ModelMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.aula.MedNota;

@Controller
public class NotaController{
    @GetMapping("/Nota")
    public String notas(ModelMap model){
        model.addAttribute("medNota", new MedNota());
        return "MedNota";
    }
    @PostMapping("/Nota")
    public String notas(@ModelAttribute MedNota medNota, ModelMap model){
        model.addAttribute("media", MedNota.CalcMedia());
        return "MedNota";
    }




}
