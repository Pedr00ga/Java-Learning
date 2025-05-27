import java.util.Scanner;

public class verifAposentadoria {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); //Declara scanner

        System.out.print("Digite a sua idade: ");  //Solicita input de idade e contribuição
        int idadeCliente = scanner.nextInt();

        System.out.print("Digite o tempo de contribuição: ");
        int tempoContribuicao = scanner.nextInt();

        if(idadeCliente >= 55 && tempoContribuicao >= 25){ //Verifica se a idade e o tempo de contribuição são validos
            System.out.println("Parabém, você pode aposentar");
        }else{
            System.out.println("Infelizmente não é possivel aposentar"); //Mensagem se não for valido
        }
    }
}
