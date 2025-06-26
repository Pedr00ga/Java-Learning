package OrientacaoObjetos.src.metodoInstancia;

public class Cliente {

    String primeiroNome;
    String sobreNome;
    String telefone;
    String email;

    String obterNomeCompletoCliente (){
        String nomeCompleto = primeiroNome + " " + sobreNome;

        return nomeCompleto;
    }
    String obterDDD(){
        String ddd = telefone.substring(0, 2);
        return ddd;
    }

}
