package CalcularAreas;

public class CalculosGerais {

    static double PI = 3.1415;

    double ladoQuadrado;
    double raioCirculo;


    static double areaQuadrado(CalculosGerais calculoQuadrado){
        return calculoQuadrado.ladoQuadrado * calculoQuadrado.ladoQuadrado;
    }
    static double areaCirculo(CalculosGerais calculoCirculo){
        return ((calculoCirculo.raioCirculo * calculoCirculo.raioCirculo) * PI);
    }

}
