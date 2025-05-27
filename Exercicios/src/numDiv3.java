public class numDiv3 {
    public static void main(String[] args){

        int[] numeros = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 }; //declara o array
        for (int i = 0; i < numeros.length; i++){  //Declara loop
             int divisivel = numeros[i];  //Cria uma variavel para armazenar qual numero está em qual index
            if (divisivel % 3 == 0){  //Verifica se o numero da variavel divisivel é divisivel por 3
                System.out.println(divisivel); //Mostra os resultados divisiveis por 3
            }
        }

    }
}
