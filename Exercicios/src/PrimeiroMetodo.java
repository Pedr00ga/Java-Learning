import java.util.Scanner;

public class PrimeiroMetodo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        imprimirTraco();

        String[] cursos = new String[] {"Java EE", "Spring", "Java OO Avançado"};

        System.out.println("Escolha dentre os cursos abaixo: ");

        for(int i = 0; i < cursos.length; i++) {
            System.out.println("[" + i + "] " + cursos[i]);
        }

        System.out.print("O curso que você deseja é o: ");
        Integer posicaoCursoEscolhido = scanner.nextInt();

        Boolean posicaoValida = verificaCondicao(posicaoCursoEscolhido, cursos);

        naoPode(posicaoValida);

        imprimirTraco();

        String[] formasPagamento = new String[] {"Cartão", "Boleto"};

        System.out.println("Escolha dentre as formas de pagamento abaixo: ");

        for(int i = 0; i < formasPagamento.length; i++) {
            System.out.println("[" + i + "] " + formasPagamento[i]);
        }

        System.out.print("Sua forma de pagamento escolhida é: ");
        Integer posicaoFormaPagamentoEscolhida = scanner.nextInt();

        posicaoValida = verificaCondicao(posicaoFormaPagamentoEscolhida, formasPagamento);

        naoPode(posicaoValida);

        String cursoEscolhido = cursos[posicaoCursoEscolhido];
        String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];

        imprimirTraco();

        System.out.println("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento é " + formaPagamentoEscolhida);

        scanner.close();
    }
    public static void naoPode(boolean posicaoValida){
        if (!posicaoValida) {
            System.err.println("Posição inválida!");
            System.exit(1);
        }
    }
    public static Boolean verificaCondicao(Integer posicao, String[] vetor){
        Boolean valida = posicao >= 0 && posicao < vetor.length;
        return valida;
    }

    static void imprimirTraco() {
        System.out.println("----------------------------------------------");
    }
}