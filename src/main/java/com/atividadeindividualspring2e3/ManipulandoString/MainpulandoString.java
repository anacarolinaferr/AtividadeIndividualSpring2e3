package com.atividadeindividualspring2e3.ManipulandoString;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainpulandoString {

    @GetMapping("/inverte")
    public String nomeInverte(@RequestParam String nome){
        String nomeEntrada;
        nomeEntrada = nome.replace(" ", "").toUpperCase();
        StringBuilder invertido = new StringBuilder(nomeEntrada).reverse();
        return nomeEntrada.equals((String) invertido.toString())?nome+" -> É palíndromo!":invertido+" -> Não é palíndromo!";
    }
}
