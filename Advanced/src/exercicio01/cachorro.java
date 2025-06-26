package exercicio01;

public class cachorro {

    public static final int porcentagemTotal = 100;
    String nome;
    pessoa proprietario;
    int idade;
    double valorConsulta;

    double calculaValorConsulta(){
        double valorConsultaFinal = valorConsulta + (valorConsulta * idade / porcentagemTotal);

        return valorConsultaFinal;
    }

}
