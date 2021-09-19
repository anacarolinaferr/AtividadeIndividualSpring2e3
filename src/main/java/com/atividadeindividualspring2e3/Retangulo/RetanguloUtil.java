package com.atividadeindividualspring2e3.Retangulo;

public class RetanguloUtil {

    public static double calculaArea(double ladoA, double ladoB){
        double area = ladoA*ladoB;
        return area;
    }

    public static double calculaPerimetro(double ladoA, double ladoB){
        double perimetro = (ladoA*2)+(ladoB*2);
        return perimetro;
    }

    public static void quantidadePiso(double areaLajota, double areaTotal){
        double qtdPisos = areaTotal/areaLajota;
        System.out.println("Quantidade de pisos é: "+qtdPisos);
    }

    public static void quatidadeRodape(double comprimentoLajota , double perimetro){
        double qtdRodapes = perimetro/comprimentoLajota;
        System.out.println("Quantidades de rodapés: "+qtdRodapes);
    }
}
