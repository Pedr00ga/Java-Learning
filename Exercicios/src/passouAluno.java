import java.util.Scanner;

public class passouAluno {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); //Declara scanner

        //Declara variaveis de nota minima por materia e nota de corte para passar da materia
        int notaMinima = 60;
        int notaCorte = 150;


        //Solicita inputs das notas do aluno das materias
        System.out.print("Digite a nota de matematica: ");
        double notaMat = scanner.nextDouble();
        System.out.print("Digite a nota de portugues: ");
        double notaPort = scanner.nextDouble();

        //Declara variavel nota final e faz o calculo da soma das notas
        double notaFinal = notaMat + notaPort;

        //Verifica se as condições necessarias são verdadeiras pelo menos as 2 notas acima de 60 e para passar nota acima de 150
        Boolean consegueVaga = notaMat > notaMinima && notaPort  > notaMinima;
        Boolean passou = notaFinal > notaCorte;

        //Executa condições e mostra resultados
        if (passou && consegueVaga){
            System.out.println("Parabéns, você passou no concurso");
        }else{
            System.out.println("Infelizmente você não passou");
        }



    }
}
