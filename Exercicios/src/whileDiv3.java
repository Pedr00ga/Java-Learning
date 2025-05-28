public class whileDiv3 {
    public static void main(String[] args){

        int[] numeros = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 }; //declara o array
        //Inicializa a variavel para o while
        int i = 0;

        //Estrutura a condição do while
        while(i < numeros.length){
            int numero = numeros[i];
            int divisivel = numero % 3;
            if (divisivel == 0) {
                System.out.println(numero);

            }
            i++; //incrementa
        }





    }
}
