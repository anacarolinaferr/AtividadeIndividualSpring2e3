package com.atividadeindividualspring2e3.Retangulo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/retangulo")
public class Retangulo {

    @GetMapping("/areaTotal/{ladoA}/{ladoB}")
    public String retangulo(@PathVariable Double ladoA, @PathVariable Double ladoB) {
        double areaTotal = RetanguloUtil.calculaArea(ladoA, ladoB);
        return "A área do retangulo é: " + areaTotal;
    }

    @GetMapping("/perimetro/{ladoA}/{ladoB}")
    public String perimetro(@PathVariable Double ladoA, @PathVariable Double ladoB) {
        double perimetro = RetanguloUtil.calculaPerimetro(ladoA, ladoB);
        return "O perímetro do retangulo é: " + perimetro;
    }

    @GetMapping("/quantidadepiso/{areaLajota}/{areaTotal}")
    public String quantidadePiso(@PathVariable Double areaLajota, @PathVariable Double areaTotal) {
        double qtdPisos = areaTotal/areaLajota;
        return "A quantidade de piso é: " + qtdPisos;
    }

    @GetMapping("/quatidadeRodape/{comprimentoLajota}/{perimetro}")
    public String quantidadeRodape(@PathVariable Double comprimentoLajota, @PathVariable Double perimetro) {
        double qtdRodapes = perimetro/comprimentoLajota;
        return "A quantidade de rodapés é: " + qtdRodapes;
    }
}