package CalcularAreas;

public class Main {
    public static void main(String[] args) {
    CalculosGerais calculo = new CalculosGerais();
    calculo.ladoQuadrado = 5;
    calculo.raioCirculo = 10;

    System.out.println("A área do quadrado é: " + calculo.areaQuadrado(calculo));

    System.out.println("A área do circulo é: " + calculo.areaCirculo(calculo));

    }
}
