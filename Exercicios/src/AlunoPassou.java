import java.util.Scanner;

public class AlunoPassou {

    //Declara constante de nota minima
    static final double NOTA_MINIMA_PARA_PASSAR = 5;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); //Declara scanner
        //Declara variaveis que podem ser utilizadas como inputs no futuro
        double Mat = 7.5;
        double Port = 9;
        double Hist = 5;

        //Realiza o calculo da media
        double NotaFinal = (Mat + Port + Hist) / 3;

        //Verifica a condição e mostra resultados para o usuario
        if (NotaFinal >= NOTA_MINIMA_PARA_PASSAR){
            System.out.println("Parabéns você passou de ano, sua nota é: " + NotaFinal);
        }else
            System.out.println("Infelizmente você reprovou");


    }
}