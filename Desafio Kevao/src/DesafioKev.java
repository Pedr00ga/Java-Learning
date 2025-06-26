public class DesafioKev {
    public static void main(String[] args) {

        listaCarros lista = new listaCarros();

        Carros carro = new Carros();
        carro.marca = "Ford";
        carro.modelo = "Fusion";
        carro.ano = 2015;
        lista.adicionar(carro);

        carro = new Carros();
        carro.marca = "Chevrolet";
        carro.modelo = "Camaro";
        carro.ano = 2018;
        lista.adicionar(carro);

        carro = new Carros();
        carro.marca = "Fiat";
        carro.modelo = "Uno";
        carro.ano = 2002;
        lista.adicionar(carro);

        carro = new Carros();
        carro.marca = "Porsche";
        carro.modelo = "911";
        carro.ano = 2019;
        lista.adicionar(carro);


        for (int i = 0; i < lista.tamanhoLista; i++){
            System.out.println(lista.lista[i]);

        }
    }
}