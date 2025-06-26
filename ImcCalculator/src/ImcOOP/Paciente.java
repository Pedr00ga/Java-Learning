package ImcOOP;

public class Paciente {
    double altura;
    double peso;

    IndiceMassaCorporal calcularIMC(){
        IndiceMassaCorporal imc = new IndiceMassaCorporal();
        imc.peso = peso;
        imc.altura = altura;
        imc.resultado = peso / (altura * altura);

        return imc;

    }
}
