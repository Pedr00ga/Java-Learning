package OrientacaoObjetos.src.metodoInstancia;

public class metodoInstancia {
    public static void main(String[] args) {

        OrientacaoObjetos.src.metodoInstancia.Cliente cliente = new Cliente();

        cliente.primeiroNome = "Pedro";
        cliente.sobreNome = "Gonzales";
        cliente.telefone = "190000000";
        cliente.email = "plgonzales4760@gmail.com";

        OrientacaoObjetos.src.metodoInstancia.Cliente cliente2 = new Cliente();
        cliente2.primeiroNome = "Amanda";
        cliente2.sobreNome = "Paschoalin";
        cliente2.telefone = "190000000";
        cliente2.email = "aloneatthesea@gmail.com";

        System.out.println("O nome do cliente é: " + cliente.obterNomeCompletoCliente() + " O DDD do cliente é: " + cliente.obterDDD());
        System.out.println("O nome do cliente é: " + cliente2.obterNomeCompletoCliente() + " O DDD do cliente é: " + cliente2.obterDDD());


    }
//    static String obterNomeCompletoCliente (Cliente cliente){
//        String nomeCompleto = cliente.primeiroNome + " " + cliente.sobreNome;
//
//        return nomeCompleto;
}
