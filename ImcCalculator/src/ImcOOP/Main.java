package ImcOOP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Paciente paciente = new Paciente();

        paciente.altura = 1.87;
        paciente.peso = 105;

        IndiceMassaCorporal imc = paciente.calcularIMC();

        System.out.printf("IMC: %.2f%n", imc.resultado);

    }
}
